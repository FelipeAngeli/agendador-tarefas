package com.felipe.agendadortarefas.business;

import com.felipe.agendadortarefas.business.dto.TarefasDTO;
import com.felipe.agendadortarefas.business.mapper.TarefaUpDateConverter;
import com.felipe.agendadortarefas.business.mapper.TarefasConverter;
import com.felipe.agendadortarefas.infrastructure.entity.TarefasEntity;
import com.felipe.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import com.felipe.agendadortarefas.infrastructure.exceptions.ResourceNotFoundExceptions;
import com.felipe.agendadortarefas.infrastructure.repository.TarefasRepository;
import com.felipe.agendadortarefas.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefaConverter;
    private final JwtUtil jwtUtil;
    private final TarefaUpDateConverter tarefaUpDateConverter;

    public TarefasDTO gravarTarefa(String token, TarefasDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity entity = tarefaConverter.paraTarefaEntity(dto);

        return tarefaConverter.paraTarefaDTO(tarefasRepository.save(entity));
    }

    public List<TarefasDTO> buscaTarefaAgendadasPorPeriodo(LocalDateTime dataInicial, LocalDateTime dataFinal){
        return tarefaConverter.paraListaTarefasDTO(tarefasRepository.findByDataEventoBetweenAndStatusNotificacaoEnum(
                dataInicial, dataFinal, StatusNotificacaoEnum.PENDENTE));
    }

    public List<TarefasDTO> buscaTarefasPorEmail(String token){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        List<TarefasEntity> listaTarefas = tarefasRepository.findByEmailUsuario(email);
        return tarefaConverter.paraListaTarefasDTO(listaTarefas);
    }

    public void deletaTarefaporId(String id){
        try {
            tarefasRepository.deleteById(id);
        } catch (ResourceNotFoundExceptions e){
            throw  new ResourceNotFoundExceptions("Erro ao deletar tarefa por id, id inexistente "
                    + id, e.getCause());
        }
    }

    public TarefasDTO alteraStatus(StatusNotificacaoEnum status, String id){
        try {
            TarefasEntity entity = tarefasRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExceptions(
                    "Tarefa não encontrada " + id));
            entity.setStatusNotificacaoEnum(status);
           return tarefaConverter.paraTarefaDTO(tarefasRepository.save(entity));
        } catch (ResourceNotFoundExceptions e){
            throw new ResourceNotFoundExceptions("Erro ao alterar status da tarefa " + e.getCause());
        }
    }

    public TarefasDTO upDateTarefas(TarefasDTO dto, String id){
        try {
            TarefasEntity entity = tarefasRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExceptions(
                    "Tarefa não encontrada " + id));
            tarefaUpDateConverter.upDateTarefas(dto, entity);
           return tarefaConverter.paraTarefaDTO(tarefasRepository.save(entity));

        } catch (ResourceNotFoundExceptions e){
            throw new ResourceNotFoundExceptions("Erro ao alterar status da tarefa " + e.getCause());
        }
    }
}

package com.felipe.agendadortarefas.business.mapper;

import com.felipe.agendadortarefas.business.dto.TarefasDTO;
import com.felipe.agendadortarefas.infrastructure.entity.TarefasEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-07T10:56:34-0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.12.1.jar, environment: Java 17.0.14 (Homebrew)"
)
@Component
public class TarefasConverterImpl implements TarefasConverter {

    @Override
    public TarefasEntity paraTarefaEntity(TarefasDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TarefasEntity.TarefasEntityBuilder tarefasEntity = TarefasEntity.builder();

        tarefasEntity.id( dto.getId() );
        tarefasEntity.nomeTarefa( dto.getNomeTarefa() );
        tarefasEntity.descricao( dto.getDescricao() );
        tarefasEntity.dataCriacao( dto.getDataCriacao() );
        tarefasEntity.dataEvento( dto.getDataEvento() );
        tarefasEntity.emailUsuario( dto.getEmailUsuario() );
        tarefasEntity.dataAlterecao( dto.getDataAlterecao() );
        tarefasEntity.statusNotificacaoEnum( dto.getStatusNotificacaoEnum() );

        return tarefasEntity.build();
    }

    @Override
    public TarefasDTO paraTarefaDTO(TarefasEntity entity) {
        if ( entity == null ) {
            return null;
        }

        TarefasDTO.TarefasDTOBuilder tarefasDTO = TarefasDTO.builder();

        tarefasDTO.id( entity.getId() );
        tarefasDTO.nomeTarefa( entity.getNomeTarefa() );
        tarefasDTO.descricao( entity.getDescricao() );
        tarefasDTO.dataCriacao( entity.getDataCriacao() );
        tarefasDTO.dataEvento( entity.getDataEvento() );
        tarefasDTO.emailUsuario( entity.getEmailUsuario() );
        tarefasDTO.dataAlterecao( entity.getDataAlterecao() );
        tarefasDTO.statusNotificacaoEnum( entity.getStatusNotificacaoEnum() );

        return tarefasDTO.build();
    }
}

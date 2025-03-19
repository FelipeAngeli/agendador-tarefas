package com.felipe.agendadortarefas.business.mapper;

import com.felipe.agendadortarefas.business.dto.TarefasDTO;
import com.felipe.agendadortarefas.infrastructure.entity.TarefasEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-12T14:38:13-0300",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250213-2037, environment: Java 21.0.6 (Eclipse Adoptium)"
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
        tarefasEntity.dataEvento( dto.getDataEvento() );
        tarefasEntity.dataCriacao( dto.getDataCriacao() );
        tarefasEntity.dataAlterecao( dto.getDataAlterecao() );
        tarefasEntity.descricao( dto.getDescricao() );
        tarefasEntity.emailUsuario( dto.getEmailUsuario() );
        tarefasEntity.nomeTarefa( dto.getNomeTarefa() );
        tarefasEntity.statusNotificacaoEnum( dto.getStatusNotificacaoEnum() );

        return tarefasEntity.build();
    }

    @Override
    public TarefasDTO paraTarefaDTO(TarefasEntity entity) {
        if ( entity == null ) {
            return null;
        }

        TarefasDTO.TarefasDTOBuilder tarefasDTO = TarefasDTO.builder();

        tarefasDTO.dataAlterecao( entity.getDataAlterecao() );
        tarefasDTO.dataCriacao( entity.getDataCriacao() );
        tarefasDTO.dataEvento( entity.getDataEvento() );
        tarefasDTO.descricao( entity.getDescricao() );
        tarefasDTO.emailUsuario( entity.getEmailUsuario() );
        tarefasDTO.id( entity.getId() );
        tarefasDTO.nomeTarefa( entity.getNomeTarefa() );
        tarefasDTO.statusNotificacaoEnum( entity.getStatusNotificacaoEnum() );

        return tarefasDTO.build();
    }

    @Override
    public List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<TarefasEntity> list = new ArrayList<TarefasEntity>( dtos.size() );
        for ( TarefasDTO tarefasDTO : dtos ) {
            list.add( paraTarefaEntity( tarefasDTO ) );
        }

        return list;
    }

    @Override
    public List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TarefasDTO> list = new ArrayList<TarefasDTO>( entities.size() );
        for ( TarefasEntity tarefasEntity : entities ) {
            list.add( paraTarefaDTO( tarefasEntity ) );
        }

        return list;
    }
}

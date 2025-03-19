package com.felipe.agendadortarefas.business.mapper;

import com.felipe.agendadortarefas.business.dto.TarefasDTO;
import com.felipe.agendadortarefas.infrastructure.entity.TarefasEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-12T14:38:12-0300",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250213-2037, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class TarefaUpDateConverterImpl implements TarefaUpDateConverter {

    @Override
    public void upDateTarefas(TarefasDTO dto, TarefasEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getDataAlterecao() != null ) {
            entity.setDataAlterecao( dto.getDataAlterecao() );
        }
        if ( dto.getDataCriacao() != null ) {
            entity.setDataCriacao( dto.getDataCriacao() );
        }
        if ( dto.getDataEvento() != null ) {
            entity.setDataEvento( dto.getDataEvento() );
        }
        if ( dto.getDescricao() != null ) {
            entity.setDescricao( dto.getDescricao() );
        }
        if ( dto.getEmailUsuario() != null ) {
            entity.setEmailUsuario( dto.getEmailUsuario() );
        }
        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getNomeTarefa() != null ) {
            entity.setNomeTarefa( dto.getNomeTarefa() );
        }
        if ( dto.getStatusNotificacaoEnum() != null ) {
            entity.setStatusNotificacaoEnum( dto.getStatusNotificacaoEnum() );
        }
    }
}

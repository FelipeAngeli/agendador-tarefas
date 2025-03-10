package com.felipe.agendadortarefas.business.mapper;

import com.felipe.agendadortarefas.business.dto.TarefasDTO;
import com.felipe.agendadortarefas.infrastructure.entity.TarefasEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-10T14:04:27-0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.12.1.jar, environment: Java 17.0.14 (Homebrew)"
)
@Component
public class TarefaUpDateConverterImpl implements TarefaUpDateConverter {

    @Override
    public void upDateTarefas(TarefasDTO dto, TarefasEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getNomeTarefa() != null ) {
            entity.setNomeTarefa( dto.getNomeTarefa() );
        }
        if ( dto.getDescricao() != null ) {
            entity.setDescricao( dto.getDescricao() );
        }
        if ( dto.getDataCriacao() != null ) {
            entity.setDataCriacao( dto.getDataCriacao() );
        }
        if ( dto.getDataEvento() != null ) {
            entity.setDataEvento( dto.getDataEvento() );
        }
        if ( dto.getEmailUsuario() != null ) {
            entity.setEmailUsuario( dto.getEmailUsuario() );
        }
        if ( dto.getDataAlterecao() != null ) {
            entity.setDataAlterecao( dto.getDataAlterecao() );
        }
        if ( dto.getStatusNotificacaoEnum() != null ) {
            entity.setStatusNotificacaoEnum( dto.getStatusNotificacaoEnum() );
        }
    }
}

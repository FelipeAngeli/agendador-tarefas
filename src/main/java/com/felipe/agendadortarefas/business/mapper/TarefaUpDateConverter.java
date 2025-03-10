package com.felipe.agendadortarefas.business.mapper;

import com.felipe.agendadortarefas.business.dto.TarefasDTO;
import com.felipe.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpDateConverter {
    void upDateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);

}

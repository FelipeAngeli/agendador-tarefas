package com.felipe.agendadortarefas.business.mapper;

import com.felipe.agendadortarefas.business.dto.TarefasDTO;
import com.felipe.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}

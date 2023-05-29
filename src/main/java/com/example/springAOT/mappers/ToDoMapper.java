package com.example.springAOT.mappers;

import com.example.springAOT.entities.ToDo;
import com.example.springAOT.responses.ToDoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ToDoMapper {
    ToDoResponse ToDotoResponse (ToDo todo);
}

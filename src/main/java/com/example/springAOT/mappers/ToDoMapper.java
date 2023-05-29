package com.example.springAOT.mappers;

import com.example.springAOT.entities.ToDo;
import com.example.springAOT.responses.ToDoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ToDoMapper {
    @Mapping(source = "content", target = "toDoContent")
    @Mapping(target ="idAndTitle",expression = "java(todo.getId()+ \" \" + todo.getTitle())" )
    ToDoResponse ToDotoResponse (ToDo todo);
}

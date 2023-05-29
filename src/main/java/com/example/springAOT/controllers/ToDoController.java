package com.example.springAOT.controllers;

import com.example.springAOT.entities.ToDo;
import com.example.springAOT.responses.ToDoResponse;
import com.example.springAOT.services.ToDoService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ToDoController {
    @Autowired
    ObjectMapper mapper;
    @Autowired
    ToDoService toDoService;
    @PostMapping("/createToDo")
    public ResponseEntity<ToDoResponse> createToDo(@RequestBody ToDo newToDo){

        return  ResponseEntity.ok(toDoService.createTodo(newToDo));
    }
    @GetMapping("/readToDo")
    public ResponseEntity<String> readToDo(){
        return  ResponseEntity.ok("readToOD");
    }
    @PostMapping("updateTodo")
    public ResponseEntity<String> updateToDo(){
        return  ResponseEntity.ok("updateTodo");
    }
    public ResponseEntity<String> deleteToDo(){
        return  ResponseEntity.ok("deleteTodo");
    }
    @GetMapping("/getAllToDo")
    public ResponseEntity<List<ToDo>> getAllToDO(){
        return  ResponseEntity.ok(toDoService.getAllToDo());
    }
    public ResponseEntity<String> getToDoById(){
        return  ResponseEntity.ok("getToDoById");
    }

    @GetMapping("/concat")
    public ResponseEntity<String > concat(@RequestBody JsonNode node){

        return ResponseEntity.ok(toDoService.concatWork(node.get("item1").asText(),node.get("item2").asText()));
    }
}

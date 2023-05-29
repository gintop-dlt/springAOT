package com.example.springAOT.services;

import com.example.springAOT.entities.ToDo;
import com.example.springAOT.mappers.ToDoMapper;
import com.example.springAOT.repositories.ToDORepository;
import com.example.springAOT.responses.ToDoResponse;
import com.example.springAOT.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    ToDORepository toDORepository;
    @Autowired
    private ToDoMapper toDoMapper;
    public ToDoResponse createTodo(ToDo newToDo){
       return toDoMapper.ToDotoResponse(toDORepository.save(newToDo));

    }
    public List<ToDo> getAllToDo(){
        return toDORepository.findAll();

    }
    public String concatWork(String item1, String item2){
        String concatClas="com.example.springAOT.utils.MyUtils";
        String result ="";
        try {
            MyUtils instance = (MyUtils) Class.forName(concatClas)
                    .getConstructor()
                    .newInstance();
             result = instance.concat(item1, item2);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  result;


    }
}

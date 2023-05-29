package com.example.springAOT.responses;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class ToDoResponse {
    private Long id;
    private String title;
    private String content;
    public ToDoResponse(){

    }
}

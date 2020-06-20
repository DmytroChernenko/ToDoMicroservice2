package com.quicktutorialz.learnmicroservices.ToDoMicroservice.service;

import com.quicktutorialz.learnmicroservices.ToDoMicroservice.entity.ToDo;

import java.util.List;

public interface ToDoService {

    List<ToDo> getToDos(String email);

    ToDo addToDo(ToDo toDo);

    void deleteToDo(Integer id);
}

package com.quicktutorialz.learnmicroservices.ToDoMicroservice.dao;

import com.quicktutorialz.learnmicroservices.ToDoMicroservice.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoDao extends JpaRepository<ToDo, Integer> {

    //name strategy
    List<ToDo> findByFkUser(String email);
}
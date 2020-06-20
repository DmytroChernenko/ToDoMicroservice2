package com.quicktutorialz.learnmicroservices.ToDoMicroservice.controllers;


import com.quicktutorialz.learnmicroservices.ToDoMicroservice.entity.ToDo;
import org.springframework.web.bind.annotation.RequestMapping;
import com.quicktutorialz.learnmicroservices.ToDoMicroservice.entity.User;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@org.springframework.web.bind.annotation.RestController
public class AnyOtherController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "hello";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser() {
        return new User("mitresko12@gmail.com", "mitresko", "fuck");
    }

    @RequestMapping(value = "/todo", method = RequestMethod.POST)
    public String toDo(@Valid ToDo todo) {
        return "If you see this, it was POST request " + todo.getDescription() + " and " + todo.getFkUser();
    }

}

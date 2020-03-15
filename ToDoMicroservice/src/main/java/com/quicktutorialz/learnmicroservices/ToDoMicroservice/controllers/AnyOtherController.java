package com.quicktutorialz.learnmicroservices.ToDoMicroservice.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import com.quicktutorialz.learnmicroservices.ToDoMicroservice.entities.User;

@org.springframework.web.bind.annotation.RestController
public class AnyOtherController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @RequestMapping("/user")
    public User getUser() {
        return new User("mitresko12@gmail.com", "mitresko", "fuck");
    }


}

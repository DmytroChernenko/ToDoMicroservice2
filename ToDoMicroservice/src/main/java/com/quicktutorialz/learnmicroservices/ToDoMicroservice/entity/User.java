package com.quicktutorialz.learnmicroservices.ToDoMicroservice.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String password;


}

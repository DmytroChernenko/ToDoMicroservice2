package com.quicktutorialz.learnmicroservices.ToDoMicroservice.utilities;

import com.quicktutorialz.learnmicroservices.ToDoMicroservice.entity.ToDo;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


//SPRING VALIDATOR
public class ToDoValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return ToDo.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        ToDo toDo = (ToDo) obj;

        String priority = toDo.getPriority();

        if(!"high".equals(priority) && !"low".equals(priority)){
            errors.rejectValue("priority", "Priority must be 'high' or 'low'!");
        }

    }
}
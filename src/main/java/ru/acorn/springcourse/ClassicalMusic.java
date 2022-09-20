package ru.acorn.springcourse;

import org.springframework.stereotype.Component;

@Component("classicalMusic")  //ID Component создает bean
public class ClassicalMusic implements Music{

    public ClassicalMusic(){

    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian rhapsody";
    }
}

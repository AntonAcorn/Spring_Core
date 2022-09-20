package ru.acorn.springcourse;

import org.springframework.stereotype.Component;

 //ID Component создает bean
@Component
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

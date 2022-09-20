package ru.acorn.springcourse;

import org.springframework.stereotype.Component;

@Component  //ID "rockMusic". Component создает bean
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}

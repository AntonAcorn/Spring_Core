package ru.acorn.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component  //ID "rockMusic". Component создает bean
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Nothing else matters");
        songs.add("Wind Cries Mary");
        songs.add("Back to USSR");
    }


    @Override
    public List<String> getSong() {
        return songs;
    }
}


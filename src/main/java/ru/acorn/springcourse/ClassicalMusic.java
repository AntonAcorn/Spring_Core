package ru.acorn.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//ID Component создает bean
@Component
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Hungarian rhapsody");
        songs.add("Moonlight sonata");
        songs.add("Turkish March");
    }



    public ClassicalMusic(){
    }


    @Override
    public List<String> getSong() {
        return songs;
    }
}

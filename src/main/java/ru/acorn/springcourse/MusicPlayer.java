package ru.acorn.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {


    private Music music;

    @Autowired
    public MusicPlayer(Music music){
        this.music = music;
    }

public void playMusic(){
        System.out.println("playing " + music.getSong());
    }
}




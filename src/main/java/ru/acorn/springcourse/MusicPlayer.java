package ru.acorn.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
//private ClassicalMusic classicalMusic;
//private RockMusic rockMusic;


    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicGenre musicGenre){
        Random random = new Random();
        int randomInt = random.nextInt(3);
        switch (musicGenre) {
            case ROCK -> System.out.println(music1.getSong().get(randomInt));
            case CLASSICAL -> System.out.println(music2.getSong().get(randomInt));
        }


    }
}




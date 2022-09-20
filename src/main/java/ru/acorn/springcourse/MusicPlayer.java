package ru.acorn.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    //private List<Music> musicList = new ArrayList<>();

    //private Music music; //зависомость dependency
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}



//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }




//
//    public void playMusicList(){
//        for (Music music: musicList
//             ) {
//            System.out.println("Playing " + music.getSong());
//        }
//    }
//
//}

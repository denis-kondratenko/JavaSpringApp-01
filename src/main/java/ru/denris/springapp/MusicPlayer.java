package ru.denris.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

@Component("musicPlayerBean")
public class MusicPlayer {
    //private Music music;
    //@Autowired
    //@Qualifier("rockMusicBean")
    private List<Music> musicList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
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
    //@Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    //Inversion of control
    @Autowired
    public MusicPlayer(@Qualifier("rockMusicBean") List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public void playMusic(){
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    //любой модификатор доступа
    @PostConstruct
    private void doingPostCreate(){
        System.out.println("Doing MusicPlayer post-creation");
    }
    //вызывается только у singleton
    @PreDestroy
    private void doingPreDestroy(){
        System.out.println("Doing MusicPlayer pre-destroying");
    }
}

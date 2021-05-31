package ru.denris.springapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rockMusicBean")//можно без id, тогда он автоматом будет rockMusic
@Scope("prototype")
public class RockMusic implements Music{
    private static int count;
    private String name;

    public RockMusic() {
        count ++;
        this.name = "Rock song "+count;
    }

    @Override
    public String getSong() {
        //return "Rock song 1";
        return this.name;
    }
}

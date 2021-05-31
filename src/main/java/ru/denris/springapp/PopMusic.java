package ru.denris.springapp;

import org.springframework.stereotype.Component;

@Component("popMusicBean")
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Bad song 1";
    }
}

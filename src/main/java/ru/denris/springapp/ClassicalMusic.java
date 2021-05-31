package ru.denris.springapp;

import org.springframework.stereotype.Component;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music{

    private ClassicalMusic(){}

    //factory-method если scope="singleton", то новый объект все равно не создаст
    public static ClassicalMusic getClassicalMusic(){
        System.out.println("Doing ClassicalMusic factory method");
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Classical song 1";
    }
}

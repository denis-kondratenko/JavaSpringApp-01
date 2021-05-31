package ru.denris.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music music = context.getBean("musicBean",Music.class);

        //Inversion of control
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean",MusicPlayer.class);
        System.out.println(musicPlayer.getName() + " volume:" + musicPlayer.getVolume());
        musicPlayer.playMusic();

        context.close();
    }
}

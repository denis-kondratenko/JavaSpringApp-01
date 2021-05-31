package ru.denris.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //Music music = context.getBean("musicBean",Music.class);
        //Inversion of control
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean",MusicPlayer.class);
        System.out.println(musicPlayer.getName() + " volume:" + musicPlayer.getVolume());
        musicPlayer.playMusic();

        context.close();
    }
}

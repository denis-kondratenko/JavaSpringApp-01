package ru.denris.springapp;

import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("ru.denris.springapp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return ClassicalMusic.getClassicalMusic();
    }
    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }
    @Bean
    @Scope("prototype")
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public List<Music> musicList(){
        return Arrays.asList(rockMusic(),classicalMusic(),popMusic(),rockMusic());
    }
    @Bean("musicPlayerBean")
    MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

}

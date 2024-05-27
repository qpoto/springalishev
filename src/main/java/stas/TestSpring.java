package stas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static stas.Genre.CLASSICAL;
import static stas.Genre.ROCK;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(ROCK));
        context.close();
    }
}

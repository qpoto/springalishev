package stas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean eq = musicPlayer == musicPlayer1;
        System.out.println(eq);

        System.out.println(musicPlayer);
        System.out.println(musicPlayer1);

        musicPlayer.setVolume(10);

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer1.getVolume());
        context.close();
    }
}

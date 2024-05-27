package stas;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

import static stas.Genre.CLASSICAL;

@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;

    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    private Music music;

    public String playMusic(Genre genre) {
        String track = "";
        int random = new Random().nextInt(3);
        if (genre.equals(CLASSICAL)) {
            track = classicalMusic.getSong().get(random);
        } else {
            track = rockMusic.getSong().get(random);
        }
        return track;
    }
}

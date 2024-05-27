package stas;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

import static stas.Genre.CLASSICAL;
import static stas.Genre.ROCK;

@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;

    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(Genre genre) {
        if (genre.equals(CLASSICAL)) {
            return classicalMusic.getSong().get(new Random().nextInt(classicalMusic.getSong().size()));
        } else if (genre.equals(ROCK)){
            return rockMusic.getSong().get(new Random().nextInt(rockMusic.getSong().size()));
        } else {
            throw new IllegalArgumentException("Такого жанра нет");
        }
    }
}

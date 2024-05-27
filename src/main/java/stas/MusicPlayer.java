package stas;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private List<Music> genreList;


    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    public String playMusic() {
        return genreList.get(new Random().nextInt(genreList.size())).getSong();
    }


}

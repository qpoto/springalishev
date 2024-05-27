package stas;

public class Computer {
    int id;
    MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer" + id + " " + musicPlayer.playMusic();
    }
}

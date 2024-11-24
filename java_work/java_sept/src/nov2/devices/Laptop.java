package nov2.devices;

import nov2.media.*;

public class Laptop extends Camera implements Calculator, WebBrowser, AudioPlayer, VideoPlayer {
    @Override
    public void takePhoto() {
        System.out.println("take photos");

    }

    @Override
    public void takeVideo() {
        System.out.println("take videos");

    }

    @Override
    public void selfie() {
        System.out.println("take selfies");

    }

    @Override
    public void potrait() {
        System.out.println("use portrait");

    }

    @Override
    public void shuffle() {
        System.out.println("use shuffle option");

    }

    @Override
    public void createPlaylist() {
        System.out.println("make a play list");

    }

    @Override
    public void sum() {
        System.out.println("ADD");

    }

    @Override
    public void subtract() {
        System.out.println("SUB");

    }

    @Override
    public void multiply() {
        System.out.println("MULTIPLY");

    }

    @Override
    public void divide() {
        System.out.println("DIVIDE");

    }

    @Override
    public void fastForward() {
        System.out.println("FAST FORWARD");

    }

    @Override
    public void replay() {
        System.out.println("REPLAY");

    }

    @Override
    public void play() {
        System.out.println("PLAY MUSIC");

    }

    @Override
    public void stop() {
        System.out.println("STOP MUSIC");

    }

    @Override
    public void pause() {
        System.out.println("PAUSE MUSIC");

    }

    @Override
    public void surfing() {
        System.out.println("SURFING");

    }

    @Override
    public void searchGoogle() {
        System.out.println("SEARCH");

    }

    @Override
    public void playYouTube() {
        System.out.println("YOU TUBE");

    }
}

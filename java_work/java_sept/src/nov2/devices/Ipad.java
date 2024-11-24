package nov2.devices;

import nov2.media.*;

public class Ipad extends Camera implements AudioPlayer, VideoPlayer, WebBrowser, Calculator {
    @Override
    public void shuffle() {
        System.out.println("you can shuffle your music");
    }

    @Override
    public void createPlaylist() {
        System.out.println("you can create your own list of songs");

    }

    @Override
    public void sum() {
        System.out.println("you can add numbers");

    }

    @Override
    public void subtract() {
        System.out.println("you can subtract numbers");

    }

    @Override
    public void multiply() {
        System.out.println("you can multiply numbers");

    }

    @Override
    public void divide() {
        System.out.println("you can divide the numbers");

    }

    @Override
    public void takePhoto() {
        System.out.println("you can take photos");

    }

    @Override
    public void takeVideo() {
        System.out.println("you can make videos");

    }

    @Override
    public void selfie() {
        System.out.println("you can take your selfies");

    }

    @Override
    public void potrait() {
        System.out.println("you can use portrait for clicking pictures");

    }

    @Override
    public void fastForward() {
        System.out.println("you can use fast forward option also");

    }

    @Override
    public void replay() {
        System.out.println("you can listen your music again");

    }

    @Override
    public void play() {
        System.out.println("you can play any kind of music");

    }

    @Override
    public void stop() {
        System.out.println("you can stop your music when you want");

    }

    @Override
    public void pause() {
        System.out.println("you can pause your musoc also");

    }

    @Override
    public void surfing() {
        System.out.println("you can do surfing also");

    }

    @Override
    public void searchGoogle() {
        System.out.println("you can search anything");

    }

    @Override
    public void playYouTube() {
        System.out.println("you can watch you tube also");

    }
}

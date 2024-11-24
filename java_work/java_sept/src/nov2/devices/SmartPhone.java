package nov2.devices;

import nov2.media.*;

public class SmartPhone extends Camera implements  AudioPlayer,VideoPlayer,Calculator,WebBrowser,MobilePhone{

    @Override
    public void makeCalls() {
        System.out.println("you can make calls");
    }

    @Override
    public void sendTexts() {
        System.out.println("you can send text messages");

    }

    @Override
    public void shuffle() {
        System.out.println("shuffle your music");

    }

    @Override
    public void createPlaylist() {
        System.out.println("CREATE PLAYLIST");

    }

    @Override
    public void sum() {
        System.out.println("DO SUM");

    }

    @Override
    public void subtract() {
        System.out.println("DO SUB");

    }

    @Override
    public void multiply() {
        System.out.println("DO MUL");

    }

    @Override
    public void divide() {
        System.out.println("DO DIV");

    }

    @Override
    public void takePhoto() {
        System.out.println("take your pictures");

    }

    @Override
    public void takeVideo() {
        System.out.println("make videos");

    }

    @Override
    public void selfie() {
        System.out.println("take a selfie");

    }

    @Override
    public void potrait() {
        System.out.println("use portrait");

    }

    @Override
    public void fastForward() {
        System.out.println("use fast forward");

    }

    @Override
    public void replay() {
        System.out.println("replay please!!");

    }

    @Override
    public void play() {
        System.out.println("play a nice song");

    }

    @Override
    public void stop() {
        System.out.println("stop the music please!");

    }

    @Override
    public void pause() {
        System.out.println("pause the song");

    }

    @Override
    public void surfing() {
        System.out.println("do surfing");

    }

    @Override
    public void searchGoogle() {
        System.out.println("search on google");

    }

    @Override
    public void playYouTube() {
        System.out.println("play you tube please.");

    }
}
package nov2.media;

import MethodOverPractice.ShapeMain;
import nov2.devices.Ipad;
import nov2.devices.Laptop;
import nov2.devices.SmartPhone;
import nov2.devices.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        Ipad ipad = new Ipad();
        SmartWatch smartWatch = new SmartWatch();
        Laptop laptop = new Laptop();

        System.out.println("SMARTPHONE FEATURES......");
        smartPhone.play();
        smartPhone.pause();
        smartPhone.pause();
        System.out.println("VIDEO FEATURES.....");
        smartPhone.fastForward();
        smartPhone.replay();
        System.out.println("AUDIO FEATURES.....");
        smartPhone.shuffle();
        smartPhone.createPlaylist();
        System.out.println("CAMERA FEATURES.....");
        smartPhone.takePhoto();
        smartPhone.takeVideo();
        smartPhone.selfie();
        smartPhone.potrait();
        smartPhone.backCamera();
        System.out.println("CALCULATOR FEATURES.....");
        smartPhone.multiply();
        smartPhone.sum();
        smartPhone.divide();
        smartPhone.subtract();
        System.out.println("WEB BROWSER FEATURES.....");
        smartPhone.surfing();
        smartPhone.searchGoogle();
        smartPhone.playYouTube();
        System.out.println("MOBILE PHONE FEATURES....");
        smartWatch.makeCalls();
        smartWatch.sendTexts();
        System.out.println("CLOCK FEATURES.....");
        smartWatch.getAlarm();
        smartWatch.setTime();
        System.out.println("IPAD FEATURES....");
        System.out.println("MEDIA FEATURES....");
        ipad.play();
        ipad.pause();
        ipad.stop();
        System.out.println("VIDEO FEATURES....");
        ipad.fastForward();
        ipad.replay();
        System.out.println("AUDIO FEATURES....");
        ipad.shuffle();
        ipad.createPlaylist();
        System.out.println("CAMERA FEATURES....");
        laptop.takePhoto();
        laptop.takeVideo();
        laptop.selfie();
        laptop.potrait();
        System.out.println("CALCULATOR FEATURES.....");
        laptop.sum();
        laptop.subtract();
        laptop.multiply();
        laptop.divide();
        System.out.println("WEB BROWSER FEATURES....");
        laptop.surfing();
        laptop.playYouTube();
        laptop.searchGoogle();


    }
}

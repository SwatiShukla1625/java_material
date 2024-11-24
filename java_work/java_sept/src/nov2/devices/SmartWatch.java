package nov2.devices;

import nov2.media.Calculator;
import  nov2.devices.MobilePhone;

public class SmartWatch implements Calculator,MobilePhone {
    @Override
    public void makeCalls() {
        System.out.println("make a call");

    }

    @Override
    public void sendTexts() {
        System.out.println("send me a text message");

    }

    @Override
    public void sum() {
        System.out.println("sum of numbers");

    }

    @Override
    public void subtract() {
        System.out.println("subtraction of numbers");

    }

    @Override
    public void multiply() {
        System.out.println("multiplication of numbers");

    }

    @Override
    public void divide() {
        System.out.println("division of numbers");

    }
    public void setTime(){
        System.out.println("get time");
    }
    public void getAlarm(){
        System.out.println("can set alarm");
    }
}

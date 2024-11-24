package abstractPractise;

public class SmartPhone  extends MobilePhone{

    @Override
    public void makeCalls() {
        System.out.println("make an important call");
    }

    @Override
    public void recieveCalls() {
        System.out.println("recieved a call from my friend");
            }

    @Override
    public void leaveVoiceMails() {
        System.out.println("leave an important voice mail");
    }

    @Override
    public void playGames() {
        System.out.println("you can play games");

    }

    @Override
    public void storeContacts() {
        System.out.println("you can store your contacts");

    }

    @Override
    public void sendTextMessages() {
        System.out.println("send text messages");

    }
}

package abstractPractise;

public class Samsung  extends SmartPhone{
    @Override
    public void makeCalls() {
        System.out.println("calls made by Samsung are noise free");
    }

    @Override
    public void recieveCalls() {
        System.out.println("I recieved two calls from samsung phone");

    }

    @Override
    public void leaveVoiceMails() {
        System.out.println("My friend had send a voice mail from her samsung phone");
    }

    @Override
    public void playGames() {
        System.out.println(" i play candy crush in my samsung phone");
    }

    @Override
    public void storeContacts() {
        System.out.println("samsung has great storage capacity");
    }

    @Override
    public void sendTextMessages() {
        System.out.println("you can use my samsung phone to send a textv message");

    }
}

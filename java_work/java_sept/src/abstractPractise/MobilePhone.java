package abstractPractise;

public abstract class MobilePhone extends Phone{

    @Override
    public void makeCalls() {
        System.out.println("you can make your calls using mobile phone");

    }

    @Override
    public void recieveCalls() {
        System.out.println("you can recieve calls using mobile phone");

    }

    @Override
    public void leaveVoiceMails() {
        System.out.println("you can leave voice messages using mobile phone");

    }
    public abstract void playGames();
    public abstract void storeContacts();
    public abstract void sendTextMessages();
}

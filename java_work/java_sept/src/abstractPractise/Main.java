package abstractPractise;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.leaveVoiceMails();
        smartPhone.makeCalls();
        smartPhone.playGames();
        smartPhone.storeContacts();
        smartPhone.recieveCalls();
        smartPhone.sendTextMessages();

        Iphone iphone = new Iphone();
        iphone.makeCalls();
        //iphone.leaveVoiceMails();
       // iphone.playGames();
       // iphone.storeContacts();

        MobilePhone m = new SmartPhone();
        m.leaveVoiceMails();

        Samsung samsung = new Samsung();
        samsung.leaveVoiceMails();
        samsung.playGames();
        samsung.makeCalls();
        samsung.recieveCalls();
        samsung.sendTextMessages();
        samsung.storeContacts();

        SmartPhone smartPhone1 = new Samsung();
        smartPhone1.makeCalls();

    }
}

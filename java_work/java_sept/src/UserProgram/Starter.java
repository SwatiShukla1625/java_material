package UserProgram;

public class Starter {
    public static void main(String[] args) {



        User u21 = new User();
        User u22 = new User();

        u22.wrongHit();;
        u22.wrongHit();;
        u22.wrongHit();;
        u22.wrongHit();;
        User u23 = new User();
        u23.wrongHit();
        u23.wrongHit();
        u23.wrongHit();
        u23.wrongHit();
        u23.wrongHit();
        User u24 = new User();
        u24.wrongHit();
        User u25 = new User();
        u25.wrongHit();







        System.out.println("count :" + User.getCount());
        System.out.println(  "output of counts : " +User.audit());

        if(User.audit() >=15){
            System.out.println("System on Risk");
        }
        else if(User.audit()>=10 && User.audit()<15){
            System.out.println("System on Alert");
        }
        else if (User.audit()<10){
            System.out.println("System is Ok");
        }
        else{
            System.out.println("Everything is fine");
        }

    }
}

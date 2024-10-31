package UserProgram;

public class User {
    String userName;
    String name;
    int age;
    String emailId;

    static int count = 0;
    static int wrongCallCount = 0;





    public User() {


        count = count + 1;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String tempUserName) {
        userName = tempUserName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int tempAge){
        age = tempAge;
    }
    public String getName(){
        return name;
    }
    public void setName(String tempName){
        name = tempName;
    }
    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String tempEmailId){
        emailId = tempEmailId;
    }
    public static int getCount(){
        return count;
    }
    public void wrongHit(){
        wrongCallCount = wrongCallCount+1;
    }
    public static int audit(){
        return wrongCallCount;
    }

    }




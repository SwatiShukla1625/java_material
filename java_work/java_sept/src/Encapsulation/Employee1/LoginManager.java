package Encapsulation.Employee1;

public class LoginManager {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginManager(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public void login(String name, String password) {
        if (this.userName.equals(userName) && this.password.equals(password)){
            System.out.println("user is authenticated");
        }
        else{
            System.out.println("invalid credentials");
        }

        }
    }
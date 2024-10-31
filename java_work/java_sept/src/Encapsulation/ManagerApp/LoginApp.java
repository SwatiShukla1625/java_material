package Encapsulation.ManagerApp;

import Encapsulation.Employee1.LoginManager;

public class LoginApp {
    public static void main(String[] args) {
        LoginManager l = new LoginManager("ABC", "12345");

        String userName = l.getUserName();
        System.out.println("the username is : " + userName);

        l.setPassword("123456");
        l.login("ABC" ,"123456");
    }
}

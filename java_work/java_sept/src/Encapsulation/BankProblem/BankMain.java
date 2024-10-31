package Encapsulation.BankProblem;

public class BankMain {
    public static void main(String[] args) {
        BankLogin b = new BankLogin("123456789", 1000);
        b.depositMoney(200);
        b.withdrawMoney(100);
        double balance = b.getBankBalance();
        System.out.println("the bank balance is : " + balance);
    }
}

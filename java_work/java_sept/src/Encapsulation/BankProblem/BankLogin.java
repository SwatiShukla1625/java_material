package Encapsulation.BankProblem;

public class BankLogin {
    private String accountNumber;
    private double bankBalance;

    public BankLogin(String accountNumber, double bankBalance){
        this.accountNumber = accountNumber;
        this.bankBalance = bankBalance;
    }

    public void depositMoney(double amount){
        if(amount>0){
            amount += bankBalance;
        }
        else{
            System.out.println("your balance must be > 0");
        }
    }
    public void withdrawMoney( double amount){
        if(amount>0) {
            if (amount < bankBalance) {
                bankBalance -= amount;
            } else {
                System.out.println("insufficient funds for withdrawal");
            }
        }
            else{
                System.out.println("the balance is not > 0");
            }

    }

    public double getBankBalance() {
        return bankBalance;
    }
}





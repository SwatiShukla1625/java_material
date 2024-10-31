package OOPS;

public class Main {
    public static void main(String[] args) {
        BankOfCanada boc = new BankOfCanada();
        ScotiaBank sb = new ScotiaBank();
        Bmo b = new Bmo();
        RBC r = new RBC();
        PragraBank pb = new PragraBank();

        System.out.println("Bank Of Canada interest rate is :" + boc.getInterestRate());
        System.out.println("Scotia Bank interest rate is :" + b.getInterestRate());
        System.out.println("Bmo interest rate is :" + b.getInterestRate());
        System.out.println("RBC interest rate is :" + r.getInterestRate() );
        System.out.println("Pragra Bank interest rate is : " + pb.getInterestRate());
    }
}

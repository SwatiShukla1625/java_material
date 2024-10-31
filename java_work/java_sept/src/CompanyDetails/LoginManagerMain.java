package CompanyDetails;

public class LoginManagerMain {
    public static void main(String[] args) {
        LoginManager l = new LoginManager("ABCD", "123456");
        l.getUsername();
        l.printLoginDetails("ABCD","123456");



    }
}

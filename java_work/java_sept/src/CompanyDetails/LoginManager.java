package CompanyDetails;

public class LoginManager {
    private String userName;
    private String password;

     public LoginManager(String userName,String password){
         this.password = password;
         this.userName = userName;
     }

    public String getUsername(){
        return userName;
     }

    public void setPassword(String password) {
        this.password = password;
    }

    public void printLoginDetails(String userName,String password){
         if(this.userName.equals(userName) && this.password.equals(password)){
             System.out.println("authenticated");
         }
         else{
             System.out.println("Invalid credentials");
         }

    }
}

package exceptionHandling;

public class Voter {
    private String name;
    private String voterId;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getVoter(){
        return voterId;
    }
    public void setVoterId(String voterId){
        this.voterId = voterId;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

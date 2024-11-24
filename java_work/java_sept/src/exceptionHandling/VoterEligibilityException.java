package exceptionHandling;

public class VoterEligibilityException extends RuntimeException{

    public VoterEligibilityException(String message){
        super(message);
    }
}

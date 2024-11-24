package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        Voter voter = new Voter();
        voter.setName("Rahul");
        voter.setVoterId("R101");
        voter.setAge(12);

        VoterServiceImpl voterService = new VoterServiceImpl();
        boolean isEligibleVoter = false;

        try {
            isEligibleVoter = voterService.isEligibleVoter(voter);
            System.out.println(voter.getName() + " is eligible for vote " + isEligibleVoter);
        }catch(VoterEligibilityException exception){
            exception.printStackTrace();

        }
        System.out.println("Closing...");
    }
}

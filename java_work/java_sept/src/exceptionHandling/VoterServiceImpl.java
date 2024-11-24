package exceptionHandling;

public class VoterServiceImpl implements VoterServiceInfc{

    @Override
    public boolean isEligibleVoter(Voter voter) {
        if(voter.getAge()<18){
            throw new VoterEligibilityException(voter.getName() + "is not eligibile for voting");
        }
        return true;
    }
}

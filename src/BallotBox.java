
public class BallotBox {
	BagInterface<Ballot> ballotBox;
	
	public BallotBox(){
		ballotBox = new ArrayListBag<Ballot>();
	}
	
	public boolean voteFor(String name, double bribe){
		Ballot newBallot = new Ballot(name, bribe);
		ballotBox.add(newBallot);
		return true;
	}
	
	public int countVotesFor(String name){
		Ballot aBallot = new Ballot(name, 0);
		return ballotBox.getFrequencyOf(aBallot);
	}
	
	public boolean remove(Ballot ballot){
		return ballotBox.remove(ballot);
	}
	
	public boolean remove(){
		//if empty?
		ballotBox.remove();
		return true;
	}
	
	public int currentVotes(){
		return ballotBox.getCurrentSize();
	}
	
	public void emptyTheBox(){
		ballotBox.clear();
	}
	
	public String allVotes(){
		return null;
	}
	
	
}

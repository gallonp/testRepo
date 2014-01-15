
public class BallotBox {
	private BagInterface<Ballot> ballotBox;
	
	public BallotBox(){
		ballotBox = new ArrayListBag<Ballot>();
	}
	
	public boolean voteFor(String name, int bribe){
		Ballot newBallot = new Ballot(name, bribe);
		this.ballotBox.add(newBallot);
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
		if (!ballotBox.isEmpty()) {
			ballotBox.remove();
			return true;
		} else {
			return false;
		}
	}
	
	public int currentVotes(){
		return ballotBox.getCurrentSize();
	}
	
	public void emptyTheBox(){
		ballotBox.clear();
	}
	
	public String allVotes(){
		Object[] ballotArray = ballotBox.toArray();
		StringBuffer output = new StringBuffer();
		for (int i =0; i < ballotArray.length ; i++) {
			output.append(ballotArray[i]+"\n");
		}
			return output.toString();
	}
	
	
}


public class BallotBox {
	private BagInterface<Ballot> ballotBox;
	
	public BallotBox(){
		ballotBox = new ArrayListBag<Ballot>();
	}
	
	/**
	 * Add a new Ballot to the BallotBox
	 * return true whatever happens
	 * @param name
	 * @param bribe
	 * @return
	 */
	public boolean voteFor(String name, int bribe){
		Ballot newBallot = new Ballot(name, bribe);
		this.ballotBox.add(newBallot);
		return true;
	}
	
	/**
	 * Count the votes for a certain candidate.
	 * These votes may have different bribes.
	 * @param name
	 * @return
	 */
	public int countVotesFor(String name){
		Ballot aBallot = new Ballot(name, 0);
		return ballotBox.getFrequencyOf(aBallot);
	}
	
	/**
	 * Remove a ballot for a certain candidate
	 * the bribe amount doesn't matter
	 * If succeed, return true or otherwise.
	 * @param ballot
	 * @return
	 */
	public boolean remove(Ballot ballot){
		return ballotBox.remove(ballot);
	}
	
	/**
	 * Remove a ballot randomly.
	 * @return
	 */
	public boolean remove(){
		//if empty?
		if (!ballotBox.isEmpty()) {
			ballotBox.remove();
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Count the total votes number in the ballot box
	 * @return
	 */
	public int currentVotes(){
		return ballotBox.getCurrentSize();
	}
	
	/**
	 * Clear the ballot box
	 */
	public void emptyTheBox(){
		ballotBox.clear();
	}
	
	/**
	 * convert all the votes in the ballot box into
	 * a list of votes
	 * @return
	 */
	public String allVotes(){
		Object[] ballotArray = ballotBox.toArray();
		StringBuffer output = new StringBuffer();
		for (int i =0; i < ballotArray.length ; i++) {
			output.append(ballotArray[i]+"\n");
		}
			return output.toString();
	}
	
	
}

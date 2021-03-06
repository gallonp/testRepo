
public class Ballot {
	public String name;
	public int bribe;
	
	/**
	 * Constructor of a ballot, should provide the name
	 * of the candidate and the bribe amount
	 * @param name
	 * @param bribe
	 */
	public Ballot(String name, int bribe){
		this.name = name;
		this.bribe = bribe;
	}
	
	public boolean equals(Object another){
		if (another == this){
			return true;
		} else if (another.getClass() == this.getClass()){
			Ballot anotherBallot = (Ballot)another;
			return this.name.equalsIgnoreCase(anotherBallot.name);
		}
		return false;
	}
	
	public String toString(){
		String output ="Name: " + this.name +", bribe: " +this.bribe;
		return output;
	}
}

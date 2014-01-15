
public class Ballot {
	public String name;
	public double bribe;
	
	public Ballot(String name, double bribe){
		this.name = name;
		this.bribe = bribe;
	}
	
	public boolean equals(Ballot another){
		return this.name.equalsIgnoreCase(another.name);
	}
	
	public String toString(){
		String output ="Name: " + this.name +", bribe: " +this.bribe;
		return output;
	}
}

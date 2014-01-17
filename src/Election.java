import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Election {

	public static void main(String[] args) {
		boolean exit = false;
		BallotBox ballotBox = new BallotBox();
		while (exit !=true){
			
			//print lines
			String choicesMenu = "Welcome to the election! What would you like to do?\n" +
					"1: Vote for a candidate\n" +
					"2: Count the number of votes for a candidate\n" +
					"3: Remove a vote\n" +
					"4: Get number of votes in the ballot box\n" +
					"5: Empty the ballot box\n" +
					"6: Print all votes\n" +
					"7: Quit\n";
			System.out.println(choicesMenu);
			System.out.print("Enter your choice (1-7) here:");
			
			//choice input
	        Scanner scanner = new Scanner(new InputStreamReader(System.in));
	        int choice = scanner.nextInt();
			//conditionals
			switch(choice) {
			case 1: {
				vote(ballotBox);
				break;
			}
			case 2:{
				System.out.print("which candidate to count?:");
				scanner = new Scanner(new InputStreamReader(System.in));
				String candidate = scanner.next();
				countVotes(ballotBox,candidate);
				break;
			}
			case 3:{
				removeVote(ballotBox);
				break;
			}
			case 4:{
				getAllVotesCount(ballotBox);
				break;
			}
			case 5:{
				emptyTheBox(ballotBox);
				break;
			}
			case 6:{
				printAllVotes(ballotBox);
				break;
			}
			case 7:{
				exit = true;
				break;
			}
			default: {
				break;
			}
			}
		}
	}
	
	/**
	 * Allow user to enter a vote
	 * @param ballotBox
	 */
	public static void vote(BallotBox ballotBox){
		String name = "";
		int bribe = 0;
		
		try{
			System.out.print("Please enter the candidate name:");
			Scanner scanner = new Scanner(new InputStreamReader(System.in));
			name = scanner.next();
			System.out.print("Please enter the bribe amount:");
			scanner = new Scanner(new InputStreamReader(System.in));
			bribe = scanner.nextInt();
			ballotBox.voteFor(name, bribe);
			System.out.println("you voted for: " + name);
			System.out.println("you bribed for: " + bribe);
		} catch (NoSuchElementException e) {
			System.out.println("bad input! try again!");
		}

	}
	
	/**
	 * Print out all the votes in the ballot box
	 * @param ballotBox
	 */
	public static void printAllVotes(BallotBox ballotBox){
		System.out.println(ballotBox.allVotes());
	}

	/**
	 * Print out the votes for a candidate given by the user
	 * @param ballotBox
	 * @param candidate
	 */
	public static void countVotes(BallotBox ballotBox, String candidate){
		System.out.println(candidate + " has " + ballotBox.countVotesFor(candidate) + " votes");
		
	}
	
	/**
	 * Remove a vote randomly from the ballot box
	 * @param ballotBox
	 */
	public static void removeVote(BallotBox ballotBox){
		if (ballotBox.remove()) {
			System.out.println("sucessfully removed one vote!");
		} else {
			System.out.println("Removing vote failed!");
		}	
	}
	
	/**
	 * print out number of the votes in the ballot box
	 * @param ballotBox
	 */
	public static void getAllVotesCount(BallotBox ballotBox){
		System.out.println("Current votes number is: "+ballotBox.currentVotes());
	}
	
	/**
	 * Empty the ballot box
	 * @param ballotBox
	 */
	public static void emptyTheBox(BallotBox ballotBox){
		ballotBox.emptyTheBox();
		System.out.println("Successfully emptied the box");
	}
	
	
}

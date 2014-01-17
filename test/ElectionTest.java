import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ElectionTest {
	
	BallotBox ballotBox;
	@Before
	public void setUp(){
		ballotBox = new BallotBox();
		ballotBox.voteFor("Peter", 134);
		ballotBox.voteFor("Bill", 424);
		ballotBox.voteFor("Tim", 314);
	}
	
	@Test
	public void AddTest() {
		assertTrue(ballotBox.voteFor("Bob", 124));
		assertTrue(ballotBox.voteFor("Nancy", 241));
		assertTrue(ballotBox.voteFor("Jay", 224));
		//assertFalse
		//assertEquals
		//assertArrayEquals
	}
	
	@Test
	public void countTest(){
		ballotBox.voteFor("Bob", 124);
		assertEquals(ballotBox.countVotesFor("Bob"), 2);
		assertEquals(ballotBox.countVotesFor("Tim"), 1);
		assertEquals(ballotBox.countVotesFor("Josh"), 0);
	}

}

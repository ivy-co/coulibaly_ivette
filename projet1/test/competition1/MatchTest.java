package competition1 ;

import competition1.* ;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.* ;

public class MatchTest {
	private Competitor c1 ;
	private Competitor c2 ;
	private Match m ;

	//kjdshkjrthqjhiugthr"

	@Before
	public void before() {
		this.c1 = new Competitor ("Siwar");
		this.c2 = new Competitor ("Ivette");
		this.m = new Match(c1, c2);
	}
	
	@Test
	public void GetC1Test() {
		assertEquals(m.getC1(), c1 );
	}
	
	
	@Test
	public void GetC2Test() {
		assertEquals(m.getC2() , c2);
	}
	
	@Test
	public void GetWinnerReturnsCompetitorTest() {
		assertTrue( m.getWinner() == c1 || m.getWinner() == c2) ;
		

	}
	
	// ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(competition1.MatchTest.class);
    }
	
}


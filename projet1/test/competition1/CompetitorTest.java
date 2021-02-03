package competition1 ; 

import competition1.* ;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CompetitorTest {

	private Competitor c ;
	
	@Before
	public void before() {
		this.c = new Competitor("Siwar");
	}
	
	@Test
	public void constructorTest() {
		assertTrue(c.getName()=="Siwar") ;
		assertEquals(c.getScore(), 0);
	}
	
	
	@Test
	public void competitorGetNameTest() {
		assertEquals(c.getName(), "Siwar") ;
		
	}
	
	@Test
	public void competitorGetScoreTest() {			
		assertEquals(c.getScore(), 0);
	}
	
	@Test
	public void competitorAddScoreTest() {	
		assertEquals(c.getScore(), 0);
		c.addScore();
		assertEquals(c.getScore(), 1);
		c.addScore();
		assertEquals(c.getScore(), 2);
	}
	
	// ---Pour permettre l'execution des tests ---------------------- 
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(competition1.CompetitorTest.class);
	}
	
}

package competition1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MasterTest extends CompetitionTest{

	
	public Competition createCompetition(){
        Competitor c1 = new Competitor ("Siwar");
		Competitor c2 = new Competitor ("Ivette");
		Competitor c3 = new Competitor ("Zineb");
		Competitor c4 = new Competitor ("Toto");
		Competitor c5 = new Competitor ("Alaska");
		Competitor c6 = new Competitor ("Kiwi");
		List<Competitor> competitors = new ArrayList<Competitor>();
		competitors.add(c1);
		competitors.add(c2);
		competitors.add(c3);
        competitors.add(c4);
        competitors.add(c5);
        competitors.add(c6);
        return new Master( competitors) ;
    }
	
	
	@Test
	@Before
	public void testMaster() {
		Competition master = createCompetition();
	}
	
	@Test
	public void testSetStrategyWorks() {
		//create a strategy
		Strategy strategy = new StrategyRandom();
		assertEquals(master.getStrategy(), null);
		
		//set strategy
		master.setStrategy(strategy);
		assertEquals(master.getStrategy(), strategy);
	}
	
	
	@Test
	public void testSetStrategyDoesntWorks() {
		//create a strategy
		Strategy strategy = new StrategyRandom();
		assertEquals(master.getStrategy(), null);
		
		//set strategy
		master.setStrategy(strategy);
		assertEquals(master.getStrategy(), null);
	}
	
	
	
	
	// ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(competition1.CompetitionTest.class);
    }
	
}

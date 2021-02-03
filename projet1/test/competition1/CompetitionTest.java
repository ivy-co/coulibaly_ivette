 

import competition1.* ;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.* ;

public abstract class CompetitionTest {
	

	public abstract Competition createCompetition() ;

    @Test
	public void sizeListCompetitorsTest(){
		Competition competition = createCompetition() ;
		assertEquals( 6, competition.getListCompetitors().size() ) ; 
	}

	// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(competition1.CompetitionTest.class);
	}

}


package competition1;

import competition1.* ;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.* ;

public class TournamentTest extends CompetitionTest {

	
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
        return new Tournament( competitors) ;
    }

    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(competition1.CompetitionTest.class);
    }
}


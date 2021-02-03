package strategy;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import competition1.Competition;

public abstract class StrategyTest {

	public abstract Strategy createStrategy() ;


	// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(competition1.strategy.StrategyTest.class);
	}


}

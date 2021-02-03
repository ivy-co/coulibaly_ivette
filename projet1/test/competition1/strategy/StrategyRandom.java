package strategy;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

/**
 * Test class for the class StrategyRandom	
 * @author Siwar ADALA & Ivette COULIBALY
 *
 */


public class StrategyRandomTest extends StrategyTest{

	/**
	 * method to make an object StrategyRandom in the test class
	 * @return the strategy object
	 */
	public Strategy createStrategy() {
		
		return new StrategyRandom();
	}

	
	// ---Pour permettre l'execution des tests ----------------------
		public static junit.framework.Test suite() {
			return new junit.framework.JUnit4TestAdapter(competition1.strategy.StrategyRandomTest.class);
		}
}

package strategy;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

/**
 * Test class for the class StrategyFirst
 * @author Siwar ADALA & Ivette COULIBALY
 *
 */


public class StrategyFirstTest extends StrategyTest{

	/**
	 * method to make an object StrategyFirst in the test class
	 * @return the strategy object
	 */
	public Strategy createStrategy() {
		
		return new StrategyFirst();
	}

	
	// ---Pour permettre l'execution des tests ----------------------
		public static junit.framework.Test suite() {
			return new junit.framework.JUnit4TestAdapter(competition1.strategy.StrategyFirstTest.class);
		}
}

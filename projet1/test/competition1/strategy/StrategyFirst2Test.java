package strategy;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

/**
 * Test class for the class StrategyFirst2
 * @author Siwar ADALA & Ivette COULIBALY
 *
 */


public class StrategyFirst2Test extends StrategyTest{

	/**
	 * method to make an object StrategyFirst2 in the test class
	 * @return the strategy object
	 */
	public Strategy createStrategy() {
		
		return new StrategyFirst2();
	}

	
	// ---Pour permettre l'execution des tests ----------------------
		public static junit.framework.Test suite() {
			return new junit.framework.JUnit4TestAdapter(competition1.strategy.StrategyFirst2Test.class);
		}
}


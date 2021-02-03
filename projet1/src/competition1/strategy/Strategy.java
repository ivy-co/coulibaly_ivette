package competition1.strategy;

import java.util.*;

import competition1.Competitor;

/**
 *
 * This class implements a Strategy .
 * a Strategy object is used in the class Master
 * @author COULIBALY Ivette & ADALA Siwar
 */


public abstract class Strategy {
	
	/**
	 * makes a strategy
	 * @return a strategy
	 */
	public abstract Strategy makeStrategy();
	
	/**
	 * returns a list according to the chosen selection method from a list given in parameter 
	 * @param liste list from which elements of the returned list are chosen
	 * @return the list of the selectioned elements
	 */
	public abstract List<Competitor> selectionMethod(List<List<Competitor>> liste);


}


package competition1.strategy;

import java.util.*;

import competition1.Competitor;


/**
 *
 * This class implements a Strategy of type StrategyFirst .
 * StrategyFirst extends Strategy
 * @author COULIBALY Ivette & ADALA Siwar
 */


public class StrategyFirst extends Strategy {
	
	/**
	 * returns a list according to the chosen selection method from a list given in parameter 
	 * @param liste list from which elements of the returned list are chosen
	 * @return the list of the selectioned elements
	 */
	@Override
	public List<Competitor> selectionMethod(List<List<Competitor>> liste){
		List<Competitor> selectioned = new ArrayList<Competitor>();
		for(List<Competitor> l: liste) {
			selectioned.add(l.get(0));
		}
		return selectioned;
	}

	/**
	 * makes a strategy
	 * @return a strategy
	 */
	@Override
	public Strategy makeStrategy() {
		return new StrategyFirst();
	}
	

}


package competition1.strategy;

import java.util.ArrayList;
import java.util.List;

import competition1.Competitor;

/**
 *
 * This class implements a Strategy of type StrategyFirst2 .
 * StrategyFirst2 extends Strategy
 * @author COULIBALY Ivette & ADALA Siwar
 */


public class StrategyFirst2 extends Strategy {
	
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
			selectioned.add(l.get(1));
			System.out.println("Un element est ajoute :" + l.get(0));
			System.out.println("Un element est ajoute :" + l.get(1));

		}
		return selectioned;
	}

	/**
	 * makes a strategy
	 * @return a strategy
	 */
	@Override
	public Strategy makeStrategy() {
		return new StrategyFirst2();
	}

}

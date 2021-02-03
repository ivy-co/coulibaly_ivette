package competition1.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import competition1.Competitor;


/**
 *
 * This class implements a Strategy of type StrategyRandom .
 * StrategyRandom extends Strategy
 * @author COULIBALY Ivette & ADALA Siwar
 */


public class StrategyRandom extends Strategy{
	
	private static Random  alea = new Random() ;

	
	private int random(int n){
		return (int) ( Math.random() * n + 1) ;

	}
	
	/**
	 * returns a list according to the chosen selection method from a list given in parameter 
	 * @param liste list from which elements of the returned list are chosen
	 * @return the list of the selectioned elements
	 */
	@Override
	public List<Competitor> selectionMethod(List<List<Competitor>> liste){
		List<Competitor> selectioned = new ArrayList<Competitor>();
		for(List<Competitor> l: liste) {
			int n = random(l.size()/2);
			selectioned.add(l.get(n));
			System.out.println("Un element choisi par hasard est ajoute :" + l.get(n));
		}
		System.out.println("selectioned " + selectioned);
		
		return selectioned;
	}

	/**
	 * makes a strategy
	 * @return a strategy
	 */
	@Override
	public Strategy makeStrategy() {
		return new StrategyRandom();
	}
	
}


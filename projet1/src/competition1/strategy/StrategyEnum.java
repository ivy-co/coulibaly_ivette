package competition1.strategy;
import competition1.*;
import java.util.*;

import competition1.*;
import competition1.strategy.*;

/**
 * This enum is for the types of Strategies 
 * @author Siwar ADALA & Ivette COULIBALY
 *
 */


public enum StrategyEnum {
	
	
	  FIRST, FIRSTTWO, RANDOM, LAST;
	
	/**
	 * makes a strategy according to the enum's value
	 * @return a strategy
	 */
	  public Strategy makeStrategy() {

	    // this will refer to the object SMALL
	    switch(this) {
	      case FIRST:
	        return new StrategyFirst();

	      case FIRSTTWO:
	        return new StrategyFirst2();

	      case RANDOM:
	        return new StrategyRandom();

	      case LAST:
	        return new StrategyRepechageLast();

	      default:
	        System.out.println("Unknown Strategy");
	      }
		return null;
	   }

	
}	
	// third attempt
	/*
	FIRST {

        @Override
        public Strategy makeStrategy() {
            return new StrategyFirst();
        }
        
        @Override
    	public List<Competitor> selectionMethod(List<List<Competitor>> liste){
    		List<Competitor> selectioned = new ArrayList<Competitor>();
    		for(List<Competitor> l: liste) {
    			selectioned.add(l.get(0));
    		}
    		return selectioned;
    	}

    },
	
	FIRSTTWO {
	        @Override
	        public Strategy makeStrategy() {
	            return new StrategyFirst2();
	        }
	        
	    },
	
	RANDOM {
	        @Override
	        public Strategy makeStrategy() {
	            return new StrategyRandom();
	        }
	        
	    },
	
	LAST {
	        @Override
	        public Strategy makeStrategy() {
	            return new StrategyRepechageLast();
	        }
	        
	     };
	
	public abstract Strategy makeStrategy();

	public abstract List<Competitor> selectionMethod(List<List<Competitor>> l);
	
	*/
	
	
	
	
	
	//second attempt, we found problems so we changed it
	 /*FIRST, FIRSTTWO, RANDOM, REPECHAGELAST;
	
	Strategy choiceStrategy(int n) {
		switch (this) {
		case FIRST:
			return new StrategyFirst();
		case FIRSTTWO:
			return new StrategyFirst2();
		case RANDOM:
			return new StrategyRandom();
		case REPECHAGELAST:
			return new StrategyRepechageLast();
		default:
				throw new AssertionError("Unknown strategy" + this);
			
			
		}
	}*/
	
	
	//first attempt, we found problems so we changed it
	/*
	 public Strategy first() {
		 return new StrategyFirst();
	 }
	 
	 public Strategy firtTwo() {
		 return new StrategyFirst2();
	 }
	 
	 public Strategy random() {
		 return new StrategyRandom();
	 }
	 
	 public Strategy repechageLast() {
		 return new StrategyRepechageLast();
	 }

	public abstract List<Competitor> selectionMethod(List<List<Competitor>> poules);
	*/

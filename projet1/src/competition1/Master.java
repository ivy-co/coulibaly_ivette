package competition1;

import java.util.*;

import javax.swing.event.PopupMenuListener;

import competition1.partition.*;
import competition1.strategy.*;

/**
 *
 * This class implements a competition of type Master .
 * Master extends of Competition
 *@author COULIBALY Ivette & ADALA Siwar
 */

public class Master extends Competition {
	
	/**
	 * the attributes 
	 *@poules the list of pools
	 *@strategy the strategy to used and that's chosen by the user
	 *@rankingString the string containing the ranking of the Master Competition
	 */

    private List<List<Competitor>> poules;
    
    private Strategy strategy;
    
    private String rankingString;
    
    
    /**
     * build a competition of type Master
     * 
     * @param competitors the competitors of this competition
     * @throws NotRightNumberException if competitors numbers isn't a power of 2
     */
    public Master(List<Competitor> competitors) throws NotRightNumberException {
        super(competitors);
        if ((competitors.size() % 2) != 0) {
            throw new NotRightNumberException("The number of competitors must be a multiple of 2");
        }
        this.poules = createPoules(competitors);
        this.rankingString = "";
    }
    
    /**
     * creates the pools of competitors randomly
     * @param comp the list of competitors
     * @return a list of pools created out of the competitors list
     */
    public List<List<Competitor>> createPoules(List<Competitor> comp){
    	Random random = new Random();
        int r = random.ints(2, comp.size()/2)
      	      .findFirst()
    	      .getAsInt();
        while ((r%2 != 0) && !division(comp.size()/2, r)) {
            r = random.ints(2, comp.size()/2)
            	      .findFirst()
            	      .getAsInt();
        }
        return NPartition.nPartition(comp, r) ;
    }
    

    /**
     * returns the list of the partition of the competitors
     * @return the list of the partition of the competitors
     */
    public List<List<Competitor>> getPoules() {
        return this.poules;
    }
	
    /**
     * determines if the competitors could be divided into n pools
     * @param n the size of competitor's list
     * @param div the number of division
     * @return true if n is divisible by div , otherwise false
     */
    private boolean division(int n, int div){
    	
    	if ((div != 0) && (div != 1)) {
    		if(n%div == 0){
                int res = n / div ;
                if ( res %2 == 0){
                    return true;
                }
                return false; 
            }    
    	}
    	return false ;
    }
    
    
    /**
     * sets the strategy of the Master to the strategy chosen by the user
     * @param s the strategy chosen by the user
     */
    @Override
    public void setStrategy(Strategy s) {
    	this.strategy = s;
    }
    
    /**
     * returns the strategy used in Master object
     * @return the used strategy 
     */
    public Strategy getStrategy() {
    	return this.strategy;
    }
    
    /**
	 * play the match between 2 competitors
	 * @param c1 the first competitor 
	 * @param c2 the second competitor 
	 */
	protected void playMatch(Competitor c1, Competitor c2) {
		/*Match m = new Match(c1 , c2) ;
		Competitor winner = m.getWinner();
		if ( winner.equals(c1) ) {
			c1.addScore();
		}
		else {
			c2.addScore();
		}
		System.out.println(m.toString());*/
	}  
    
    /**
     * return the selection's list of the competitors
     * @return the selection's list of the competitors
     */
    protected List<Competitor> selection(List<List<Competitor>> l) {
    	return this.strategy.selectionMethod(l); 
    }
    
    /**
	 * organizes and plays matches between all players
	 *@param comp the list of all competitors of competition
	 */
    @Override
	public void play(List<Competitor> comp){
    	
    	Competition ligue;
		for ( List<Competitor> l : this.getPoules()){
			try {
				
                ligue = new League(l) ;
                ligue.setObservers(observers);
                System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --") ;
				System.out.println("     Pool " + (this.getPoules().indexOf(l) + 1));
				ligue.play();
                Map < Competitor , Integer > map = ligue.rankingSort() ;

				l = new ArrayList<Competitor>(map.keySet());  //this.poules pas modifiée ?!!!
				
				//Loop to print the list l
				for(Competitor c : l) {
					System.out.println(c.getName());
				}				
                System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --") ;
	
				//l = ligue.getOrderedCompetitorsList();
			} catch(Exception e) {
				e.printStackTrace();
			}
        }
        		
		List<Competitor> finales = this.selection(this.getPoules()) ;
		
		//Loop to print the list finales
		for(Competitor c : finales) {
			System.out.println(c.getName());
		}		
		
		try {
            Competition tournoi = new Tournament(finales);
            tournoi.setObservers(observers);
			System.out.println("     Final Tournament   ");
			tournoi.play();
			Map < Competitor , Integer > map1 = tournoi.rankingSort();
			//List<Competitor> listeFinale = new ArrayList<Competitor>(map1.keySet());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }    
    
    /**
     * redefines rankingString giving it the string of the Master's ranking
     * @param p the list of the pools
     * @param f the list of the finale competitors
     */
    @Override
	public void printMaster(List<List<Competitor>> p, List<Competitor> f) {
        
    	String res = ""; // the string to be returned
    	
    	//print the pools results 
        for (List<Competitor> l : p){
            for (Competitor c : l) {
                this.rankingCompetitors.put( c, c.getScore() );
            }
            
            for (Map.Entry entry : this.rankingSort().entrySet() ){
                res += ((Competitor) entry.getKey()).getName() + " - " + entry.getValue() + "\n";
            }
        }
        
        //print the tournament's results
        
        for (Competitor c : f){
            this.rankingCompetitors.put( c, c.getScore() );
        }
        for (Map.Entry entry : this.rankingSort().entrySet() ){
            res += ((Competitor) entry.getKey()).getName() + " - " + entry.getValue() + "\n";
        }
        this.rankingString = res;
    }
    
    /**
     * returns rankingString which contains the ranking of the Master
     * @return rankingString which contains the ranking of the Master
     */
    public String printRanking() {
    	return this.rankingString;
    }    
    
}


package competition1;

import java.util.* ;
import competition1.observer.*;

/**
 * This class implements a competition of type League .
 * League extends Competition
 * @author COULIBALY Ivette & ADALA Siwar
 *
 */

public class League extends Competition{
	
	/**
	 * the list of competitors ordered according to their scores
	 */
	private List<Competitor> orderedCompetitorsList;
	
	
	/**
	 * Constructor of the competition of type League
	 *@param competitors the list of the competitors 
	 */
	public League(List<Competitor> competitors) {
		super(competitors);
		try {
			leagueIsOK(competitors.size());
			this.orderedCompetitorsList = new ArrayList<Competitor>();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
		
	/**
	 * returns the list of competitors ordered according to their scores
	 * @return the list of competitors ordered according to their scores
	 */
	public List<Competitor> getOrderedCompetitorsList() {
		
		return this.orderedCompetitorsList;
	}
	
	/**
	 * organizes and plays matches between all players
	 *@param comp the list of all competitors of competition
	 */
	protected void play(List<Competitor> comp) {
		for(Competitor c : comp){
			for(Competitor c1 : comp){
				if ( ( ! c.equals(c1) ) ) {
					this.playMatch(c,c1);
				}
			}
		}
	}

	/**
	 * play the match between 2 competitors
	 * @param c1 the first competitor 
	 * @param c2 the second competitor 
	 */
	protected void playMatch(Competitor c1, Competitor c2) {
		Match m = new Match(c1, c2);
		//System.out.println("Obsever size in league => "+ observers.size());
		m.setObservers(observers);
		this.setMatch(m);
		m.play();
		System.out.println(m.toString());
		System.out.println(" Notifications");
		m.notifyObservers();
		  
	}
		
	/**
	 * returns the string representation of the ranking
	 * @return the string representation of the ranking 
	 */
	public String printRanking() {
		for (Competitor c : this.competitors){
			this.rankingCompetitors.put( c, c.getScore() );
		}
		String res = "";
		for (Map.Entry entry : this.rankingSort().entrySet() ){
			res += ((Competitor) entry.getKey()).getName() + " - " + entry.getValue() + "\n";
			this.orderedCompetitorsList.add((Competitor)entry.getKey());
		}
		return res ;
		
	}
	
}


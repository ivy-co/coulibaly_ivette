package competition1;

import competition1.observer.*;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import java.util.* ;

/**
 *
 * This class implements a competition of type Tournament.
 * Tournament extends of Competition
 * @author COULIBALY Ivette & ADALA Siwar
 */
public class Tournament extends Competition {

	/**
	 * the attributes 
	 *@match the matches between competitors
	 *@competitors the list of competitors
	 *@organizedCompetitions the list of list of the matches organized between the competitors
	 *@rankingCompetitors the map to accept a competitor with his score attributed
	 */
	
	private List<Competitor> losers ;

	
	/**
	 * the constructor of the class Tournament
	 * @throws NotRightNumberException if competitors numbers isn't a power of 2
	 * @param competitors the list of competitors
	 */
	public Tournament(List<Competitor> competitors) {
		super(competitors);
		try {
			tournamentIsOK(competitors.size());
			this.losers = new ArrayList<Competitor>() ;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/**
	 * returns the losers list
	 * @return the losers list
	 */
	public List<Competitor> getListLosers(){
		return this.losers ;
	} 

	/**
	 * play the match between 2 competitors
	 * @param c1 the first competitor 
	 * @param c2 the second competitor 
	 */
	protected void playMatch(Competitor c1, Competitor c2) {
		Match m = new Match(c1 , c2) ;
		System.out.println("Obsever size in tournement => "+ observers.size());
		m.setObservers(observers);
		// for(Observers o : this.observers){
		// 	m.addObserver(o);
		// }
		this.setMatch(m);
		//this.getMatch().setObservers(observers);
		m.play();
		Competitor winner = m.getWinner();
		if ( winner.equals(c1) ) {
			this.getListLosers().add(c2);
		}
		else {
			this.getListLosers().add(c1);
		}
		System.out.println(m.toString());
		System.out.println(" Notifications ");
		m.notifyObservers();
	}


	
	/**
	 * organizes and plays matches between all players
	 *@param comp the list of all competitors of competition
	 */
	protected  void play(List<Competitor> comp) {
		for (Competitor c1 : comp){
			for (Competitor c2 : comp){
				if ( (! c1.equals(c2)) && (!losers.contains(c1)) && (!losers.contains(c2)) ) {
						this.playMatch(c1,c2);
				}
			}
		}
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
		}
		return res ;
		
	}
	
}


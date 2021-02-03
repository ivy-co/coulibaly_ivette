package competition1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import competition1.strategy.Strategy;
import competition1.observer.*;


/**
 *
 * This class implements a sport's Competition defined by by a set of matches (Match) played between competitors ( Competitors) 
 *@author COULIBALY Ivette & ADALA Siwar
 */
public abstract class  Competition {

	/**
	 * the attributes 
	 *@competitors the list of competitors
	 *@rankingCompetitors the map to accept a competitor with his score attributed
	 *@strategy the strategy to be use in the master competition
	 */
	protected final List<Competitor> competitors;
	protected Map<Competitor, Integer> rankingCompetitors;
	private Strategy strategy;
	private Match match;
	protected List<Observers> observers;
	
	/**
	 * this class constructor 
	 *@param competitors the list of competitors 
	 */
	public Competition(List<Competitor> competitors ) {
		this.competitors = competitors;		
		this.rankingCompetitors = new HashMap<Competitor, Integer>();
		this.observers = new ArrayList<Observers>();
		//this.match = null;
	}
	
	/**
	 * this method adds a Competitor to the competitors list
	 * @param c the competitor to add
	 * @throws CompetitorAlreadyExistsException throws this exception if competitor already exists 
	 */
	public void addCompetitor(Competitor c) throws CompetitorAlreadyExistsException{
		if ( this.competitors.contains(c)){
			throw new CompetitorAlreadyExistsException("This competitor already exists !!! Please, choose another competitor") ;	
		}
		this.competitors.add(c);
	}
		
	/**
	 * returns competitors list
	 *@return competitors list
	 */
	public List<Competitor> getListCompetitors(){
		return this.competitors;
	}

	/**
	 * returns competitors list
	 *@return competition's strategy
	 */
	public Strategy getStrategy(){
		return this.strategy;
	}

	/**
	 * sets the attribute match to the match given in parameter
	 * @param m match 
	 */
	public void setMatch(Match m) {
		this.match = m;
	}	
	
	/**
	 * return the match 
	 * @return match
	 */
	public Match getMatch() {
		return this.match;
	}
	
	/**
	 * sets the attribute observers to the observers list given in parameter
	 * @param observers
	*/ 
	public void setObservers(List<Observers> observers) {
		//System.out.print("observer size =>"+observers.size());
		this.observers = observers;
	}
	
	/**
	 * gets the attribute observers to the observers list given in parameter
	 * @return observers
	*/ 
	public List<Observers> getObservers() {
		return this.observers;
	}	


	/**
	 * organizes and plays matches between all players
	 *@param comps the list of all competitors of competition
	 */
	protected abstract void play(List<Competitor> comps) ;
	
	/**
	 * play the match between 2 competitors
	 * @param c the first competitor 
	 * @param c2 the second competitor 
	 */
	protected abstract void playMatch(Competitor c, Competitor c2) ;

	/**
	 * plays the competition 
	 */
	public void play(){
		System.out.println("The results of the competition: ");
		this.play(this.competitors);
		System.out.println(" ");
		//System.out.println("*** Ranking ***");
		System.out.println(this.printRanking());
	}

	/**
	 * returns the string representation of the ranking
	 * @return the string representation of the ranking 
	 */
	protected abstract String printRanking();
	
	/**
	 * affects the string of the Master's Competition to be printed (it is overridden in the class Master)
	 * @param p
	 * @param f
	 * @throws Exception
	 */
	protected void printMaster(List<List<Competitor>> p, List<Competitor> f) throws Exception{
		throw new Exception() ;
	}

	/**
	 * returns the ranking list
	 * @return ranking list 
	 */
	public Map<Competitor, Integer> getRankingCompetitors() {
		return this.rankingCompetitors;
	}
	/**
	 * 
	 * @return the ranking map sort by descending value 
	 */
	public Map<Competitor, Integer> rankingSort(){
		return MapUtil.sortByDescendingValue(this.getRankingCompetitors()) ;
	}

	/**
     * sets the strategy of the Master to the strategy chosen by the user
     * @param s the strategy chosen by the user
     */
    public void setStrategy(Strategy s) {
    	this.strategy = s;
    }

    /**
	 * determines if it's okay to create a league 
	 * @return true if it's okay, false if it's not
     * @throws NotRightNumberException 
	 */
	public boolean leagueIsOK(int size) throws NotRightNumberException {
		if ((size % 2 ) == 0)
			return true;
		throw new NotRightNumberException("The number of competitors must be multiple of 2");
	}
		
	/**
	 * determines if it's okay to create a tournament 
	 * @return true if it's okay, false if it's not
	 * @throws NotRightNumberException 
	 */
	public boolean tournamentIsOK (int size) throws NotRightNumberException {
		
		if (isPowerOf2(size)) 
			return true;
		throw new NotRightNumberException("The number of competitors must be a power of 2");
	}
	
	/**
	 * returns if the size() of the competitors list is a power of 2
	 *@return "true" if competitors numbers is a power of 2, otherwise "false"
	 */
	public static boolean isPowerOf2 (int n ) {
		if (n == 0) 
            return false; 
        while (n != 1) { 
            if (n % 2 != 0) 
                return false; 
            n = n / 2; 
        } 
        return true;
	}
	
	
}


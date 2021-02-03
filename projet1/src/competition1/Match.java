package competition1;

import java.util.ArrayList;
import java.util.List;
//import static java.lang.Math;
import java.util.Random ;

import competition1.observer.*;

 
/**
 * This class implements a macth of the competition between 2 competitors
 *@author COULIBALY Ivette & ADALA Siwar
 *
 */

public class Match implements Observable{

	/**
	 * attributes
	 *@c1 the first competitor
	 *@c2 the second competitor
	 */
	private Competitor c1 ;
	private Competitor c2 ;
	private int previousRatingC1;
	private int previousRatingC2;
	private Competitor winner;
	private Competitor loser;
	private List<Observers> observers;
	
	/**
	 * the match constructor
	 *@c1 the first competitor
	 *@c2 the second competitor
	 */
	public Match(Competitor c1 , Competitor c2) {
		this.c1 = c1 ; 
		this.c2 = c2 ;
		this.observers = new ArrayList<Observers>();
		this.previousRatingC1 = c1.getRating();
		this.previousRatingC2 = c2.getRating(); 
	}
	
	
	/**
	 *returns the first competitor
	 *@return the first competitor 
	 */
	public Competitor getC1() {
		return this.c1 ;
	}
	
	
	/**
	 * returns the second competitor
	 *@return the second competitor 
	 */
	public Competitor getC2() {
		return this.c2 ;
	}
	
	/**
	 * return the previous rating of the winner
	 * @return previous rating of this.winner
	 */
	public int getPreviousRatingC1() {
		return this.previousRatingC1;
	}
	
	/**
	 * modifies the previous rating of the winner
	 */
	public void setPreviousRatingC1(int n) {
		this.previousRatingC1 = n;
	}
	
	/**
	 * return the previous rating of the loser
	 * @return previous rating of this.loser
	 */
	public int getPreviousRatingC2() {
		return this.previousRatingC2;
	}
	
	/**
	 * modifies the previous rating of the loser
	 */
	public void setPreviousRatingC2(int n) {
		this.previousRatingC2 = n;
	}
	
	/**
	 * sets the attribute observers to the observers list given in parameter
	 * @param observers
	 */
	public void setObservers(List<Observers> observers) {
		this.observers = observers;
	}
	
	/**
	 * returns the string representation of the match
	 *@return the string representation of the match
	 */
	public String toString() { 
		return this.c1.getName() + " vs " + this.c2.getName() + " --> " + this.getWinner().getName() + " wins!" ;
	}
	

	/**
	 *
	* return a random number 
	*@return the random number
	*
	*/
	private int randomInt(){
		return (int) ( Math.random() * 2 + 1);
	}
	

	/**
	 * decrement the winner's rating if possible
	 */
	public void ratingWinner() {
		if(this.winner.canDecrement()) 
			this.winner.decrementRating();	
	}
	
	
	/**
	 * increment the loser's rating if possible
	 */
	public void ratingLoser() {
		this.loser.incrementRating();
	}
	
	public void play() {
		int r = this.randomInt();	
		//Competitor c = null;
		switch (r) {
		
			case 1:
				this.c1.addScore();
				this.winner = this.c1;
				setPreviousRatingC1(this.winner.getRating());
				ratingWinner();
				this.loser = this.c2;
				setPreviousRatingC2(this.loser.getRating());
				ratingLoser();
				break;
				
			case 2:
				this.c2.addScore();
				this.winner = this.c2;
				setPreviousRatingC2(this.winner.getRating());
				ratingWinner();
				this.loser = this.c1;
				setPreviousRatingC1(this.loser.getRating());
				ratingLoser();
				break;
				
			default:
				System.out.println(" ! Default !");
				break;
		}
	}

	public int getWinnerPreviousRating(){
		if(c1 == this.winner){
			return this.previousRatingC1 ;
		}
		return this.previousRatingC2 ;
	}

	public int getLoserPreviousRating(){
		if(c1 == this.loser){
			return this.previousRatingC1 ;
		}
		return this.previousRatingC2 ;
	}
	
	/**
	 * give the winner of this match
	 *@return the winner of this match
	 */
	public Competitor getWinner() {
		return this.winner;
	}
	
	/**
	 * give the loser of this match
	 *@return the loser of this match
	 */
	public Competitor getLoser() {
		return this.loser;
	}

	
	/**
	 * gets the attribute observers to the observers list given in parameter
	 * @return observers
	*/ 
	public List<Observers> getObservers() {
		return this.observers;
	}	
	
	/**
	 * adds an Observer to the observers list
	 * @param o Observer
	 */
	@Override
	public void addObserver(Observers o) {
		this.observers.add(o);
	}
	
	
    /**
     * removes the observer from the observers list if it's present
     * @param o the observer
     */
	@Override
	public void removeObserver(Observers o) {
		try {
			int i = this.observers.indexOf(o);
			this.observers.remove(i);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	/**
	 * notifies all the observers of the Competition
	 */
	@Override
	public void notifyObservers() {
		//System.out.println("before");
		for(Observers o : this.observers) {
			//System.out.println("in");
			o.update(this) ;	
		}
	}
	
	
}

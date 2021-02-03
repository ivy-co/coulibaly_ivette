package competition1;
 

/**
 * this class implements the competitor caracterised by his name and his point
 * @author COULIBALY Ivette & ADALA Siwar
 */
public class Competitor {
	
	/**
	 *@name the name of this competitor
	 *@score the score of this competitor
	 *@rating the rating of this competitor
	 */
	private String name ;
	private int score ;
	private int rating; //cote
	
	
	/**
	 * The Competitor's constructor 
	 *@param name the name of this competitor
	 */
	public Competitor(String name) {
		this.name = name ; 
		this.score = 0;
		this.rating = 1;
	}
		
	
	/**
	 * returns the name of this competitor
	 *@return the name of this competitor
	 */
	public String getName() {
		return this.name ;
	}
	
	/**
	 * returns the score of this competitor
	 *@return the score of this competitor
	 */
	public int getScore() {
		return this.score ;
	}
	
	
	/**
	 * returns the rating of this competitor
	 *@return the rating of this competitor
	 */
	public int getRating() {
		return this.rating ;
	}
	
	/**
	 * increments the rating of this competitor
	 */
	public void incrementRating() {
		this.rating += 1 ;
	}
	
	/**
	 * decrements the rating of this competitor
	 */
	public void decrementRating() {
		if (this.canDecrement()){
			this.rating -= 1 ;
		}
		
	}
	
	public boolean canDecrement() {
		if(this.rating == 1) 
			return false;
		return true;
	}
	
	/**
	 * increments the score of this competitor
	 */
	public void addScore() {
		this.score += 1 ;
	}
	
	/**
	 * give the string representation of this competitor
	 *@return the string representation of this competitor
	 */
	public String toString() {
		return this.name + " - " + this.score ;
	}

	/**
	* test of equality between this Competitor and all object
	*@param o the Object to compare to this Competitor
	*@return <code>true</code> if this Competitor is equals to the object , otherwise <code>false</code>
	*/
	public boolean equals(Object o){
		if (o instanceof Competitor ){
			Competitor other = (Competitor) o ;
			return this.getName().equals(other.getName()) && this.getScore() == other.getScore() ;
		}
		if ( o == null)
			return false ;
		return false ;

	}
}


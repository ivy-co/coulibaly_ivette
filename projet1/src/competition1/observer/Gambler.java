package competition1.observer;
import competition1.*;

/**
 * This class implements Gambler of type Observer 
 * @author COULIBALY Ivette & ADALA Siwar
 */
public class Gambler implements Observers {

	private String name;
	/**
	 * create a Gambler with name
	 * @param name
	 */
	public Gambler(String name) {
		this.name = name;
	}

	/**
	 * return the observer name
	 * @return the observer name
	 */
	public String getName(){
		return this.name ;
	}

	/**
	 * do a update of the competitions 
	 * @param o the observable object
	 */
	@Override
	public void update(Observable o) {
		Match m = (Match) o;
		String res = "Victoire de " 
					+ m.getWinner().getName() 
					+ " (cote "
					+ m.getWinnerPreviousRating() + " )"
					+ " face à " 
					+ m.getLoser().getName()
					+ " (cote "
					+ m.getLoserPreviousRating() 
					+ " ). La cote de " 
					+ m.getWinner().getName()
					+ " passe à "
					+ m.getWinner().getRating()
					+ ", celle de "
					+ m.getLoser().getName()
					+ " à "
					+ m.getLoser().getRating()
					+ "." ;
		
		System.out.println(res); 
					
		
	}
}
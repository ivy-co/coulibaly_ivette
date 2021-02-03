package competition1.observer;
import competition1.*;

/**
 * This class implements Journalist of type Observer 
 * @author COULIBALY Ivette & ADALA Siwar
 */
public class Journalist implements Observers {
	
	private String name;

	public Journalist(String name) {
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
	 * do a update of the competition 
	 * @param o the observable object
	 */
	@Override
	public void update(Observable o) {
		Match m = (Match) o;
		String res = "Victoire de " + m.getWinner().getName() + " face à " + m.getLoser().getName() ;
		System.out.println(res);
		//return "Victoire de " + m.getWinner().getName() + " face à " + m.getLoser().getName() ;
	}
}

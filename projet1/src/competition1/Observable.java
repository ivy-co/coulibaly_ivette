package competition1;
import competition1.observer.*;

/**
 * 
 * @author COULIBALY Ivette & ADALA Siwar
 */
public interface Observable {

	public void addObserver(Observers o);
	public void removeObserver(Observers o);
	public void notifyObservers();
}

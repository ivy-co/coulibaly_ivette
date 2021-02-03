package competition1;

import java.util.*;

/**
 * CompetitorAlreadyExistsException is thrown when the given number is wrong
 * @author COULIBALY Ivette & ADALA Siwar
 */
public class CompetitorAlreadyExistsException extends Exception{

    public CompetitorAlreadyExistsException(String msg) {
		super(msg);
	}
	
	public CompetitorAlreadyExistsException() {
		super();
	}
    
}


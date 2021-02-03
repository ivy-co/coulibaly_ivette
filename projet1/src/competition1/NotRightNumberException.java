package competition1;

import java.util.*;

/**
 * NotRightNumberException is thrown when the given number is wrong
 * @author COULIBALY Ivette & ADALA Siwar
 */
public class NotRightNumberException extends Exception{
	
	public NotRightNumberException(String msg) {
		super(msg);
	}
	
	public NotRightNumberException() {
		super();
	}
}

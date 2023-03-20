package Generic;

import java.util.Random;

public class JavaLibrary {

	/**
	 * This method generated for get Random Number
	 * 
	 */
	
	public int randomNum() {
		
		Random ran = new Random();		
		int randomNumner = ran.nextInt(900000);		
		return randomNumner;
	}
}

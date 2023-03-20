package POJO;

import java.util.Random;

public class Ran {

	public static int random() {
		 
		Random r = new Random();
		 int ran = r.nextInt(5000);
		 
		 return ran;
	
		 
	}
	
}

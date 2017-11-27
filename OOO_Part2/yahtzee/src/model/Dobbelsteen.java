package model;

import java.util.concurrent.ThreadLocalRandom;

public class Dobbelsteen {
	
	public static final int MIN_VALUE = 1;
	public static final int MAX_VALUE = 6;
	
	
	
	
	
	public Dobbelsteen() {
		
	}

	
	public int getRandomNumber(){
		return ThreadLocalRandom.current().nextInt(MIN_VALUE, MAX_VALUE+1);
	}

}

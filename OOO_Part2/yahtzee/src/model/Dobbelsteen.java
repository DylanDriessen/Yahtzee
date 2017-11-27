package model;

import java.util.concurrent.ThreadLocalRandom;

import javafx.beans.property.SimpleIntegerProperty;

public class Dobbelsteen {
	
	public static final int MIN_VALUE = 1;
	public static final int MAX_VALUE = 6;
	
	
	
	public final SimpleIntegerProperty property = new SimpleIntegerProperty();
	
	public Dobbelsteen() {
		
	}

	
	
	public void setRandomNumber(){
		property.set((int) ((Math.random()*(MAX_VALUE - MIN_VALUE + 1 )) + MIN_VALUE) ) ;
		System.out.println(property);
	}
	
	
	

}

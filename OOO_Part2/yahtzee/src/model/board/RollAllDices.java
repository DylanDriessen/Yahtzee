package model.board;

import java.awt.List;
import java.util.ArrayList;

import model.factory.DiceFactory;

public class RollAllDices {
	
	
	Dice dice = new Dice();
	Dice dice2= new Dice();
	Dice dice3 = new Dice();
	Dice dice4 = new Dice();
	Dice dice5 = new Dice();
	
	ArrayList<Dice> dices = new ArrayList<Dice>();
	
	
	public RollAllDices() {
		dices.add(dice);
		dices.add(dice2);
		dices.add(dice3);
		dices.add(dice4);
		dices.add(dice5);
	}


	public void rollAllDices(){
		dice.roll(); 
		dice2.roll();
		dice3.roll();
		dice4.roll();
		dice5.roll();
	
		
	
	}
	
	public ArrayList<Dice> getAllDices(){ 
		return this.dices;
	}
}

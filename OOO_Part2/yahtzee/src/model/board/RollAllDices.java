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
		for (Dice dice : dices) {
			if(dice.getRolled() == false) {
				dice.roll();
			}
		}
	}
	
	public ArrayList<Dice> getAllDices(){ 
		return this.dices;
	}
	
	public void resetDices() {
		for (Dice dice : dices) {
			dice.resetEyes();
		}
	}
}

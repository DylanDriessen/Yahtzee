package model.board;

import model.factory.DiceFactory;

public class RollAllDices {

	
	private Dice dice = new Dice();
	private Dice dice2 = new Dice();
	private Dice dice3 = new Dice();
	private Dice dice4 = new Dice();
	private Dice dice5 = new Dice();
	
	public void RollAllDices(){
		dice.roll();
		dice2.roll();
		dice3.roll();
		dice4.roll();
		dice5.roll();
	}
	
}

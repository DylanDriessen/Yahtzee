package model.board;

import java.util.ArrayList;


public class Dices {
	private ArrayList<Dice> dices = new ArrayList<>();
	
	
	public Dices(int maxIndex) {
	dices = new ArrayList<Dice>();
	for(int i = 0; i < maxIndex; i++){ 
		Dice d = new Dice();
		
		dices.add(d);
		}
	
	}
	
	public void rollDices(){
		for(Dice d: dices){
			if(!d.getState().toString().equals("DiceChosenState")) {
				if(!d.getState().toString().equals("NotRollableState")) {
					d.roll();
				}
			}
		}
	}
	
	public ArrayList<Dice> getDices(){
		return this.dices;
	}
	
	public void resetDices() {
		for (Dice dice : dices) {
			dice.resetEyes();
			dice.setState(dice.getNotRolled());
		}
	}
	
	
}

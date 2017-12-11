package model.board;

import java.util.ArrayList;

import model.dice.state.NotRolledState;

public class Dices {
	private ArrayList<Dice> dices = new ArrayList<>();
	
	public Dices(int maxIndex) {
	dices = new ArrayList<Dice>();
	for(int i = 0; i < maxIndex; i++){ // mogelijk fout met maxindex nog -1
		Dice d = new Dice();
		dices.add(d);
	}
	}
	
	public void rollDices(){
		for(Dice d: dices){
			if(!d.getState().toString().equals("NotRollableState") || !d.getState().toString().equals("DiceChosenState")) {
				d.roll();
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

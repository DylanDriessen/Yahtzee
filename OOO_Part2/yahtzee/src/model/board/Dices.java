package model.board;

import java.util.ArrayList;

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
			d.roll();
		}
	}
	
	public ArrayList<Dice> getDices(){
		return this.dices;
	}

}

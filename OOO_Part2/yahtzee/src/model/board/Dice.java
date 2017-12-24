package model.board;

import javafx.scene.layout.StackPane;
import model.dice.state.DiceChosenState;
import model.dice.state.DiceState;
import model.dice.state.NotRollableState;
import model.dice.state.NotRolledState;
import model.dice.state.RollableState;

public class Dice extends StackPane {
	
	private DiceState state;
	private DiceState DiceChosen;
	private DiceState Rollable;
	private DiceState NotRollable;
	private DiceState NotRolled;
	
	private int eyes;
	
	public Dice() {
		this.DiceChosen = new DiceChosenState(this);
		this.Rollable = new RollableState(this);
		this.NotRollable = new NotRollableState(this);
		this.NotRolled = new NotRolledState(this);
		this.state = NotRolled;
	}
	
	public int getEyes() {
		return this.eyes;
	}
	
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public void roll(){
		this.state.rollDice();
		
	}
	
	public void resetEyes() {
		this.eyes = 0;
	}
	
	//Getters and Setters
	
	public void setState(DiceState state) {
		this.state = state;
	}
	
	public DiceState getState() {
		return this.state;
	}
	
	
	public DiceState getDiceChosen() {
		return DiceChosen;
	}
	

	public DiceState getRollable() {
		return Rollable;
	}


	public DiceState getNotRollable() {
		return NotRollable;
	}


	public DiceState getNotRolled() {
		return NotRolled;
	}
}

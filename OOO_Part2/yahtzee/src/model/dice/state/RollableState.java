package model.dice.state;

import java.util.Random;

import model.board.Dice;

public class RollableState implements DiceState {
	
	Dice dice;
	
	public RollableState(Dice dice) {
		this.dice = dice;
	}

	@Override
	public void rollDice() {
		this.dice.setEyes(randomize());
	}
	
	private int randomize(){
		Random random = new Random();
		int numberShowing = random.nextInt(6)+1;
		return numberShowing;
	}

	@Override
	public void chooseDice() {
		this.dice.setState(dice.getDiceChosen());
	}
	
	@Override
	public String toString() {
		return "RollableState";	
	}
}

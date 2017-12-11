package model.dice.state;

import java.util.Random;

import exception.DomainException;
import model.board.Dice;

public class NotRolledState implements DiceState {
	
	Dice dice;
	
	public NotRolledState(Dice dice) {
		this.dice = dice;
	}

	@Override
	public void rollDice() {
		this.dice.setState(dice.getRollable());
		this.dice.setEyes(randomize());
	}
	
	private int randomize(){
		Random random = new Random();
		int numberShowing = random.nextInt(6)+1;
		return numberShowing;
	}

	@Override
	public void chooseDice() {
		throw new DomainException("Dice has not been rolled yet");	
	}
}

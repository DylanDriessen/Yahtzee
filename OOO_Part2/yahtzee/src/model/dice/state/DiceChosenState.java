package model.dice.state;

import exception.DomainException;
import model.board.Dice;

public class DiceChosenState implements DiceState {
	
	Dice dice;
	
	public DiceChosenState(Dice dice) {
		this.dice = dice;
	}

	@Override
	public void rollDice() {
		throw new DomainException("Dice has been chosen and is unable to roll");
	}

	@Override
	public void chooseDice() {
		this.dice.setState(dice.getRollable());
	}
	
	@Override
	public String toString() {
		return "DiceChosenState";
	}
}

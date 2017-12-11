package model.dice.state;

import exception.DomainException;
import model.board.Dice;

public class NotRollableState implements DiceState {
	
	Dice dice;
	
	public NotRollableState(Dice dice) {
		this.dice = dice;
	}

	@Override
	public void rollDice() {
		throw new DomainException("Can't roll the dice");
	}

	@Override
	public void chooseDice() {
		throw new DomainException("Can't choose the dice because you can't throw it");		
	}

	@Override
	public String toString() {
		return "NotRollableState";
	}
}

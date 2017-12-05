package model.score;

import java.util.List;

import exception.DomainException;
import model.board.Dice;

public class LargeStraight implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		int i = 0;
		int total = 0;
		int diceEyes = 1;
		for(Dice dice : dices) {
			if(dice.getEyes() == diceEyes) { 
				total++;
				diceEyes++;
			}
		}
		if(total >= 5) i = total;
		
		total = 0;
		diceEyes = 2;
		for(Dice dice : dices) {
			if(dice.getEyes() == diceEyes) { 
				total++;
				diceEyes++;
			}
		}
		if(total >= 5) i = total;
		
		
		
		if(i < 5)throw new DomainException("No 4 sequential eyes");
		
		return 40;
	}
}

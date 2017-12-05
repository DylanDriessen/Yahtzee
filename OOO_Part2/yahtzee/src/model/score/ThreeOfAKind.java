package model.score;

import java.util.List;

import exception.DomainException;
import model.board.Dice;

public class ThreeOfAKind implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		int score = 0;
		int sameDice = 0;
		int diceNeeded = 0;
		
		for(Dice dice : dices) {
			sameDice = 0;
			
			for(Dice dice2 : dices) {
				if(dice.getEyes() == dice2.getEyes()) sameDice++;
			}
			
			if (sameDice >= 3) diceNeeded = dice.getEyes();
		}
		
		
		if(diceNeeded == 0) return 0;
		
		for(Dice dice : dices) {
			score = score + dice.getEyes();
		}
		
		return score;
	}

}

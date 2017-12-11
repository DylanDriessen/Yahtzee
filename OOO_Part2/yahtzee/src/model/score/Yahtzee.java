package model.score;

import java.util.List;

import exception.DomainException;
import model.board.Dice;
import model.board.Dices;

public class Yahtzee implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		int sameDice = 0;
		boolean yathzee = false;

		for(Dice dice : dices) {
			sameDice = 0;
			
			for(Dice dice2 : dices) {
				if(dice.getEyes() == dice2.getEyes()) sameDice++;
			}
			
			if (sameDice == 6) yathzee = true;
		}
		
		if(!yathzee) return 0;
		
		return 50;
	}

}

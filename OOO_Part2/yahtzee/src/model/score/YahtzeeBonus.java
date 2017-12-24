package model.score;

import java.util.List;

import model.board.Dice;

public class YahtzeeBonus implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		return 0;
	}
	
	
	
}

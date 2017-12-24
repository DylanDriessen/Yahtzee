package model.score;

import java.util.List;

import model.board.Dice;

public class LargeStraight implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		boolean een = false;
		boolean twee = false;
		boolean drie = false;
		boolean vier = false;
		boolean vijf = false;
		boolean zes = false;
		for (Dice dice : dices) {
			if (dice.getEyes() == 1) {
				een = true;
			}
		}
		for (Dice dice : dices) {
			if (dice.getEyes() == 6) {
				zes = true;
			}
		}
		for (Dice dice : dices) {
			if (dice.getEyes() == 2)
				twee = true;
			if (dice.getEyes() == 3)
				drie = true;
			if (dice.getEyes() == 4)
				vier = true;
			if (dice.getEyes() == 5)
				vijf = true;
		}
		if ((een == true || zes == true) && twee == true && drie == true && vier == true && vijf == true) {
			return 40;
		} else
			return 0;
	}
}
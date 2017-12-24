package model.score;

import java.util.List;

import model.board.Dice;

public class SmallStraight implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		boolean een = false;
		boolean twee = false;
		boolean drie = false;
		boolean vier = false;
		boolean vijf = false;
		boolean zes = false;
		for (Dice dice : dices) {
			if (dice.getEyes() == 1)
				een = true;
			if (dice.getEyes() == 2)
				twee = true;
			if (dice.getEyes() == 3)
				drie = true;
			if (dice.getEyes() == 4)
				vier = true;
			if (dice.getEyes() == 5)
				vijf = true;
			if (dice.getEyes() == 6)
				zes = true;
		}
		if (((twee == true || zes == true) && drie == true && vier == true && vijf == true)
				|| (een == true && twee == true && drie == true && vier == true)) {
			return 30;
		} else
			return 0;
	}
}

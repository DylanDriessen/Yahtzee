package model.score;

import java.util.List;

import com.sun.javafx.geom.transform.CanTransformVec3d;

import model.board.Dice;
import model.board.Dices;

public class Twos implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		int score = 0;
		
		for (Dice dice : dices) {
			if(dice.getEyes() == 2) score = score + 2;
		}
		
		return score;
	}

}

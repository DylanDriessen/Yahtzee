package model.score;

import java.util.List;

import com.sun.javafx.geom.transform.CanTransformVec3d;

import model.board.Dice;

public class Fours implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		int score = 0;
		
		for (Dice dice : dices) {
			if(dice.getEyes() == 4) score = score + 4;
		}
		
		return score;
	}

}

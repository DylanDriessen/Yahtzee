package model.score;

import java.util.List;

import exception.DomainException;
import model.board.Dice;

public class SmallStraight implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		boolean one = false;
		boolean two = false;
		boolean three = false;
		boolean four = false;
		boolean five = false;
		boolean six = false;
		
		for(int i = 0; i < dices.size(); i++) {
			if(dices.get(i).getEyes() == 1) one = true;
			if(dices.get(i).getEyes() == 2) two = true;
			if(dices.get(i).getEyes() == 3) three = true;
			if(dices.get(i).getEyes() == 4) four = true;
		}
		
		if(one && two && three && four) return 30;
		
		one = false;
		two = false;
		three = false;
		four = false;
		
		for(int i = 0; i < dices.size(); i++) {
			if(dices.get(i).getEyes() == 5) five = true;
			if(dices.get(i).getEyes() == 2) two = true;
			if(dices.get(i).getEyes() == 3) three = true;
			if(dices.get(i).getEyes() == 4) four = true;
		}
		
		if(five && two && three && four) return 30;
		
		five = false;
		two = false;
		three = false;
		four = false;
		
		for(int i = 0; i < dices.size(); i++) {
			if(dices.get(i).getEyes() == 5) five = true;
			if(dices.get(i).getEyes() == 2) six = true;
			if(dices.get(i).getEyes() == 3) three = true;
			if(dices.get(i).getEyes() == 4) four = true;
		}
		
		if(five && six && three && four) return 30;
		
		five = false;
		six = false;
		three = false;
		four = false;
		
		return 0;
	}
}

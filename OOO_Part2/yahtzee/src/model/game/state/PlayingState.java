package model.game.state;

import java.util.List;

import model.board.Dice;
import model.board.Dices;
import model.game.Game;
import model.game.PersonalGame;
import model.player.Player;

public class PlayingState implements GameState {


	public PlayingState() {
	}

	@Override
	public int getScore(Dices dices) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Dices getDices(Dices dices) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public String toString() {
		return "PlayingState";
	}

}

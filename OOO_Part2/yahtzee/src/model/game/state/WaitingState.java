package model.game.state;

import java.util.List;

import exception.DomainException;
import model.board.Dice;
import model.board.Dices;
import model.game.Game;
import model.game.PersonalGame;
import model.player.Player;

public class WaitingState implements GameState {
	
	public WaitingState() {
	}

	@Override
	public int getScore(Dices dices) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Dices getDices(Dices dices) {
		throw new DomainException("This player is waiting for his/her turn");
	}
	
	
	@Override
	public String toString() {
		return "WaitingState";
	}
	
	
}

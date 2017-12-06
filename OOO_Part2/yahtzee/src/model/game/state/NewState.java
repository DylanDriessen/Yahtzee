package model.game.state;

import java.util.List;

import exception.DomainException;
import model.board.Dice;
import model.board.Dices;
import model.game.Game;
import model.game.PersonalGame;
import model.player.Player;

public class NewState implements GameState {

	
		public NewState() {
			
		}

		@Override
		public int getScore(Dices dices) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Dices getDices(Dices dices) {
			throw new DomainException("This player has not played yet");
		}
	
	
	
		@Override
		public String toString() {
			return "NewState";
		}
	

	
}

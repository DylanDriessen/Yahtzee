package model.game.state;

import java.util.List;

import model.board.Dice;
import model.board.Dices;
import model.game.Game;
import model.player.Player;

public class FinishedState implements GameState {


		public FinishedState() {
		}

		@Override
		public int getScore(Dices dices) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Dices getDices(Dices dices) {
			return dices;
		}
	
		@Override
		public String toString() {
			return "FinishedState";
		}
}

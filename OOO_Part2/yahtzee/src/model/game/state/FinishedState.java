package model.game.state;

import model.board.Dice;
import model.game.Game;
import model.game.PersonalGame;
import model.player.Player;

public class FinishedState implements GameState {

	// nu per situatie de states definieren, bij finished state kan hij niet beginnen aan een wachtende, starten	
	
	 PersonalGame personalGame;

		public FinishedState(PersonalGame newPersonalGame) {
			personalGame = newPersonalGame;
		}
	
	@Override
	public void newState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitingState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startedState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finishedState() {
		// TODO Auto-generated method stub
		
	}

	
}

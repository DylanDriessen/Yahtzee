package model.game.state;

import model.board.Dice;
import model.game.Game;
import model.player.Player;

public interface GameState {

	void newState();
	void waitingState();
	void startedState();
	void finishedState();	
}

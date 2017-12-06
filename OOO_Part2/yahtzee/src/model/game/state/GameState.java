package model.game.state;

import java.util.List;

import model.board.Dice;
import model.board.Dices;
import model.game.Game;
import model.player.Player;

public interface GameState {

	int getScore(Dices dices);
	Dices getDices(Dices dices);
	
}

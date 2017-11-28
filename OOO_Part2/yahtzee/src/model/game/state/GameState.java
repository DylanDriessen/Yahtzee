package model.game.state;

import model.board.Dice;
import model.game.Game;
import model.player.Player;

public interface GameState {

	void leftClicked(Dice dices, Player player, Game game);

	void leftClicked(Dice dices);

	
}

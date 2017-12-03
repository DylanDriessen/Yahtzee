package model.game.state;

import model.board.Dice;
import model.game.Game;
import model.player.Player;

public class StartedState implements GameState {
	
	Game game = new Game();
	
	public StartedState(Game game){
		this.game = game;
	}

	@Override
	public void leftClicked(Dice dices) {
//		if(dices.getHold()){
//			return;
//		}
//		// TODO Auto-generated method stub		
	}

	@Override
	public void leftClicked(Dice dices, Player player, Game game) {
		// TODO Auto-generated method stub
		
	}

}

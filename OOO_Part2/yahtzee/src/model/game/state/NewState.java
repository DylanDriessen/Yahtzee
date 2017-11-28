package model.game.state;

import exception.DomainException;
import model.board.Dice;
import model.game.Game;
import model.player.Player;

public class NewState implements GameState {
	
	Game game = new Game();
	
	public NewState(Game game){
		this.game = game;
	}
	
	@Override
	public void leftClicked(Dice dices){
		if(!dices.getHold()){
			throw new DomainException("First roll the dices");
		}
	}

	@Override
	public void leftClicked(Dice dices, Player player, Game game) {
		// TODO Auto-generated method stub
		
	}	
	
	
}

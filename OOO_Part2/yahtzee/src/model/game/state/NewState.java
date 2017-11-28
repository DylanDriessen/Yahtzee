package model.game.state;

import exception.DomainException;
import model.board.Dice;
import model.game.Game;

public class NewState implements GameState {
	
	Game game = new Game();
	
	public NewState(Game game){
		this.game = game;
	}
	
	@Override
	public void leftClicked(Dice dices){
		if(!dices.rolled()){
			throw new DomainException("First roll the dices");
		}
	}
	
	
	
}

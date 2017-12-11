package model.facade;

import java.util.ArrayList;

import model.game.Game;
import model.game.PersonalGame;
import model.player.Player;
public class ModelFacade implements IModelFacade {
	
Game game;
	
	public ModelFacade(){
		game = new Game();
	}
	@Override
	public void addPlayer(String naam) {
		game.addPersonalGame(naam);
		System.out.println("text");
	}
	@Override
	public Player getNextPersonalGame() {
		return game.getNextPlayer();
	}
	@Override
	public void start() {
		game.Start();
	}
	
	@Override
	public String getnaam() {
		return game.getCurrentPlayer().getNaam();
	}

	@Override
	public Player getCurrentPersonalGame() {
		return game.getCurrentPlayer();
	}
	@Override
	public ArrayList<String> getALLPlayersNames() {
		System.out.println("test");
		return game.getAllPlayersNames();
	}
	
}

package model.facade;

import java.util.ArrayList;

import model.game.Game;
import model.game.PersonalGame;
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
	public PersonalGame getNextPersonalGame() {
		return game.getNextPersonalGame();
	}
	@Override
	public void start() {
		game.Start();
	}
	
	@Override
	public String getnaam() {
		return game.getCurrentPersonalGame().getPlayer().getNaam();
	}

	@Override
	public PersonalGame getCurrentPersonalGame() {
		return game.getCurrentPersonalGame();
	}
	@Override
	public ArrayList<String> getALLPlayersNames() {
		System.out.println("test");
		return game.getAllPlayersNames();
	}
	
}

package model.facade;

import model.game.Game;
import model.game.PersonalGame;
import model.score.Score;

public class ModelFacade implements IModelFacade {
	
Game game;
	
	public ModelFacade(){
		game = new Game();
	}
	
	@Override
	public void addPlayer(String naam) {
		game.addPersonalGame(naam);
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
	public Score getScore() {
		return game.getCurrentPersonalGame().getScore();
	}
	@Override
	public PersonalGame getCurrentPersonalGame() {
		return game.getCurrentPersonalGame();
	}
	
}

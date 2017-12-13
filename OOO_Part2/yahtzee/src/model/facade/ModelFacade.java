package model.facade;

import java.util.ArrayList;
import java.util.Locale.Category;

import model.board.Dice;
import model.game.Game;
import model.player.Player;
public class ModelFacade implements IModelFacade {
	
Game game;
	
	public ModelFacade(){
		game = new Game();
	}
	@Override
	public void addPlayer(String naam) {
		game.addPlayer(naam);
		System.out.println("text");
	}
	@Override
	public Player getNextPlayer() {
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
	public Player getCurrentPlayer() {
		return game.getCurrentPlayer();
	}
	@Override
	public ArrayList<String> getALLPlayersNames() {
		System.out.println("test");
		return game.getAllPlayersNames();
	}
	@Override
	public void rollDices() {
		game.rollDices();
		
	}
	@Override
	public ArrayList<Dice> getAllDices() {
		return game.getAllDices();
	}
	@Override
	public int GetTurnsLeft() {
		return 0;
	}
	
	@Override
	public Game getGame(){
		return this.getGame();
	}
}

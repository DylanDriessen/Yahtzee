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
	@Override
	public int getIndexCurrentPlayer() {
		return game.getIndexNextPersonalGame();
	}
	@Override
	public void setNextPlayer() {
		game.nextPlayer();
	}
	@Override
	public void resetDices() {
		game.resetDices();
	}
	@Override
	public void reduceChance() {
		game.getTurn().reduceChance();
	}
	@Override
	public int getscore(String category) {
		System.out.println(game.getTurn().getPointsCategory(category));
		return game.getTurn().getPointsCategory(category);
	}
	@Override
	public void deleteCategory(String Category) {
		System.out.println(Category);
	}
	
}

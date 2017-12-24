package model.facade;

import java.util.ArrayList;


import model.board.Dice;
import model.game.Game;
import model.player.Player;
import model.score.Categories;
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
//	@Override
//	public int GetTurnsLeft() {
//		return 0;
//	}
//	
	@Override
	public Game getGame(){
	return this.getGame();	}
	@Override
	public int getIndexCurrentPlayer() {
		return game.getIndexCurrentPlayer();
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
		return game.getTurn().getPointsCategory(category);
	}
	@Override
	public int getPredictedScore(String category) {
		return game.getTurn().getPointsPredictedCategory(category);
	}
	@Override
	public void deleteCategory(String Category) {
		System.out.println(game.getTurn().getPointsCategory(Category));
	}
	
	@Override
	public ArrayList<Categories> playerCategories(String name) {
		return game.playerCategories(name);
	}
	@Override
	public int getIndexNextPlayer() {
		return game.getIndexNextPlayer();
	}
	@Override
	public int getHighestScore() {
		return game.getHighestScore();
	}
	@Override
	public String getPlayerHighestScore() {
		return game.getPlayerWithHighestScore();
	}
	@Override
	public boolean gameFinished() {
		if(!game.rondesOver()){
			return false;
		}
		return true;
	}
	@Override
	public String getWinner() {
		return game.getWinner();
	}
	@Override
	public String getLoser() {
		return game.getLoser();
	}
	@Override
	public int getChancesTurn() {
		return game.getChancesTurn();
	}
	@Override
	public void removeAllPlayers() {
		game.removeAllPlayers();
	}

}

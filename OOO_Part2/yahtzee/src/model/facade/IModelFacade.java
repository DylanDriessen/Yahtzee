package model.facade;

import java.util.ArrayList;


import model.board.Dice;
import model.game.Game;
import model.player.Player;
import model.score.Categories;

public interface IModelFacade {
	void addPlayer(String naam);
	void start();
	String getnaam();
	Player getCurrentPlayer();
	Player getNextPlayer();
	ArrayList<String> getALLPlayersNames();
	void rollDices();
	ArrayList<Dice> getAllDices();
//	int GetTurnsLeft();
	public int getIndexCurrentPlayer();
	public void setNextPlayer();
	Game getGame();
	void resetDices();
	void reduceChance();
	int getscore(String category);
	int getPredictedScore(String category);
	void deleteCategory(String Category);
	
	ArrayList<Categories> playerCategories(String name);
	int getIndexNextPlayer();
	int getHighestScore();
	String getPlayerHighestScore();
	String getWinner();
	String getLoser();
	boolean gameFinished();
	int getChancesTurn();
	void removeAllPlayers();
	}


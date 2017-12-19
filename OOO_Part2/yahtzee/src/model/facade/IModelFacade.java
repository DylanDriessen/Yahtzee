package model.facade;

import java.util.ArrayList;
import java.util.Locale.Category;

import model.board.Dice;
import model.game.Game;
import model.player.Player;

public interface IModelFacade {
	void addPlayer(String naam);
	void start();
	String getnaam();
	Player getCurrentPlayer();
	Player getNextPlayer();
	ArrayList<String> getALLPlayersNames();
	void rollDices();
	ArrayList<Dice> getAllDices();
	int GetTurnsLeft();
	public int getIndexCurrentPlayer();
	public void setNextPlayer();
	Game getGame();
	void resetDices();
	void reduceChance();
	int getscore(String category);
	void deleteCategory(String Category);
	}


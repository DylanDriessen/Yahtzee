package model.facade;

import java.util.ArrayList;

import model.board.Dice;
import model.game.PersonalGame;
import model.player.Player;

public interface IModelFacade {
	void addPlayer(String naam);
	void start();
	String getnaam();
	Player getCurrentPersonalGame();
	Player getNextPersonalGame();
	ArrayList<String> getALLPlayersNames();
	void rollDices();
	ArrayList<Dice> getAllDices();
	}


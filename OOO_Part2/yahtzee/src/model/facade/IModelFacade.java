package model.facade;

import java.util.ArrayList;

import model.board.Dice;


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
	}


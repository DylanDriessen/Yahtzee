package model.facade;

import java.util.ArrayList;

import model.game.PersonalGame;

public interface IModelFacade {
	void addPlayer(String naam);
	void start();
	String getnaam();
	PersonalGame getCurrentPersonalGame();
	PersonalGame getNextPersonalGame();
	ArrayList<String> getALLPlayersNames();
	
	}


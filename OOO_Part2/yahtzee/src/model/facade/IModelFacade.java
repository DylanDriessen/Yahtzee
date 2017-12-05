package model.facade;

import model.game.PersonalGame;

public interface IModelFacade {
	void addPlayer(String naam);
	void start();
	String getnaam();
	PersonalGame getCurrentPersonalGame();
	PersonalGame getNextPersonalGame();
	
	}


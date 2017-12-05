package model.facade;

import model.game.PersonalGame;
import model.score.Score;

public interface IModelFacade {
	void addPlayer(String naam);
	void start();
	String getnaam();
	Score getScore();
	PersonalGame getCurrentPersonalGame();
	PersonalGame getNextPersonalGame();
	
	}


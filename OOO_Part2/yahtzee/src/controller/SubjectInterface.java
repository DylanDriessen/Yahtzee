package controller;

import view.board.ObserverInterface;

public interface SubjectInterface {
		
	public void register(ObserverInterface o);
	public void unregister(ObserverInterface o);
	public void notifyObserver();
	void notifyScoreboardObserver(int score, int place);
	void notifyPredictions(int score, int place);
	void notifyGameFrames();
}

package controller;

import view.board.ObserverInterface;

public interface SubjectInterface {
		
	public void register(ObserverInterface o);
	public void unregister(ObserverInterface o);
	public void notifyObserver();

}

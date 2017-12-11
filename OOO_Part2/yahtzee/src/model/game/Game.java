package model.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import controller.Observer;
import exception.DomainException;
import model.game.state.GameState;

import model.player.Player;

public class Game implements Subject{
	PersonalGame info = new PersonalGame();
	private ArrayList<PersonalGame> game;
	private int indexNextPersonalGame;
 	private ArrayList<Observer> observers;
	
	public Game(){
		game = new ArrayList<>();
		this.setIndexNextPersonalGame(indexNextPersonalGame);
		observers = new ArrayList<>();
	}
	
	public ArrayList<String> getAllNames(){
		ArrayList<String> persons = new ArrayList<>();
		for (PersonalGame ps: game){
			persons.add(ps.getPlayer().getNaam());
		}
		System.out.println(persons);
		return persons;
	}
	public void addPersonalGame(String naam){
		Player player = new Player(naam);
		PersonalGame pg = new PersonalGame(player);
 		game.add(pg);
 		
 	}
 	
 	public void deletePersonalGame(PersonalGame personalGame){
 		game.remove(personalGame);
 		
 	}

 	
 	public int getIndexNextPersonalGame(){
 		return indexNextPersonalGame;
 	}
 	
 	public PersonalGame getNextPersonalGame(){
		return game.get(indexNextPersonalGame);
 	}
 	
 	private void setIndexNextPersonalGame(int IndexNextPlayer){
 		if(this.indexNextPersonalGame >= game.size()){ // mogelijke fout mss = weg
 			this.indexNextPersonalGame = 0;
 		}
 		else{
 			this.indexNextPersonalGame++;
 		}
 	}
 	public PersonalGame getCurrentPersonalGame(){
 		if (indexNextPersonalGame <= 0){
 			return game.get(game.size()-1);
 		}
 		return game.get(indexNextPersonalGame-1);
 	}
 	public void Start(){
 		if (game.size()<=1){
 			throw new IllegalArgumentException("Minimum 2 players required");
 		}
 		else this.setIndexNextPersonalGame(-1);
 	}
 	
 	public ArrayList<String> getAllPlayersNames(){
 		ArrayList<String> games = new ArrayList<>();
 		for (int i = 0; i < game.size(); i++){
 			games.add(game.get(i).getPlayer().getNaam());
 		}
		return games;	
 		

 	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		
	}

	@Override
	public void unregister(Observer deleteObserver) {
		
		int index = observers.indexOf(deleteObserver);
		observers.remove(index);
		
	}

	@Override
	public void notifyObserver() {
		
		for(Observer o: observers){
			o.update();
		}
		
	}
 	
 	//public void setNextPlayer() {
 	//	int i = 0;
 	//	int x = 0;
 	//	boolean found = false;
 	//	
 	//	if(spelers == null || spelers.isEmpty() || spelers.size() <= 1) {
 	//		throw new DomainException("Give at least 2 players");
 	//	}
 	//	
 	//	for (Player player : spelers) {
 	//		if(player.getTrun() && !spelers.get(spelers.size()-1).equals(player)) {
 	//			found = true;
 	//			player.setTurn(false);
 	//			x = i + 1;
 	//		} else if (spelers.get(spelers.size()-1).equals(player)) {
 	//			x = 0;
 	//		}
 	//		i++;
 	//	}
 	//	
 	//	if (!found) {
 	//		spelers.get(0).setTurn(true);
 	//	} else {
 	//		spelers.get(x).setTurn(true);
 	//	}
 	//}
 	
 	
 



 		
 
 
 }


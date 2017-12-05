package model.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exception.DomainException;
import model.player.Player;

public class Game {
	private ArrayList<PersonalGame> game;
	private int indexNextPersonalGame;
 	
	public Game(){
		game = new ArrayList<>();
		this.setIndexNextPersonalGame(indexNextPersonalGame);
	}
	
	
	public void addPersonalGame(String naam){
		Player player = new Player(naam);
		PersonalGame pg = new PersonalGame(player);
 		game.add(pg);
 	}
 	
 	public void deletePersonalGame(PersonalGame personalGame){
 		game.remove(personalGame);
 		
 	}
 	//public Player playerIsInGame(String naam){
 	//	if(naam == null){
	//		throw new DomainException("No name given");
	//	}
 	//	
	//	for(Player s: game.){
	//		if(s.getTrun()){
	//			return s;
	//		}
	//	}
	//	
	//	throw new DomainException("Player does not exists");
	//	
	//}
 	//
 	//public PersonalGame getNextPlayer(String naam){
 	//	return getPlayer(naam);
 	//	int i = 0;
 	//	for(PersonalGame s: game){
	//		if(s.getNaam().equals(naam)){
	//			return spelers.get(i+1).getNaam();
	//		}if(i == spelers.size()){
	//			return spelers.get(0).getNaam();
	//		}else{
	//			i++;
	//		}
	//	}
	//	return spelers.get(i+1).getNaam();
 	//}
 	
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
 	 
 	
 	/*public PersonalGame inGamePlayer(String name) {
 		if(game.isEmpty()) {
 			throw new DomainException("No players");
 		}
 		
 		for (PersonalGame player : game) {
 			if (player.getPlayer().getNaam().equals(name)) {
 				return player;
 			}
 		}
 		
 		throw new IllegalArgumentException("player does not exist");
 	}*/
 	
 	
 	public ArrayList<PersonalGame> getAllPlayers(){
 		ArrayList<PersonalGame> games = new ArrayList<>();
 		for (PersonalGame Player : game){
 			games.add(Player);
 		}
		return games;	
 		
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



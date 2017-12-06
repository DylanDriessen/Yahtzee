package model.game;

import java.util.ArrayList;
import model.player.Player;

public class Game {
	private ArrayList<PersonalGame> game;
	private int indexNextPersonalGame;
 	
	public Game(){
		game = new ArrayList<>();
		this.setIndexNextPersonalGame(indexNextPersonalGame);
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
 }
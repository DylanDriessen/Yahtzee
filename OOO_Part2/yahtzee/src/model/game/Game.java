package model.game;

import java.util.ArrayList;

import exception.DomainException;
import model.board.Dice;
import model.board.Dices;
import model.player.Player;
import model.score.Categories;
import model.score.SimpleCatagoryStrategy;
import model.turn.Turn;

public class Game {
	private ArrayList<Player> players;
	private int indexNextPlayer;
	private Dices dices;
	private SimpleCatagoryStrategy catagories;
	private Turn turn;
 	
	public Game(){
		this.players = new ArrayList<>();
		this.dices = new Dices(5);
		this.catagories = new SimpleCatagoryStrategy();
	}
	
	public void Start(){
 		if (players.size()<=1){
 			throw new IllegalArgumentException("Minimum 2 players required");
 		}
 		else {
 			indexNextPlayer = 1;
 			this.turn = new Turn(3, this.getCurrentPlayer(), this.catagories, this.dices);
 		}
 	}
	
	public void nextPlayer() {
		setIndexNextPlayer();
		this.turn = new Turn(3, this.getCurrentPlayer(), this.catagories, this.dices);
	}
	
	public void rollDices() {
		this.dices.rollDices();;
	}
	
	public ArrayList<Dice> getAllDices(){
		return this.dices.getDices();
	}
	public void chooseDice(Dice dice) {
		this.turn.setChosenDice(dice);
	}
	
	public void addScore(Categories category) {
		this.getCurrentPlayer().addScore(this.turn.getScore(category));
	}
 		
	public ArrayList<String> getAllNames(){
		ArrayList<String> persons = new ArrayList<>();
		for (Player player: players){
			persons.add(player.getNaam());
		}
		System.out.println(persons);
		return persons;
	}
	
	public void addPlayer(String naam){
		Player player = new Player(naam);
		this.players.add(player);
 	}
 	
 	public void deletePlayer(Player player){
 		players.remove(player);
 	}
 	
 	public int getIndexNextPlayer() {
 		return indexNextPlayer;
 	}
 	
 	public int getIndexCurrentPlayer(){
 		if(indexNextPlayer == 0) {
 			return players.size()-1;
 		}
 		return indexNextPlayer -1;
 	}
 	
 	public Player getNextPlayer(){
		return players.get(indexNextPlayer);
 	}
 	
 	private void setIndexNextPlayer(){
 		if(indexNextPlayer == players.size()-1) {
 			indexNextPlayer = 0;
 		} else {
 			indexNextPlayer++;
 		}
 	}
 	
 	public Player getCurrentPlayer(){
 		return players.get(getIndexCurrentPlayer());
 	}
 	
 	
 	public ArrayList<String> getAllPlayersNames(){
 		ArrayList<String> games = new ArrayList<>();
 		for (int i = 0; i < players.size(); i++){
 			games.add(players.get(i).getNaam());
 		}
		return games;	
 	}
 	
 	public void resetDices(){
 		dices.resetDices();
 	}
 	
 	public Turn getTurn() {
 		return this.turn;
 	}
 	
 	public String getChosenCategory() {
 		return this.turn.getChosenCategory();
 	}
 	
 	public ArrayList<Categories> playerCategories(String name){
 		Player player = new Player();
 		for (Player p : players) {
 			if(p.getNaam().equals(name)) player = p;
 		}
 		return player.getCategories();
 	}
 }
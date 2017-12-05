package controller;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.board.Dice;
import model.board.RollAllDices;
import model.game.Game;
import model.game.PersonalGame;
import model.player.Player;
import view.board.MakeContent;

public class YahtzeeController{
	
	private Game spel;
	
	private RollAllDices cup = new RollAllDices();
	
	public YahtzeeController(){
		this.spel = new Game();
	}
	
	//Player methods
	
	public void voegSpelerToe(String naam){
		spel.addPersonalGame(naam);
	}
	
	public void deleteSpeler(PersonalGame personalGame){
		spel.deletePersonalGame(personalGame);
	}
	
	public PersonalGame getSpeler(Player player){
		return spel.getNextPersonalGame();
	}
	
	public ArrayList<PersonalGame> getAll(){
		return spel.getAllPlayers();
	}
	
		//Speler beindigt beurt
	//public void endTurn(int turn, List<Integer> diceEyes) {  
	//	spel.inGamePlayer().addDicesThrown(turn, diceEyes);
	//	cup.resetDices();
	//	spel.setNextPlayer();
	//}
	
	//RollDice methods
	
	public ArrayList<Dice> getAllDices(){
		return cup.getAllDices();
	}
	
	public void rollDices() {
		cup.rollAllDices();
	}
	
}
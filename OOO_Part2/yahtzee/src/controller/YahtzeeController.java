package controller;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.board.Dice;
import model.board.RollAllDices;
import model.game.Game;
import model.player.Player;
import view.board.MakeContent;
import view.board.MakeNewBoard;

public class YahtzeeController{
	
	private Game spel;
	
	private RollAllDices cup = new RollAllDices();
	
	public YahtzeeController(){
		this.spel = new Game();
	}
	
	//Player methods
	
	public void voegSpelerToe(Player speler){
		spel.voegToe(speler);
	}
	
	public void deleteSpeler(Player speler){
		spel.deleteSpeler(speler);
	}
	
	public Player getSpeler(Player player){
		return spel.getPlayer(player);
	}
	
	public List<Player> getAll(){
		return spel.getAllPlayers();
	}
	
		//Speler beëindigt beurt
	public void endTurn(int turn, List<Integer> diceEyes) {  
		spel.inGamePlayer().addDicesThrown(turn, diceEyes);
		cup.resetDices();
		spel.setNextPlayer();
	}
	
	//RollDice methods
	
	public ArrayList<Dice> getAllDices(){
		return cup.getAllDices();
	}
	
	public void rollDices() {
		cup.rollAllDices();
	}
	
}
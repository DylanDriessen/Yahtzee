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
	
	private MakeNewBoard board = new MakeNewBoard();
	private RollAllDices cup = new RollAllDices();
	
	public YahtzeeController(){
		this.spel = new Game();
	}
	
	
	public void voegSpelerToe(Player speler){
		spel.voegToe(speler);
	}
	
	public void deleteSpeler(Player speler){
		spel.deleteSpeler(speler);
	}
	
	public String getSpeler(String naam){
		
		
		return spel.getPlayer(naam);
	}
	
	public List<Player> getAll(){
		return spel.getAllPlayers();
	}
	
	public ArrayList<Dice> getAllDices(){
		return cup.getAllDices();
	}
	
	public void rollDices() {
		cup.rollAllDices();
	}
	
}
package controller;

import java.util.List;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.game.Game;
import model.player.Player;
import view.board.MakeContent;
import view.board.MakeNewBoard;

public class YahtzeeController{
	
	private Game spel;
	private MakeContent content = new MakeContent();
	private MakeNewBoard board = new MakeNewBoard();
	
	public YahtzeeController(){
		this.spel = new Game();
	}
	
	
	public void voegSpelerToe(Player speler){
		spel.voegToe(speler);
	}
	
	public void deleteSpeler(Player speler){
		spel.deleteSpeler(speler);
	}
	
	public Player getSpeler(String naam){
		return spel.getPlayer(naam);
	}
	
	public List<Player> getAll(){
		return spel.getAllPlayers();
	}
	
	public Pane makeContent(){
		return content.maakContent() ;
	}
	
	public void makeNewBoard(Stage primaryStage, String naam,Pane dices) throws Exception {
		board.makeBoard(primaryStage, naam, this.makeContent());
	}
	
	
}
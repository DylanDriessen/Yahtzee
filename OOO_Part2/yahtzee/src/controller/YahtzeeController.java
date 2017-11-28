package controller;

import java.util.List;

import model.game.Game;
import model.player.Player;

public class YahtzeeController{
	
	private Game spel;
	
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
	
}
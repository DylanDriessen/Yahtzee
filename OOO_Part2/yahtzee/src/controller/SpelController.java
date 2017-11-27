package controller;

import java.util.List;

import model.Spel;
import model.Speler;

public class SpelController{
	
	private Spel spel;
	
	public SpelController(){
		spel = new Spel();
	}
	
	
	public void voegSpelerToe(Speler speler){
		spel.voegToe(speler);
	}
	
	public void DeleteSpeler(Speler speler){
		spel.deleteSpeler(speler);
	}
	
	public Speler getSpeler(String naam){
		return spel.getPlayer(naam);
	}
	
	public List<Speler> getAll(){
		return spel.getAllPlayers();
	}
	
}
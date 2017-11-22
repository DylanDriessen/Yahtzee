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
	
	public Speler getSpeler(String id){
		return spel.getPlayer(id);
	}
	
	public List<Speler> getAll(){
		return spel.getAll();
	}
	
}
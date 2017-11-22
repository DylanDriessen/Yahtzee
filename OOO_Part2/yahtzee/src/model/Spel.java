package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Speler;

public class Spel {
	private Map<String, Speler> spelers = new HashMap<String, Speler>();
 
 	public void voegToe(Speler speler){
 		if(spelers == null){
 			throw new IllegalArgumentException();
 		}
 		
 		spelers.put(speler.getNaam(), speler);
 		
 	}
 	
 	public void deleteSpeler(Speler speler){
 		spelers.remove(speler);
 		
 	}
 	public Speler getPlayer(String naam){
 		if(naam == null){
			throw new DomainException("No id given");
		}
		return spelers.get(naam);
	}
 	
 	
 	public List<Speler> getAll(){
		return new ArrayList<Speler>(spelers.values());	
 		
 	}
 }



package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Speler;

public class Spel {
	private ArrayList<Speler> spelers;
 

 	
	public Spel(){
		spelers = new ArrayList<>();
	}
	
	
	public void voegToe(Speler speler){
 		spelers.add(speler);
 		
 	}
 	
 	public void deleteSpeler(Speler speler){
 		spelers.remove(speler.getId());
 		
 	}
 	public Speler getPlayer(String naam){
 		if(naam == null){
			throw new DomainException("No name given");
		}
		for(Speler s: spelers){
			if(s.getNaam().equals(naam)){
				return s;
			}
		}
		return null;
	}
 	
 	
 	public List<Speler> getAllPlayers(){
		return spelers;	
 		
 	}
 }



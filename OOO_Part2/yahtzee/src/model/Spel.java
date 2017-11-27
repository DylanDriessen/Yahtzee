package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Speler;

public class Spel {
	private ArrayList<Speler> spelers;
 
<<<<<<< HEAD
 	
	public Spel(){
		spelers = new ArrayList<>();
	}
	
	
	public void voegToe(Speler speler){
 		spelers.add(speler);
=======
 	public void voegToe(Speler speler){
 		if(speler == null){
 			throw new IllegalArgumentException();
 		}
 		
 		spelers.put(speler.getNaam(), speler);
>>>>>>> e6cb358e464ee460e822173e25e05ad9d5279e44
 		
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



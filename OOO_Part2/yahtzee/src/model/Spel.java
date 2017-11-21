package model;

import java.util.ArrayList;
import java.util.List;

public class Spel {
 private List<Speler> spelers = new ArrayList<>();
 
 	public void voegToe(Speler speler){
 		if(spelers == null){
 			throw new IllegalArgumentException();
 		}
 		
 		spelers.add(speler);
 		
 	}
 	
 	public void deleteSpeler(Speler speler){
 		spelers.remove(speler);
 		
 	}
 	public Speler getPlayer(Speler speler){
 		try{
 			for(Speler s: spelers){
 		
 			if(s.equals(speler)){
 				return speler;
 			}
 		}
 		}
 		catch(IllegalArgumentException e){
 			throw new IllegalArgumentException();
 		}
 	
 		return null;
 		
 	}
 	
 	}

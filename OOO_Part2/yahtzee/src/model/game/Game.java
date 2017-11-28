package model.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exception.DomainException;
import model.player.Player;

public class Game {
	private ArrayList<Player> spelers;
 

 	
	public Game(){
		spelers = new ArrayList<>();
	}
	
	
	public void voegToe(Player speler){
 		spelers.add(speler);
 		
 	}
 	
 	public void deleteSpeler(Player speler){
 		spelers.remove(speler.getId());
 		
 	}
 	public Player getPlayer(String naam){
 		if(naam == null){
			throw new DomainException("No name given");
		}
		for(Player s: spelers){
			if(s.getNaam().equals(naam)){
				return s;
			}
		}
		return null;
	}
 	
 	
 	public List<Player> getAllPlayers(){
		return spelers;	
 		
 	}
 }


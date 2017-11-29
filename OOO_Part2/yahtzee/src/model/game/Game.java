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
 		spelers.remove(speler);
 		
 	}
 	public Player playerIsInGame(String naam){
 		if(naam == null){
			throw new DomainException("No name given");
		}
 		
		for(Player s: spelers){
			if(s.getNaam().equals(naam)){
				return s;
			}
		}
		
		throw new DomainException("Player does not exists");
		
	}
 	
 	public String getNextPlayer(String naam){
 		int i = 0;
 		for(Player s: spelers){
			if(s.getNaam().equals(naam)){
				return spelers.get(i+1).getNaam();
			}if(i == spelers.size()){
				return spelers.get(0).getNaam();
			}else{
				i++;
			}
		}
		return spelers.get(i+1).getNaam();
 	}
 	public String getPlayer(String naam){
 		int i = 0;
 		for(Player s: spelers){
			if(s.getNaam().equals(naam)){
				return spelers.get(i).getNaam();
			}
			i++;
		}
		return spelers.get(i).getNaam();
 	}
 	
 	
 	public List<Player> getAllPlayers(){
		return spelers;	
 		
 	}
 }



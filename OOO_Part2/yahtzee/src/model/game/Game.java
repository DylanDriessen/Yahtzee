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
			if(s.getTrun()){
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
 	
 	public Player getPlayer(Player player){
 		int i = 0;
 		for(Player s: spelers){
			if(s.equals(player)){
				return spelers.get(i);
			}
			i++;
		}
		return spelers.get(i);
 	}
 	
 	
 	
 	
 	public Player inGamePlayer() {
 		if(spelers.isEmpty()) {
 			throw new DomainException("No players");
 		}
 		
 		for (Player player : spelers) {
 			if (player.getTrun()) {
 				return player;
 			}
 		}
 		
 		return spelers.get(0);
 	}
 	
 	
 	public List<Player> getAllPlayers(){
		return spelers;	
 		
 	}
 	
 	public void setNextPlayer() {
 		int i = 0;
 		int x = 0;
 		boolean found = false;
 		
 		if(spelers == null || spelers.isEmpty() || spelers.size() <= 1) {
 			throw new DomainException("Give at least 2 players");
 		}
 		
 		for (Player player : spelers) {
 			if(player.getTrun() && !spelers.get(spelers.size()-1).equals(player)) {
 				found = true;
 				player.setTurn(false);
 				x = i + 1;
 			} else if (spelers.get(spelers.size()-1).equals(player)) {
 				x = 0;
 			}
 			i++;
 		}
 		
 		if (!found) {
 			spelers.get(0).setTurn(true);
 		} else {
 			spelers.get(x).setTurn(true);
 		}
 	}
 	
 	
 }



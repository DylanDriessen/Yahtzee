package model.player;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import exception.DomainException;

public class Player {
	
	private String naam;
	private String id;
	private boolean turn = false;
	private HashMap<Integer, List<Integer>> dicesThrown = new HashMap<>();

	public Player(String naam){
		this.setNaam(naam);
	}
	
	public Player() {
		
	}

	public String getNaam() {
		return naam;
	}

	private void setNaam(String naam) {
		this.naam = naam;
	}
	
	public String getId(){
		return id;
	}
	
	public void setID(){
		this.id = UUID.randomUUID().toString();
		
	}
	
	public void setTurn(boolean turn) {
		this.turn = turn;
	}
	
	public boolean getTrun() {
		return this.turn;
	}
	
	public void addDicesThrown(int turn, List<Integer> diceEyes) {
		if (diceEyes == null || diceEyes.isEmpty()) {
			throw new DomainException("No diceEyes given");
		}
		dicesThrown.put(turn, diceEyes);
	}
	
	public HashMap<Integer, List<Integer>> getDicesThrown(){
		return this.dicesThrown;
	}
	
}


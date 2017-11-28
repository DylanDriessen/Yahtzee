package model.player;

import java.util.UUID;

public class Player {
	
	private String naam;
	private String id;

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
	
	private void setID(){
		this.id = UUID.randomUUID().toString();
		
	}
}

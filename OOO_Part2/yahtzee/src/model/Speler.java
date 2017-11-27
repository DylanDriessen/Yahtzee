package model;

import java.util.UUID;

public class Speler {
	
	private String naam;
	private String id;

	public Speler(String naam){
		this.setNaam(naam);
		
	
	}
	
	public Speler() {
		
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


package model.player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import exception.DomainException;
import model.score.Categories;

public class Player {
	
	private String naam;
	private String id;
	private boolean turn = false;
	private HashMap<Integer, List<Integer>> dicesThrown = new HashMap<>();
	private int score;
	private ArrayList<Categories> categories;

	public Player(String naam){
		this.setNaam(naam);
		this.score = 0;
		
//		Categories[] categoriesEnum = Categories.values();
//		for (Categories category : categoriesEnum) {
//			this.categories.add(category);
//		}
	}
	
	public Player() {
		this.score = 0;
		
		Categories[] categoriesEnum = Categories.values();
		for (Categories category : categoriesEnum) {
			this.categories.add(category);
		}
	}
	
	public void removeCategory(Categories categoryToRemove) {
		this.categories.remove(categoryToRemove);
	}
	
	public ArrayList<Categories> getCategories(){
		return this.categories;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void addScore(int score) {
		this.score = this.score + score;
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


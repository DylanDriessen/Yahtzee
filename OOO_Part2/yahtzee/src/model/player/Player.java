package model.player;

import java.util.ArrayList;


import model.score.Categories;

public class Player {
	
	private String naam;
	private int score;
	private ArrayList<Categories> categories = new ArrayList<>();

	public Player(String naam){
		this.setNaam(naam);
		this.score = 0;
		
		for (Categories category : Categories.values()) {
			this.categories.add(category);
		}
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
	

}


package model.turn;


import java.util.ArrayList;

import exception.DomainException;
import model.board.Dice;
import model.board.Dices;
import model.player.Player;
import model.score.Categories;
import model.score.SimpleCatagoryStrategy;

public class Turn {
	
	int chances;
	Player player;
	SimpleCatagoryStrategy category;
	Dices dices;
	Categories chosenCategory;
	
	public Turn(int chances, Player player, SimpleCatagoryStrategy category, Dices dices) {
		setChances(chances);
		setPlayer(player);
		setCatagory(category);
		setDices(dices);
	}
	
	public int getScore(Categories category) {
		int sameDices = 0;
		ArrayList<Integer> diceEyes = new ArrayList<>();
		if(category.equals(Categories.YAHTZEE)) {
			player.setYahzeeScore(this.getCatagory().catagory(category).getPoints(dices.getDices()));
		}
		for(int i = 0; i < dices.getDices().size(); i++) {
			diceEyes.add(dices.getDices().get(i).getEyes());
		}
		
		int firstDice = diceEyes.get(0);
		for (Integer j : diceEyes) {
			if(j == firstDice) sameDices++;
		}
		int points = 0;
		boolean containsC = false;
		for(Categories c : player.getCategories()) {
			if(c.toString().trim().equals("YAHTZEE")) {
				player.addTimesYahtzee(1);
				containsC = true;
			}
		}
		if(containsC == false && sameDices == 5) {
			if (player.getTimesYahtzee() == 2 && player.getYahzeeScore() != 0) {
			points = points + 100;
			player.addTimesYahtzee(1);
			} else {
				player.addTimesYahtzee(1);
			}
		}
		points = points + this.getCatagory().catagory(category).getPoints(dices.getDices());
		setChosenCategory(category);
		this.player.removeCategory(category);
		return points;
	}
	
	public int getPredictedScore(Categories category) {				
		int points = this.getCatagory().catagory(category).getPoints(dices.getDices());
		setChosenCategory(category);
		return points;
	}
	
	public void setChosenCategory(Categories category) {
		this.chosenCategory =  category;
	}

	public String getChosenCategory() {
		return chosenCategory.toString();
	}
	
	public void setChosenDice(Dice chosenDice) {
		for (Dice dice : dices.getDices()) {
			if (dice.equals(chosenDice)) dice.getState().chooseDice();
		}
	}
	
	public void reduceChance() {
		if (chances == 1) throw new DomainException("You have spend all your chances");
		chances--;
	}
	
	//Getters and Setters

	public int getChances() {
		return chances;
	}

	private void setChances(int chances) {
		this.chances = chances;
	}

	public Player getPlayer() {
		return player;
	}

	private void setPlayer(Player player) {
		this.player = player;
	}

	public SimpleCatagoryStrategy getCatagory() {
		return category;
	}

	private void setCatagory(SimpleCatagoryStrategy category) {
		this.category = category;
	}
	
	private void setDices(Dices dices) {
		this.dices = dices;
	}
	
	public Dices getDices() {
		return this.dices;
	}
	
	public int getPointsCategory(String category){
		for(Categories c : Categories.values()) {
			if(c.toString().equals(category.toUpperCase()))return this.getScore(c);
		}
		return 0;
	}
	
	public int getPointsPredictedCategory(String category){
		for(Categories c : Categories.values()) {
			if(c.toString().equals(category.toUpperCase()))return this.getPredictedScore(c);
		}
		return 0;
	}
	
}
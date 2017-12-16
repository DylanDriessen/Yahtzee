package model.turn;

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
	
	public Turn(int chances, Player player, SimpleCatagoryStrategy category, Dices dices) {
		setChances(chances);
		setPlayer(player);
		setCatagory(category);
		setDices(dices);
	}
	
	public int getScore(Categories category) {
		boolean contains = false;
		
		for(Categories playerCategory : player.getCategories()) {
			if (playerCategory.toString().equals(category.toString())) contains = true;
		}
		
		if (!contains) throw new DomainException("This category has already been chosen");
		
		int points = this.getCatagory().catagory(category).getPoints(dices.getDices());
		this.player.removeCategory(category);
		return points;
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
	
}

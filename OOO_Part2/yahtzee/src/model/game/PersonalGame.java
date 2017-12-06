package model.game;

import java.util.List;

import model.board.Dice;
import model.board.Dices;
import model.game.state.FinishedState;
import model.game.state.GameState;
import model.game.state.NewState;
import model.game.state.PlayingState;
import model.game.state.WaitingState;
import model.player.Player;
import model.score.Categories;
import model.score.Category;
import model.score.SimpleCatagoryClass;

public class PersonalGame {
	private Player player;
	private int maxIndex;
	private SimpleCatagoryClass factory = new SimpleCatagoryClass();
	private Dices dices = new Dices(maxIndex-1); 
	private int score = 0;
	private GameState state;
	
	
	
	public PersonalGame(){
		this.state = new NewState();
	}
	public void setState(GameState state) {
		
		if(state.toString().equals("PlayingState")) {
			this.state = new PlayingState();
		} else if(state.toString().equals("WaitingState")) {
			this.state = new WaitingState();
		} else if(state.toString().equals("FinishedState")) {
			this.state = new FinishedState();
		}
	}

	public PersonalGame(Player player) {
		this.player = player;
		this.setPlayer(player);
		this.setMaxIndex(maxIndex);
	}
	private void setMaxIndex(int maxIndex) {
		this.maxIndex = maxIndex;

	}
	public int getMaxIndex(){
		return maxIndex;
	}
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
	public Dices getDices(){
		return dices;
	}
	
	public void calculateScore(List<Dice> dices, Category categories){
		this.score = score+factory.catagory(categories).getPoints(dices);
	}
	public int getScore(){
		return this.score;
	}
	
	}

package model.game;

import java.util.List;

import model.board.Dice;
import model.board.Dices;
import model.game.state.FinishedState;
import model.game.state.GameState;
import model.game.state.NewState;
import model.game.state.StartedState;
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
	
	GameState waiting;
	GameState playing;
	GameState newGame;
	GameState finished;
	GameState gameState;
	
	
	public PersonalGame(){
		
		waiting =  new WaitingState(this); //this definieert zichzelf
		 playing = new StartedState(this);
		 newGame = new NewState(this);
		 finished = new FinishedState(this);
		
		 gameState = newGame;
	}
	
	public void setGameState(GameState newGameState){
		gameState = newGameState;
	}
	
	public void newState(){
		gameState.newState();
	}
	
	public void waitingState(){
		gameState.waitingState();
	}
	
	public void startedState(){
		gameState.startedState();
	}
	
	public void finishedState(){
		gameState.finishedState();
	}
	
	public GameState getIsPlayingState(){return playing;}
	public GameState getIsNewState(){return newGame;}
	public GameState getIsWaitingState(){return waiting;}
	public GameState getIsFinishedState(){return finished;}
	

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

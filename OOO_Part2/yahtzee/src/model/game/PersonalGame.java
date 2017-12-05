package model.game;

import model.board.Dices;
import model.game.state.FinishedState;
import model.game.state.GameState;
import model.game.state.NewState;
import model.game.state.StartedState;
import model.game.state.WaitingState;
import model.player.Player;
import model.score.Score;

public class PersonalGame {
	private Player player;
	private Score score;
	private int maxIndex;
	private Dices dices = new Dices(maxIndex-1); 
	
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
	
	

	public PersonalGame(Player player, Score score) {
		
		this.player = player;
		this.score = score;

	
	}
	
	
	public PersonalGame(Player player, Score score, int maxIndex) {
		super();
		this.setPlayer(player);
		this.setScore(score);
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
	private void setPlayer(Player player) {
		this.player = player;
	}
	public Score getScore() {
		return score;
	}
	private void setScore(Score score) {
		this.score = score;
	}
	public Dices getDices(){
		return dices;
	}
	}

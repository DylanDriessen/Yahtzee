package model.game;

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
		super();
		this.player = player;
		this.score = score;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	

}

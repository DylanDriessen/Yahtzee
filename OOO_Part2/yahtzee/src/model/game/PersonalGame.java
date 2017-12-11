//package model.game;
//
//import java.util.List;
//
//import model.board.Dice;
//import model.board.Dices;
//import model.game.state.FinishedState;
//import model.game.state.GameState;
//import model.game.state.NewState;
//import model.game.state.PlayingState;
//import model.game.state.WaitingState;
//import model.player.Player;
//import model.score.Categories;
//import model.score.Category;
//import model.score.SimpleCatagoryStrategy;
//
//public class PersonalGame {
//	private Player player;
//	private int maxIndex;
//	private SimpleCatagoryStrategy factory = new SimpleCatagoryStrategy();
//	private Dices dices = new Dices(maxIndex-1); 
//	private int score = 0;
//	private GameState state;
//    GameState waiting;
//    GameState playing;
//    GameState newGame;
//    GameState finished;
//    GameState gameState;
//
//	
//	
//	
//	public PersonalGame(){
//		this.state = new NewState();
//	}
//	public void setState(GameState state) {
//		
//		if(state.toString().equals("PlayingState")) {
//			this.state = new PlayingState();
//		} else if(state.toString().equals("WaitingState")) {
//			this.state = new WaitingState();
//		} else if(state.toString().equals("FinishedState")) {
//			this.state = new FinishedState();
//		}
//	}
//
//	public PersonalGame(Player player) {
//		this.player = player;
//		this.setPlayer(player);
//		this.setMaxIndex(maxIndex);
//       
//        gameState = newGame;
//
//	}
//	
//	
//	
//    public void setGameState(GameState newGameState){
//        gameState = newGameState;
//    }
//   
//
//	private void setMaxIndex(int maxIndex) {
//		this.maxIndex = maxIndex;
//
//	}
//	public int getMaxIndex(){
//		return maxIndex;
//	}
//	
//	public Player getPlayer() {
//		return player;
//	}
//	public void setPlayer(Player player) {
//		this.player = player;
//	}
//	
//	
//	public Dices getDices(){
//		return this.state.getDices(dices);
//	}
//	
//	public void calculateScore(List<Dice> dices, Category categories){
//		//this.score = score+factory.catagory(categories).getPoints(dices);
//	}
//	
//	public int getScore(){
//		return this.state.getScore(dices);
//	}
//	
//	public int getTotalScore() {
//		return this.score;
//	}
//	
//	}

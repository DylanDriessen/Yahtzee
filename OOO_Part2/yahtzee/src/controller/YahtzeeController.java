package controller;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import model.facade.IModelFacade;
import view.facade.IViewFacade;
import view.gameframe.GameFrame;

//package controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javafx.scene.layout.Pane;
//import javafx.stage.Stage;
//import model.board.Dice;
//import model.board.RollAllDices;
//import model.game.Game;
//import model.game.PersonalGame;
//import model.player.Player;
//import view.AskPlayers;
//import view.board.MakeContent;
//import view.gameframe.GameFrame;
//
//public class YahtzeeController{
//	
//	private Game spel;
//	
//	private RollAllDices cup = new RollAllDices();
//	
//	public YahtzeeController(){
//		this.spel = new Game();
//	}
//	
//	//Player methods
//	
//	public void voegSpelerToe(PersonalGame personalGame){
//		spel.addPersonalGame(personalGame);
//	}
//	
//	public void deleteSpeler(PersonalGame personalGame){
//		spel.deletePersonalGame(personalGame);
//	}
//	
//	public PersonalGame getSpeler(Player player){
//		return spel.getNextPersonalGame();
//	}
//	
//
//	
//		//Speler beindigt beurt
//	//public void endTurn(int turn, List<Integer> diceEyes) {  
//	//	spel.inGamePlayer().addDicesThrown(turn, diceEyes);
//	//	cup.resetDices();
//	//	spel.setNextPlayer();
//	//}
//	
//	//RollDice methods
//	
//	public ArrayList<Dice> getAllDices(){
//		return cup.getAllDices();
//	}
//	
//	public void rollDices() {
//		cup.rollAllDices();
//	}
//	
//	public static void main(String[] args) {
////		try {
////			IModelFacade model = new ModelFacade();
////			IViewFacade view = new ViewFacade(model);
////			Stage primaryStage = new Stage();
////			new Speelbord(model, view, primaryStage);
////		} catch (Exception e) {
////		}
//		launch(args);
//	}
////
////	private final IViewFacade view;
////	private final IModelFacade model;
////	private String message;
////	private Stage primaryStage;
////	
////	public Speelbord(IModelFacade model, IViewFacade view, Stage primaryStage) throws Exception {
////		this.model = model;
////		this.view = view;
////		System.out.println("fd");
////		this.primaryStage = primaryStage;
////
////	}
//	
//	public ArrayList<PersonalGame> getAll(){
//		return spel.getAllPlayers();
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		System.out.println("START");
//		YahtzeeController persons = new YahtzeeController();
//		AskPlayers player = new AskPlayers();
//		List<String> result = player.askJavaFxPlayer(primaryStage);
//		List<PersonalGame> players = persons.getAll();
//		for (int i = players.size()-1; i >= 0;i--){	
//			PersonalGame s = players.get(i);
//			Stage stage = new Stage();
//			GameFrame frame = new GameFrame();
//			MakeContent content = new MakeContent();
//			frame.makeFrameWithRoll(primaryStage, s.getPlayer().getNaam());
//			}
//		}
//	
////	public void askPlayersName(String message){
////		List<String> result = new ArrayList<>();
////		String playerName;
////		playerName = this.view.getStringInput(message);
////		result.add(playerName);
////		System.out.println("test");
////	}
//	
//}
	
	public class YahtzeeController extends Application{
		
		private IModelFacade model;
		private IViewFacade view;
		private ArrayList<String> result = new ArrayList<>();
		Stage primaryStage = new Stage();
		
		public YahtzeeController(IModelFacade model, IViewFacade view, Stage primaryStage) {
			this.model = model;
			this.view = view;
			try {
				this.start(primaryStage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try {
		
			} catch (Exception e) {
				throw new IllegalArgumentException("werkt niet");
			}
		}

		
		
		
		
		
		@Override
		public void start(Stage primaryStage) throws Exception {
			view.askPlayers(result, primaryStage);
			}
		
		
		
		
		
	}
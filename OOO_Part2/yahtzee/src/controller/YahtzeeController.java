package controller;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.board.Dice;
import model.facade.IModelFacade;
import model.player.Player;
import view.board.ObserverInterface;

import view.gameframe.GameFrame;


	
	public class YahtzeeController extends Application implements SubjectInterface {
		
		private IModelFacade model;
		Stage primaryStage = new Stage();
		GameFrame frame = new GameFrame();
		

		private ArrayList<ObserverInterface> observers = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<String> playerNames;

		

		
		public YahtzeeController(IModelFacade model, Stage primaryStage) {
			this.model = model;
			this.setDices();

			
			this.notifyObserver();
			

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
			
			Stage stage = new Stage();
	        Group root = new Group();	
	        Scene scene = new Scene(root, 400, 400, Color.BEIGE);
	        stage.setScene(scene);
	        Button btn = frame.nameButon();
	        Button startBtn = frame.startGame();
	        TextField field = frame.spelerField();
	        int y = 180;
	        for(int i = 0; i < model.getALLPlayersNames().size(); i++){
	        	Label naam = new Label();
	        	naam.setText(model.getALLPlayersNames().get(i));
	        	naam.setTranslateX(35);
	    		naam.setTranslateY(y);
	    		root.getChildren().add(naam);
	    		y += 30;
	        }
	        this.playerNames = model.getALLPlayersNames();
	        btn.setOnMouseClicked(event -> {this.getNames(field.getText());
	        stage.close();}); // namen toevoegen aan Game
	        startBtn.setOnMouseClicked(event -> {stage.close();this.makeFrames(model.getALLPlayersNames());});
	        root.getChildren().addAll(btn,startBtn,field);
	        stage.show();
		}
		
		private void setDices(){
			int i = 0;
			for(int j = 0; j <= 4; j++){
				result.add(0);
			}
			System.out.println(result);
		}
		
		private void rollDices(){
			model.rollDices();

			ArrayList<Dice> dices = model.getAllDices();
			int j = 0;
			for(int i = dices.size()-1; i >=0; i--){
				result.set(j, dices.get(i).getEyes());
				j++;
			}
			this.notifyObserver();
		}
		
		
		
		private Button RollButton(){
			Button btn = new Button("Roll Dices");
			btn.setOnMouseClicked(event -> this.rollDices());
			
			btn.setTranslateX(300);
			btn.setTranslateY(300);
			return btn;
		}
		
		private void getNames(String text) {
			model.addPlayer(text);
			try {
				start(primaryStage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		private void makeFrames(ArrayList<String> resultNaam){
	
			for (String name : playerNames) {
				GameFrame gameFrame = new GameFrame();
				Stage stage = new Stage();
				String naam = name;
				String currentName = model.getCurrentPlayer().getNaam();
				this.observers.add(gameFrame);
				gameFrame.makeFrameWithRoll(stage, naam,currentName, this.RollButton(), result);
			}
			
		}

		@Override
		public void register(ObserverInterface newObserver) {
			observers.add((GameFrame)newObserver );

		}
		@Override
		public void unregister(ObserverInterface o) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void notifyObserver() {

			System.out.println("test");
			frame.update(result);
			for(ObserverInterface observer : observers) {
				observer.update(result);
			}
<<<<<<< HEAD
=======

>>>>>>> ff45afebc209c0b1540c86cedbbe7979e9912e65

			
		}

		

	}
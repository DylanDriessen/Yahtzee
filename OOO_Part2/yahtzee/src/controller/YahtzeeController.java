package controller;

import java.util.ArrayList;

import exception.DomainException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.ObserverInterfaces.DiceObserver;
import model.board.Dice;
import model.facade.IModelFacade;
import model.score.Categories;
import view.board.ObserverInterface;
import view.gameframe.GameFrame;


	
	public class YahtzeeController extends Application implements SubjectInterface,DiceObserver {
		
		private IModelFacade model;
		Stage primaryStage = new Stage();
		GameFrame frame = new GameFrame();
		

		private ArrayList<ObserverInterface> observers = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<String> playerNames;
		String category;

		
		public YahtzeeController(){
			
		}
		
		public YahtzeeController(IModelFacade model, Stage primaryStage) {
			this.model = model;
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
	        stage.close();}); 
	        startBtn.setOnMouseClicked(event -> {
	        	try {
	        		model.start();
	        		stage.close();
		        	this.makeFrames(model.getALLPlayersNames());
		        	((GameFrame) observers.get(0)).addButtons();
		        	setButtonClickEvent();
		        	for(ObserverInterface o : observers) {
		        		setClicableDices((GameFrame)o);
		        	}
	        	} catch (Exception e) {
	        		Text text = new Text();
	        		text.setText(e.getMessage());
	        		text.setTranslateY(230);
	        		text.setTranslateX(30);
	        		root.getChildren().add(text);
	        	}
	        	});
	        root.getChildren().addAll(btn,startBtn,field);
	        stage.show();
	        
		}
		
		private void rollDices(){
			model.rollDices();

			ArrayList<Dice> dices = model.getAllDices();
			int j = 0;
			for(int i = dices.size()-1; i >=0; i--){
				result.set(i, dices.get(i).getEyes()); //Veranderd naar i -> om visueel dobbelsteen opzij te zetten
				j++;
			}
			try {
				model.reduceChance();
			} catch(DomainException e) {
				getCurrentPlayerFrame().addError(e.getMessage());
				getCurrentPlayerFrame().getButtons().remove(2);
			}
			this.notifyObserver();
		}
	
		
		private void setButtonClickEvent() {
			Button nextButton = (Button)getCurrentPlayerFrame().getButtons().get(0);
			Button button = (Button)getCurrentPlayerFrame().getButtons().get(2);
			button.setOnMouseClicked(event -> {
				this.rollDices();
				setClicableDices(getCurrentPlayerFrame());
				});
			
			nextButton.setOnMouseClicked(event -> {
				resetDices(getCurrentPlayerFrame());
				getCurrentPlayerFrame().removeButtons();
				getNextPlayerFrame().addButtons();
				setButtonClickEvent();
				});
			
			model.resetDices();
			ArrayList<Dice> dices = model.getAllDices();
			int j = 0;
			for(int i = dices.size()-1; i >=0; i--){
				result.set(j, dices.get(i).getEyes());
				j++;
			}
			notifyObserver();
		}
		
		private GameFrame getCurrentPlayerFrame() {
			return (GameFrame) this.observers.get(model.getIndexCurrentPlayer());
		}
		
		private GameFrame getNextPlayerFrame() {
			model.setNextPlayer();
			return (GameFrame) this.observers.get(model.getIndexCurrentPlayer());
		}
		
		private void getNames(String text) {
			model.addPlayer(text);
			try {
				start(primaryStage);
			} catch (Exception e) {
				
			}
		}
		
		
		
		private void makeFrames(ArrayList<String> resultNaam){
			for (String name : playerNames) {
				GameFrame gameFrame = new GameFrame();
				Stage stage = new Stage();
				String naam = name;
				String currentName = model.getCurrentPlayer().getNaam();
				this.observers.add(gameFrame);
				gameFrame.makeFrameWithRoll(stage, naam,currentName, result);
			}
			
		}
		
		private void setClicableDices(GameFrame gameFrame) {
			for(Node node : gameFrame.getVisualDices()) {
				if(gameFrame.translateRectangle(node)!=null) {
					gameFrame.translateRectangle(node).setOnMouseClicked(event -> 
					{
						gameFrame.translateRectangle(node).setTranslateY(100);				
						gameFrame.translateText(gameFrame.getVisualDices().get(gameFrame.getVisualDices().indexOf(node)+5)).setTranslateY(100);
						model.getAllDices().get(gameFrame.getVisualDices().indexOf(node)).setState(
								model.getAllDices().get(gameFrame.getVisualDices().indexOf(node)).getDiceChosen());
								System.out.println("The index is " + gameFrame.getVisualDices().indexOf(node));
					});
				}
			}
		}
		
		private void resetDices(GameFrame gameFrame) {
			for (Node node : gameFrame.getVisualDices()) {
				if(gameFrame.translateRectangle(node)!=null) {
					gameFrame.translateRectangle(node).setTranslateY(200);
				}
				if(gameFrame.translateText(node)!=null) {
					gameFrame.translateText(node).setTranslateY(200);
				}
			}
		}

		@Override
		public void register(ObserverInterface newObserver) {
			observers.add((GameFrame)newObserver );

		}
		@Override
		public void unregister(ObserverInterface o) {
			observers.remove(o);
		}

		@Override
		public void notifyObserver() {
			frame.update(result);
			for(ObserverInterface observer : observers) {
				observer.update(result);
			}
		}


		@Override
		public void update(int i) {
			System.out.println("kaka");
			System.out.println(i);
			 model.getGame().getAllDices().get(i).setState(model.getGame().getAllDices().get(i).getNotRollable());
		}


		

	}
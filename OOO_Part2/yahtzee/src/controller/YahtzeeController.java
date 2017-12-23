package controller;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
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
import model.turn.Turn;
import view.board.ObserverInterface;
import view.gameframe.GameFrame;
import view.gameframe.WelcomeScreen;
import view.gameframe.endGameObserver;


	
	public class YahtzeeController extends Application implements SubjectInterface,DiceObserver,endGameObservable {
		
		private IModelFacade model;
		Stage primaryStage = new Stage();
		GameFrame frame = new GameFrame();
		WelcomeScreen welcomeScreen;
		ArrayList<ObserverInterface> observers = new ArrayList<>();
		ArrayList<endGameObserver> endGames = new ArrayList<>();
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
		
			
			//New mehtod
			this.playerNames = model.getALLPlayersNames();
			this.welcomeScreen = new WelcomeScreen(playerNames);
	        welcomeScreen.getButtons().getChildren().get(0).setOnMouseClicked(event -> {this.getNames(welcomeScreen.getTextField().getText());});
	        welcomeScreen.getButtons().getChildren().get(1).setOnMouseClicked(event -> {
	        	try {
	        		model.start();
	        		welcomeScreen.getStage().close();
		        	this.makeFrames(model.getALLPlayersNames());
		        	((GameFrame) observers.get(0)).addButtons(model.getCurrentPlayer().getCategories());
		        	setButtonClickEvent();
	        	} catch (Exception e) {
	        		Label text = new Label();
	        		text.setText(e.getMessage());
	        		text.setStyle("-fx-text-fill: red;");
	        		welcomeScreen.getGridPane().add(text, 0, 3);
	        	}
	        	});
	        welcomeScreen.getRoot().getChildren().addAll(welcomeScreen.getGridPane());
	        welcomeScreen.getStage().show();
	        
		}
		
		private void rollDices(){
			model.rollDices();
			setClicableDices(getCurrentPlayerFrame());
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
				getCurrentPlayerFrame().getButtons().remove(0);
			}
			this.notifyObserver();
		}
	
		
		private void setButtonClickEvent() {
			Button nextButton = (Button)getCurrentPlayerFrame().getButtons().get(2);
			Button button = (Button)getCurrentPlayerFrame().getButtons().get(0);
			Button end = (Button)getCurrentPlayerFrame().getButtons().get(3);
            ComboBox<Categories> categories = (ComboBox<Categories>)getCurrentPlayerFrame().getButtons().get(1);
            categories.setOnAction(event -> {category = categories.getSelectionModel().getSelectedItem().toString();
            								model.deleteCategory(category);
            								
            								
            });
            
            end.setOnMouseClicked(event -> {
            	getCurrentPlayerFrame().removeButtons();
            	getCurrentPlayerFrame().removeDices();
            	
            	notifyText(model.getPlayerHighestScore(), model.getHighestScore());
            
            });
			button.setOnMouseClicked(event -> {
				this.rollDices();
				});
			
			nextButton.setOnMouseClicked(event -> {
				try {
					model.getCurrentPlayer().addScore(model.getscore(category));
					notifyScoreboardObserver(model.getscore(category), Categories.valueOf(category).getScore());
					notifyGameFrames();
					getCurrentPlayerFrame().resetErrors();
					resetDices(getCurrentPlayerFrame());
					setUnClicableDices(getCurrentPlayerFrame());
					getCurrentPlayerFrame().removeButtons();
					getNextPlayerFrame().addButtons(model.getNextPlayer().getCategories());
					model.setNextPlayer();
					setButtonClickEvent();
				} catch(NullPointerException e) {
					getCurrentPlayerFrame().resetErrors();
					getCurrentPlayerFrame().addError("Select a category");
				}
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
			return (GameFrame) this.observers.get(model.getIndexNextPlayer());
		}
		
		private void getNames(String text) {
			model.addPlayer(text);
			try {
				welcomeScreen.getStage().close();
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
				gameFrame.makeFrameWithRoll(stage, naam,currentName, result, 0, model.playerCategories(name));
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
					});
				}
			}
		}
		
		private void setUnClicableDices(GameFrame gameFrame) {
			for(Node node : gameFrame.getVisualDices()) {
				if(gameFrame.translateRectangle(node)!=null) {
					gameFrame.translateRectangle(node).setOnMouseClicked(event -> {});
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
			
			model.getGame().getAllDices().get(i).setState(model.getGame().getAllDices().get(i).getNotRollable());
//			getScores();
		}
		
		
		
		public void notifyScoreboardObserver(int score, int place) {
			getCurrentPlayerFrame().updateScoreboard(score, place, model.getCurrentPlayer().getScore());
		}
		
		
		public void notifyGameFrames() {
			for (ObserverInterface o : observers) {
				((GameFrame)o).updateCurrentName(model.getNextPlayer().getNaam());
			}
		}


		@Override
		public void notifyText(String name, int score) {
			getCurrentPlayerFrame().updateEndGame(name, score);
			
		}
		
		
		
		
}
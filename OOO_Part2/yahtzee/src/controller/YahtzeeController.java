package controller;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.board.Dice;
import model.facade.IModelFacade;
import view.facade.IViewFacade;
import view.gameframe.GameFrame;


	
	public class YahtzeeController extends Application{
		
		private IModelFacade model;
		
		private ArrayList<String> result = new ArrayList<>();
		Stage primaryStage = new Stage();
		GameFrame frame = new GameFrame();
		private int player = 0;
		List<Label> labels = new ArrayList<>();;	
		
		public YahtzeeController(IModelFacade model, Stage primaryStage) {
			this.model = model;
			this.setDices();
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
	        	naam.setText(model.getCurrentPlayer().getNaam());
	        	naam.setTranslateX(35);
	    		naam.setTranslateY(y);
	    		root.getChildren().add(naam);
	    		y += 30;
	        }
	        btn.setOnMouseClicked(event -> {this.getNames(field.getText());
	        stage.close();}); // namen toevoegen aan Game
	        startBtn.setOnMouseClicked(event -> this.makeFrames(model.getALLPlayersNames()));
	        root.getChildren().addAll(btn,startBtn,field);
	        stage.show();
		}
		
		private void setDices(){
			int i = 0;
			for(int j = 0; j <= 4; j++){
				Label l = new Label();
				l.setText("0");
				System.out.println(l.getText());
				labels.add(i, l);
				i++;
			}
		}
		
		private void rollDices(){
			model.rollDices();
			int i = 0;
			for(Dice d: model.getAllDices()){
				Label l = new Label();
				l.setText(Integer.toString(d.getEyes()));
				System.out.println(l.getText());
				labels.set(i, l);
				
				i++;
			}
			
				System.out.println(labels);
			
			
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
		
		private void makeFrames(ArrayList<String> result){
			Stage stage = new Stage();
			
			String naam = result.get(0);
			
			frame.makeFrameWithRoll(stage, naam, this.labels, this.RollButton());
			for(int i = 1; i <= result.size(); i++){
				String naam2 = result.get(i);
				Stage stage2 = new Stage();
				frame.makeFrameWithRoll(stage2, naam2, this.labels, this.RollButton());
				
			}
		}

	}
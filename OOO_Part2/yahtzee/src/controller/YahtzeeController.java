package controller;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.facade.IModelFacade;
import view.facade.IViewFacade;
import view.gameframe.GameFrame;


	
	public class YahtzeeController extends Application{
		
		private IModelFacade model;
		private IViewFacade view;
		private ArrayList<String> result = new ArrayList<>();
		Stage primaryStage = new Stage();
		GameFrame frame = new GameFrame();
		private int player = 0;
		
		
		
		
		
		
		
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
			Stage stage = new Stage();
	        Group root = new Group();
	        Scene scene = new Scene(root, 400, 400, Color.BEIGE);
	        stage.setScene(scene);
	        Button btn = frame.nameButon();
	        Button startBtn = frame.startGame();
	        TextField field = frame.spelerField();
	        TableView<String> table = frame.tabelSpelers();
	        btn.setOnMouseClicked(event -> this.getNames(field.getText()));
	        startBtn.setOnMouseClicked(event -> this.makeFrames(model.getALLPlayersNames()));
	        root.getChildren().addAll(btn,startBtn,field,table);
	        stage.show();
		}
		
		
	
		
		private void getNames(String text) {
			model.addPlayer(text);
		}
		
		private void makeFrames(ArrayList<String> result){
			Stage stage = new Stage();
			String naam = result.get(0	);
			frame.makeFrameWithRoll(stage, naam);
			for(int i = 1; i <= result.size(); i++){
				Stage stage2 = new Stage();
				frame.makeFrameWithoutRoll(stage2, result.get(i));
				
			}
		}
		
		
		
		
	}
package controller;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import model.facade.IModelFacade;
import view.facade.IViewFacade;
import view.gameframe.GameFrame;


	
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
			view.askPlayers();
			
			}
		
		
		
		
		
	}
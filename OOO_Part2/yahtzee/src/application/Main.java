package application;
	
import javax.swing.JOptionPane;

import controller.YahtzeeController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.facade.IModelFacade;
import model.facade.ModelFacade;
//import view.Speelbord;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application{
	
	YahtzeeController controller;
	@Override
	public void start(Stage primaryStage) {
		try {
			IModelFacade model = new ModelFacade();
			controller = new YahtzeeController(model, primaryStage);
		} catch(Exception e) {
			JOptionPane.showInputDialog(null, "Het spel kon niet gestart worden wegens een probleem met het opstarten.\n" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

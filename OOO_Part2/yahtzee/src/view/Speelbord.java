package view;



import java.awt.ScrollPane;
import java.util.List;

import javax.swing.JOptionPane;

import controller.SpelController;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Speler;
import view.AskPlayers;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Speelbord extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		SpelController persons = new SpelController();
		AskPlayers player = new AskPlayers();
		
		for(int i = 0; i < 2; i++){
			String naam1 = player.askNewPlayer();
			Speler speler1 =new Speler(naam1);
			persons.voegSpelerToe(speler1);
		}
		
		List<Speler> spelers = persons.getAll();
		
		Group root = new Group();
	    Scene scene = new Scene(root, 300, 130, Color.WHITE);

		GridPane gridpane = new GridPane();
		gridpane.setPadding(new Insets(5));
	    gridpane.setHgap(10);
	    gridpane.setVgap(10);
		primaryStage.setTitle(spelers.get(0).getNaam());
		Label label = new Label(spelers.get(0).getNaam());
		gridpane.add(label, 0, 0);
		root.getChildren().add(gridpane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	
		
		
	}

	
}

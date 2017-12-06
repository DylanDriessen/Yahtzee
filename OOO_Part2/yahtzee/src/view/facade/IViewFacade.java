package view.facade;

import javax.swing.JTable;
import javafx.stage.Stage;

public interface IViewFacade {

	void makeWithRoll(Stage primaryStage, String name);
	void makeWithoutRoll(Stage primaryStage, String name);
	JTable getScoreboard();
	
	void askPlayers();
	

}

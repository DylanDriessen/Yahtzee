package view.facade;

import java.util.List;

import javax.swing.JTable;

import javafx.stage.Stage;

public interface IViewFacade {

	void makeWithRoll(Stage primaryStage, String name);
	void makeWithoutRoll(Stage primaryStage, String name);
	JTable getScoreboard();
	String askPlayers();
	

}

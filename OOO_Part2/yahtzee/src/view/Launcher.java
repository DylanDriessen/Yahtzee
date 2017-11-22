package view;

import javafx.stage.Stage;

public class Launcher {
	public static void main(String[] args){
		Stage primaryStage = new Stage();
		Speelbord ui = new Speelbord();
		try {
			ui.start(primaryStage);
		} catch () {
			
		}
	}
}


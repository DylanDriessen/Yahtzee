package view.scoreboard;


import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class Scoreboard {
	
	GridPane scorebord;
	TextField categorie = new TextField();
	TextField score = new TextField();

	public Scoreboard(){
		scorebord = new GridPane();
		categorie.setText("Categorie");
		score.setText("Score");
		ColumnConstraints col1 = new ColumnConstraints();
	    col1.setPercentWidth(50);
	    scorebord.add(categorie, 0, 0);
	    ColumnConstraints col2 = new ColumnConstraints();
	    col2.setPercentWidth(50);
	    scorebord.add(score, 1, 0);
	}
	
 }
  
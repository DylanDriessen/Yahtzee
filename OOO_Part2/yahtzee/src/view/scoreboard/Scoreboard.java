package view.scoreboard;

import java.util.ArrayList;
import java.util.List;

import controller.YahtzeeController;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.turn.Turn;
import view.wrapper.CategoryScore;

public class Scoreboard {
	
	CategoryScore cs = new CategoryScore();

	public Scoreboard(){

	}
	
	public TableView<CategoryScore> getScoreboard(Turn turn){
		System.out.println("test");
		
		List<CategoryScore> scores = new ArrayList<>();
//		scores = controller.getScores();
		System.out.println("krijgt scores");
		TableView<CategoryScore> table = new TableView<>();
	
		TableColumn<CategoryScore, String> catCol = new TableColumn<>("Categorie");
		catCol.setMinWidth(100);
		catCol.setCellValueFactory(new PropertyValueFactory("category")); //Weet niet of javafx dit automatisch naar string gaat casten

		//Score kolom
		TableColumn<CategoryScore, Number> scoreCol = new TableColumn<>("Score");
		scoreCol.setMinWidth(100);
		scoreCol.setCellValueFactory(new PropertyValueFactory("score"));
//		table.setItems((ObservableList<CategoryScore>) scores);
		System.out.println(cs);
		System.out.println("table return");
    	table.getColumns().setAll(catCol, scoreCol);

		return table;
	}
 }
  
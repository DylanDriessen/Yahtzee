package view.scoreboard;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.score.Categories;
import model.score.Category;
import model.score.SimpleCatagoryStrategy;
import model.turn.Turn;

public class Scoreboard {

	public Scoreboard(){

	}
	
	public TableView<Categories> getScoreboard(int score, Categories category){
		TableView<Categories> table = new TableView<Categories>();

		TableColumn<Categories, String> catCol = new TableColumn<>("Categorie");
		catCol.setMinWidth(100);
		catCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategorie()));

		//Score kolom
		TableColumn<Turn, Number> scoreCol = new TableColumn<>("Score");
		scoreCol.setMinWidth(100);
		scoreCol.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getScore(category)));

		table.getItems().addAll(Categories.values());
		table.getColumns().addAll(catCol, scoreCol);
		
		return table;
	}
	
}
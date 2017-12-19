package view.scoreboard;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.score.Categories;
import model.score.Category;
import model.score.SimpleCatagoryStrategy;

public class Scoreboard {

	public Scoreboard(){

	}
	
	public TableView<Categories> getScoreboard(int score, String category){
		TableView<Categories> table = new TableView<Categories>();

		TableColumn<Categories, String> catCol = new TableColumn<>("Categorie");
		catCol.setMinWidth(100);
		catCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategorie()));

		//Score kolom
		TableColumn<Categories, String> scoreCol = new TableColumn<>("Score");
		scoreCol.setMinWidth(100);
		scoreCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getScore())));

		table.getItems().addAll(Categories.values());
		table.getColumns().addAll(catCol, scoreCol);
		
		return table;
	}
	
}
package view.scoreboard;


import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.score.Categories;

public class Scoreboard {

	public Scoreboard(){

	}
	
	public TableView<Categories> getScoreboard(int score, String category){
		TableView<Categories> table = new TableView<Categories>();

		TableColumn<Categories, String> catCol = new TableColumn<>("Categorie");
		catCol.setMinWidth(200);
		catCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategorie()));

		//Score kolom
		TableColumn<Categories, String> scoreCol = new TableColumn<>("Score");
		scoreCol.setMinWidth(100);
		scoreCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getScore()));

		table.getItems().addAll(Categories.values());
		table.getColumns().addAll(catCol, scoreCol);
		
		return table;
	}
	
}
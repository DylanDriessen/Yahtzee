package view.scoreboard;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.score.Categories;
import model.score.Category;
import model.score.SimpleCatagoryStrategy;

public class Scoreboard {

	public Scoreboard(){

	}
	
	public TableView<Categories> getScoreboard(){
		TableView<Categories> table = new TableView<Categories>();

		TableColumn<Categories, String> catCol = new TableColumn<>("Categorie");
		catCol.setMinWidth(100);
		catCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategorie()));

		//Score kolom
		TableColumn<SimpleCatagoryStrategy, Category> scoreCol = new TableColumn<>("Score");
		scoreCol.setMinWidth(100);
//		scoreCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().catagory(category)));

		table.getItems().addAll(Categories.values());
		table.getColumns().add(catCol);
		
		return table;
	}
}
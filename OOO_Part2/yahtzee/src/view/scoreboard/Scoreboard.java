package view.scoreboard;

import com.sun.javafx.collections.MappingChange.Map;

import controller.YahtzeeController;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.util.Callback;
import javafx.util.StringConverter;
import model.player.Player;
import model.score.Categories;

public class Scoreboard extends Pane {
	
	private Categories categories;
	private YahtzeeController controller;
	private final TableView table = new TableView<>();
	private final ObservableList<Player> data = FXCollections.observableArrayList();

	public Scoreboard(){
		
		TableColumn<Categories, String> catCol = new TableColumn("Categorie");
		catCol.setMinWidth(100);
		catCol.setCellValueFactory(null);
		
		TableColumn<Player, Integer> scoreCol = new TableColumn("Score");
		scoreCol.setMinWidth(100);
		scoreCol.setCellValueFactory(null);
		
		table.setItems(data);
		table.getColumns().add(catCol, scoreCol);
	}
}
		
		
		
//		TableColumn<Player, String> firstNameCol = new TableColumn<>("Categorie");
//		TableColumn<Player, String> lastNameCol = new TableColumn<>("Score");
//		
//		firstNameCol.setCellValueFactory(new MapValueFactory("key"));
//		lastNameCol.setCellValueFactory(new MapValueFactory("value"));
//		
//		Callback<TableColumn<Map, String>, TableCell<Map, String>> cellFactoryForMap = new Callback<TableColumn<Map, String>, TableCell<Map, String>>(){
//			@Override
//			public TableCell call(TableColumn p) {
//				return new TextFieldTableCell(new StringConverter() {
//					@Override
//					public String toString(Object o) {
//						return o.toString();
//					}
//
//					@Override
//					public Object fromString(String s) {
//						return s;
//					}
//				});
//			}
//		};
//		
//		firstNameCol.setCellFactory(cellFactoryForMap);
//		lastNameCol.setCellFactory(cellFactoryForMap);
			
		
//		
//		TableColumn<Map, String> firstDataColumn = new TableColumn<>("Categorie");
//		TableColumn<Map, String> secondDataColumn = new TableColumn<>("Score");
//		
//		firstDataColumn.setCellValueFactory(new MapValueFactory("key"));
//		firstDataColumn.setMinWidth(130);
//		secondDataColumn.setCellValueFactory(new MapValueFactory("value"));
//		secondDataColumn.setMinWidth(98);
//
//
//		
//		table_view.setEditable(true);
//		table_view.getSelectionModel().setCellSelectionEnabled(true);
//		table_view.getColumns().setAll(firstDataColumn, secondDataColumn);
//		Callback<TableColumn<Map, String>, TableCell<Map, String>> cellFactoryForMap = new Callback<TableColumn<Map, String>, TableCell<Map, String>>() {
//			@Override
//			public TableCell call(TableColumn p) {
//				return new TextFieldTableCell(new StringConverter() {
//					public String toString(Object t) {
//						return t.toString();
//					}
//
//					public Object fromString(String string) {
//						return string;
//					}
//				});
//			}
//		};
//		firstDataColumn.setCellFactory(cellFactoryForMap);
//		secondDataColumn.setCellFactory(cellFactoryForMap);
//		add(table_view, 10, 1);
//		setColumnSpan(table_view, 3);
//		setRowSpan(table_view, 13);
//		
//		TilePane tile = new TilePane();
//		tile.setHgap(8);
//		tile.setPrefColumns(1);
//		tile.setPrefRows(15);
//
//		Text aces = new Text("Aces");
//		tile.getChildren().add(aces);
//	    Text two = new Text("Two");
//	    tile.getChildren().add(two);
//	    Text three = new Text("Threes");
//	    tile.getChildren().add(three);
//	    Text fours = new Text("Fours");
//	    tile.getChildren().add(fours); 
//	    Text fives = new Text("Fives");
//	    tile.getChildren().add(fives);
//	    Text sixes = new Text("Sixes");
//	    tile.getChildren().add(sixes);
//	    Text threekind = new Text("3 of a kind");
//	    tile.getChildren().add(threekind); 
//	    Text fourkind = new Text("4 of a kind");
//	    tile.getChildren().add(fourkind);
//	    Text house = new Text("Full house");
//	    tile.getChildren().add(house);
//	    Text smstraight = new Text("Small straight");
//	    tile.getChildren().add(smstraight);
//	    Text lastraight = new Text("Large straight");
//	    tile.getChildren().add(lastraight);
//	    Text yaht = new Text("Yahtzee");
//	    tile.getChildren().add(yaht); 
//	    Text chance = new Text("Chance");
//	    tile.getChildren().add(chance);
//	    Text grandtotal = new Text("Grand total");
//	    tile.getChildren().add(grandtotal);
//	   
//		return tile; 
//	}
//	
//	public Pane setCategoriesScore(){
//		TilePane score = new TilePane();
//		score.setHgap(8);
//		score.setPrefColumns(1);
//		score.setPrefRows(15);
		
//	    Label labelAces = new Label();
//	    Rectangle rect = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//		score.getChildren().add(rect);
//		Label labelTwo = new Label();
//		Rectangle rect2 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelTwo, 2, 1); 
//	    grid.add(rect2, 85, 5);
//	    Label labelThree = new Label();
//	    Rectangle rect3 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelThree, 3, 1); 
//	    grid.add(rect3, 85, 6);
//	    Label labelFours = new Label();
//	    Rectangle rect4 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelFours, 4, 1);
//	    grid.add(rect4, 85, 7);
//	    Label labelFives = new Label();
//	    Rectangle rect5 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelFives, 5, 1); 
//	    grid.add(rect5, 85, 8);
//	    Label labelSixes = new Label();
//	    Rectangle rect6 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelSixes, 6, 1);
//	    grid.add(rect6, 85, 9);
//	    Label labelThreekind = new Label();
//	    Rectangle rect7 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelThreekind, 7, 1);
//	    grid.add(rect7, 85, 10);
//	    Label labelFourkind = new Label();
//	    Rectangle rect8 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelFourkind, 8, 1); 
//	    grid.add(rect8, 85, 11);
//	    Label labelHouse = new Label();
//	    Rectangle rect9 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelHouse, 9, 1); 
//	    grid.add(rect9, 85, 12);
//	    Label labelSmstraight = new Label();
//	    Rectangle rect10 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelSmstraight, 10, 1); 
//	    grid.add(rect10, 85, 13);
//	    Label labelLastraight = new Label();
//	    Rectangle rect11 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelLastraight, 11, 1); 
//	    grid.add(rect11, 85, 14);
//	    Label labelYaht = new Label();
//	    Rectangle rect12 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelYaht, 12, 1); 
//	    grid.add(rect12, 85, 15);
//	    Label labelChance = new Label();
//	    Rectangle rect13 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelChance, 13, 1);
//	    grid.add(rect13, 85, 16);
//	    Label labelGrandTotal = new Label();
//	    Rectangle rect14 = new Rectangle(80,25,Color.WHITE);
//	    rect.setStroke(Color.BLACK);
//	    grid.add(labelGrandTotal, 13, 1);
//	    grid.add(rect14, 85, 17);
//
//		return score;
//		
//		TableColumn<Map, String> firstDataColumn = new TableColumn<>("Combinatie");
//		TableColumn<Map, String> secondDataColumn = new TableColumn<>("Score");
//
//		firstDataColumn.setCellValueFactory(new MapValueFactory("key"));
//		firstDataColumn.setMinWidth(130);
//		secondDataColumn.setCellValueFactory(new MapValueFactory("value"));
//		secondDataColumn.setMinWidth(98);
//
//		TableView table_view = new TableView<>(controller.getScores());
//
//		table_view.setEditable(true);
//		table_view.getSelectionModel().setCellSelectionEnabled(true);
//		table_view.getColumns().setAll(firstDataColumn, secondDataColumn);
//		Callback<TableColumn<Map, String>, TableCell<Map, String>> cellFactoryForMap = new Callback<TableColumn<Map, String>, TableCell<Map, String>>() {
//			@Override
//			public TableCell call(TableColumn p) {
//				return new TextFieldTableCell(new StringConverter() {
//					@Override
//					public String toString(Object t) {
//						return t.toString();
//					}
//
//					@Override
//					public Object fromString(String string) {
//						return string;
//					}
//				});
//			}
//		};
//		firstDataColumn.setCellFactory(cellFactoryForMap);
//		secondDataColumn.setCellFactory(cellFactoryForMap);
//		add(table_view, 10, 1);
//		setColumnSpan(table_view, 3);
//		setRowSpan(table_view, 13);
//		
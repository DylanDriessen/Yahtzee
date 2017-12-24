package view.gameframe;


import java.util.ArrayList;

import javax.swing.JOptionPane;

import exception.DomainException;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.score.Categories;
import view.board.BoardCreator;
import view.board.ObserverInterface;
import view.buttons.Buttons;
import view.dice.DiceCreator;

public class GameFrame implements ObserverInterface, endGameObserver {
	Buttons buttons = new Buttons();
	BoardCreator board = new BoardCreator();
	Group root = board.newGroup();
	Scene scene = board.newScene(root);
	GridPane gridpane = board.maakGrid();
	DiceCreator creator = new DiceCreator();
	private int x1 = 100;
	private int y= 200;
	Pane dices = new Pane();
	ArrayList<Integer> opzijGezet;
	String category;
	HBox clickButtons = new HBox();
	int scoreX;
	int scoreY;
	VBox errorList = new VBox();
	Label scoretext = new Label(); 
	Stage primaryStage;

	public void makeFrameWithRoll(Stage primaryStage, String name, String currentName, ArrayList<Integer> result, int score, ArrayList<Categories> categories){
		clickButtons.setPadding(new Insets(5,5,5,5));
		clickButtons.setSpacing(10);
		clickButtons.setPrefWidth(420);
		clickButtons.setPrefHeight(45);
		this.primaryStage = primaryStage;

		try{
			this.setDices(result);
			ArrayList<Text> textLijst = creator.createText(result, x1, y);
			createFiveDices();
			for(Text t: textLijst){
				dices.getChildren().add(t);
			}
			Label nameLabel = buttons.setName(name);
			Label current = buttons.setCurrentName(currentName);
			this.primaryStage.setTitle("Yahtzee");
			scoretext.setStyle("-fx-text-fill: black; -fx-font-size: 15; -fx-font-weight: 600");
			scoretext.setPrefSize(400, 36);
			
			gridpane.add(scoretext, 9, 8);
			gridpane.add(dices, 5, 5);
			gridpane.add(clickButtons, 5, 15);
			gridpane.add(nameLabel, 5, 0);
			gridpane.add(current, 5, 1);
			gridpane.add(errorList, 5, 7);
			makeScoreboard(categories, 15, 0);
			root.getChildren().addAll(gridpane);	

			this.primaryStage.setScene(scene);
			this.primaryStage.show();	
		}
		catch(DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	//Create and return dices
	private void createFiveDices(){
		Rectangle dice1 = creator.dice1();
		Rectangle dice2 = creator.dice2();
		Rectangle dice3 = creator.dice3();
		Rectangle dice4 = creator.dice4();
		Rectangle dice5 = creator.dice5();
		dices.setPrefHeight(40);
		dices.setPrefWidth(200);
		dices.getChildren().addAll(dice1,dice2,dice3,dice4,dice5);
	}
	
	//Gives list of rectangles and labels
	public ObservableList<Node> getVisualDices(){
		return this.dices.getChildren();
	}
	
	//Check for type of node
	public Rectangle returnRectangle(Node node) {
		if(node instanceof Rectangle) {
			return (Rectangle)node;
		}
		return null;
	}
	
	public Text returnText(Node node) {
		if(node instanceof Text) {
			return (Text)node;
		}
		return null;
	}
	
	//Make score board
	private void makeScoreboard(ArrayList<Categories> categoryList, int colum, int row) {
		this.scoreX = colum;
		this.scoreY = row;
		Label categoryTitle = new Label();
		categoryTitle.setText("Categories");
		categoryTitle.setStyle("-fx-background-color:black;-fx-text-fill: white;");
		categoryTitle.setPrefSize(150, 36);
		categoryTitle.setPadding(new Insets(0,0,0,5));
		
		Label scoreTitle = new Label();
		scoreTitle.setText("Score");
		scoreTitle.setStyle("-fx-background-color:black;-fx-text-fill: white;");
		scoreTitle.setPrefSize(50, 36);
		scoreTitle.setPadding(new Insets(0,0,0,5));
		
		Label predictedScoreTitle = new Label();
		predictedScoreTitle.setText("Predicted Score");
		predictedScoreTitle.setStyle("-fx-background-color:black;-fx-text-fill: white;");
		predictedScoreTitle.setPrefSize(120, 36);
		predictedScoreTitle.setPadding(new Insets(0,0,0,5));
		this.gridpane.add(categoryTitle, colum, row);
		this.gridpane.add(scoreTitle, colum + 1, row);
		this.gridpane.add(predictedScoreTitle, colum + 2, row);
		
		for (int i = 0; i < categoryList.size(); i++) {
			Label text = new Label();
			text.setText(categoryList.get(i).toString() + ":  ");
			text.setStyle("-fx-background-color: #FFFF;-fx-border-color:black");
			text.setPrefSize(150, 27);
			text.setPadding(new Insets(0,0,0,5));
			gridpane.add(text, colum, row + 1 + i);
			
			Label score = new Label();
			score.setText("0");
			score.setStyle("-fx-background-color: #FFFF;-fx-border-color:black");
			score.setPrefSize(50, 27);
			score.setPadding(new Insets(0,0,0,5));
			gridpane.add(score, colum + 1, row + 1 + i);
			
			Label predictedScore = new Label();
			predictedScore.setText("0");
			predictedScore.setStyle("-fx-background-color: #FFFF;-fx-border-color:black");
			predictedScore.setPrefSize(120, 27);
			predictedScore.setPadding(new Insets(0,0,0,5));
			gridpane.add(predictedScore, colum + 2, row + 1 + i);
		}
		
		Label fullScore = new Label();
		fullScore.setStyle("-fx-background-color:black;-fx-text-fill: white;");
		fullScore.setPrefSize(50, 27);
		fullScore.setPadding(new Insets(0,0,0,5));
		fullScore.setText("0");
		gridpane.add(fullScore, colum + 1, row + categoryList.size()+1);
		
		Label fullScoreTitle = new Label();
		fullScoreTitle.setStyle("-fx-background-color:black;-fx-text-fill: white;");
		fullScoreTitle.setPrefSize(150, 27);
		fullScoreTitle.setPadding(new Insets(0,0,0,5));
		fullScoreTitle.setText("Total Score:  ");
		gridpane.add(fullScoreTitle, colum, row + categoryList.size()+1);
	}
	
	//Returns specific node in gridpane
	private Node getNodeFromGridPane(GridPane gridPane, int col, int row) {
	    for (Node node : gridPane.getChildren()) {
	        if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
	            return node;
	        }
	    }
	    return null;
	}

	//Buttons implementation
	public void addButtons(ArrayList<Categories> arrayList) {
		ComboBox<Categories> categories = buttons.categories(arrayList);
		Button turn = buttons.turn();
		Button btn = buttons.RollButton();
		Button end = buttons.endGame();
		clickButtons.getChildren().addAll(btn, categories, turn, end);
	}
	
	public ObservableList<Node> getButtons() {
		if(this.clickButtons.getChildren().isEmpty()) throw new DomainException("No buttons present");
		return this.clickButtons.getChildren();
	}
	
	public void removeButtons() {
		this.clickButtons.getChildren().clear();
	}
	
	public void addError(String string) {
		Label text = new Label();
		text.setText(string);
		text.setStyle("-fx-text-fill: red; -fx-font-size: 15; -fx-font-weight: bold;");
		errorList.getChildren().add(text);
	}
	
	public void resetErrors() {
		errorList.getChildren().clear();
	}

	//Reset numbers Dices
	private void setDices(ArrayList<Integer> result){
		if (result == null || result.isEmpty())for(int j = 0; j <= 4; j++)result.add(0);
	}
	
	//Remove all nodes from dices
	public void removeDices(){
		dices.getChildren().clear();
	}
	
	//Close gameframe
	public void closeFrame() {
		this.primaryStage.close();
	}
	
	
	//Update methods
	@Override
	public void update(ArrayList<Integer> waardes) {
		for(int i = 5; i < dices.getChildren().size(); i++) {
			((Text)dices.getChildren().get(i)).setText(Integer.toString(waardes.get(i-5)));
		}
	}
	
	@Override
	public void updateCurrentName(String currentName) {
		gridpane.getChildren().remove(getNodeFromGridPane(gridpane, 5, 1));
		Label name = new Label();
		name.setText("current player: " + currentName);
		name.setPrefSize(400, 36);
		name.setStyle("-fx-text-fill: black; -fx-font-size: 15; -fx-font-weight: 600");
		name.setPrefSize(400, 36);
		name.setPadding(new Insets(0,0,0,5));
		gridpane.add(name, 5, 1);
	}
	
	@Override
	public void updateScoreboard(int score, int place, int currentPlayerTotalScore) {
		this.gridpane.getChildren().remove(getNodeFromGridPane(gridpane, scoreX+1, scoreY+1+place));
		Label text = new Label();
		text.setText(Integer.toString(score));
		text.setStyle("-fx-background-color: #FFFF;-fx-border-color:black");
		text.setPrefSize(50, 27);
		text.setPadding(new Insets(0,0,0,5));
		this.gridpane.add(text, scoreX+1, scoreY+1+place);
		
		Label fullScoreTitle = new Label();
		fullScoreTitle.setStyle("-fx-background-color:black;-fx-text-fill: white;");
		fullScoreTitle.setPrefSize(50, 27);
		fullScoreTitle.setPadding(new Insets(0,0,0,5));
		fullScoreTitle.setText(Integer.toString(currentPlayerTotalScore));
		gridpane.add(fullScoreTitle, scoreX + 1, scoreY + 15);
	}
	
	@Override
	public void updatePredictionsScoreboard(int score, int place) {
		this.gridpane.getChildren().remove(getNodeFromGridPane(gridpane, scoreX+2, scoreY+1+place));
		Label predictedText = new Label();
		predictedText.setText(Integer.toString(score));
		predictedText.setStyle("-fx-background-color: #FFFF;-fx-border-color:black");
		predictedText.setPrefSize(120, 27);
		predictedText.setPadding(new Insets(0,0,0,5));
		this.gridpane.add(predictedText, scoreX+2, scoreY+1+place);
		
	}

	@Override
	public void updateEndGame(String naam, int score) {
		scoretext = new Label();
		scoretext.setStyle("-fx-text-fill: black; -fx-font-size: 15; -fx-font-weight: 600");
		scoretext.setPrefSize(400, 36);
		String fullScore = naam + " " + Integer.toString(score);
		scoretext.setText(fullScore);
		gridpane.add(scoretext, 9, 8);

	}


}
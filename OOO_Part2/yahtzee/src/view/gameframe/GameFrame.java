package view.gameframe;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.plaf.synth.SynthScrollBarUI;

import com.sun.prism.paint.Color;

import controller.SubjectInterface;

import exception.DomainException;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.score.Categories;
import view.board.BoardCreator;
import view.board.CategoryObserverInterface;
import view.board.ObserverInterface;
import view.buttons.Buttons;
import view.dice.DiceCreator;

import view.scoreboard.Scoreboard;

public class GameFrame implements ObserverInterface, CategoryObserverInterface {
	Buttons buttons = new Buttons();
	BoardCreator board = new BoardCreator();
	Group root = board.newGroup();
	Scene scene = board.newScene(root);
	GridPane gridpane = board.maakGrid();
	DiceCreator creator = new DiceCreator();
	private int x1 = 100;
	private int y= 200;
	StackPane dices = new StackPane();
	ArrayList<Integer> opzijGezet;
	String category;
	StackPane clickButtons = new StackPane();



			

	public void makeFrameWithRoll(Stage primaryStage, String name, String currentName, ArrayList<Integer> result){
		opzijGezet = new ArrayList<>();
			Scoreboard scoreboard = new Scoreboard();
		try{
			this.setDices(result);
			ArrayList<Text> textLijst = creator.createText(result, x1, y);
			int length = result.size() -1;
			Rectangle dice1 = creator.dice1();
			Rectangle dice2 = creator.dice2();
			Rectangle dice3 = creator.dice3();
			Rectangle dice4 = creator.dice4();
			Rectangle dice5 = creator.dice5();
			dices.getChildren().addAll(dice1,dice2,dice3,dice4,dice5);
			for(Text t: textLijst){
				dices.getChildren().add(t);
			}
			primaryStage.setTitle("Yahtzee");
			Button turn = buttons.turn();
			gridpane.add(dices, 0, 0);
			gridpane.add(clickButtons, 2,2);
			Label nameLabel = buttons.setName(currentName);
			Label current = buttons.setCurrentName(name);
			Pane scorebord = scoreboard.setCategories();
			scorebord.setTranslateX(900);
			scorebord.setTranslateY(150);
			root.getChildren().addAll(current,nameLabel,gridpane,scorebord);	

			primaryStage.setScene(scene);
			primaryStage.show();	
		}
		catch(DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	

	
	

	public void makeFrameWithoutRoll(Stage primaryStage, String naam){
		try{
			Group root = board.newGroup();
			Scene scene = board.newScene(root);
			GridPane gridpane = board.maakGrid();
			primaryStage.setTitle("Yahtzee");
			Label name = buttons.setName(naam);
			root.getChildren().addAll(name,gridpane);

			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		catch(DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	
	
	private void createFiveDices(){
		Rectangle dice1 = creator.dice1();
		Rectangle dice2 = creator.dice2();
		Rectangle dice3 = creator.dice3();
		Rectangle dice4 = creator.dice4();
		Rectangle dice5 = creator.dice5();
		dices.getChildren().addAll(dice1,dice2,dice3,dice4,dice5);
	}

	@Override
	public void update(ArrayList<Integer> waardes) {
		
		int x1 = 100;
		ArrayList<Text> textLijstUpdate = creator.createText(waardes, x1, y);
		dices.getChildren().clear();
		this.createFiveDices();
		for(Text t: textLijstUpdate){
			
			dices.getChildren().add(t);
			System.out.println(dices.getChildren());
			x1 = x1 +100;
		}
	}
	 //NextButten implementatie
	public void addButtons() {
		ComboBox<Categories> categories = buttons.categories();
		Button turn = buttons.turn();
		Button btn = buttons.RollButton();
		clickButtons.getChildren().addAll(turn, categories, btn);
	}
	
	public ObservableList<Node> getButtons() {
		if(this.clickButtons.getChildren().isEmpty()) throw new DomainException("No buttons present");
		return this.clickButtons.getChildren();
	}
	
	public void removeButtons() {
		this.clickButtons.getChildren().clear();
	}
	

	private Object getNextPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCategory() {
		// TODO Auto-generated method stub
		
	}

	private void setDices(ArrayList<Integer> result){
		
		for(int j = 0; j <= 4; j++){
			result.add(0);
		}
		
	}
	
	
	public JTable getScoreboard(){
		return null;
	}
	
	public TextField spelerField(){
		TextField field = new TextField("What's your name");
		 field.setTranslateX(55);
	     field.setTranslateY(55);
	     return field;
	  }
	
	public TableView<String> tabelSpelers(){
		TableView<String> table = new TableView<>();
		table.setTranslateX(35);
		table.setTranslateY(180);
		return table;
	}
	
	
	public Button nameButon(){
		Button btn = new Button("Enter the game");
		 btn.setTranslateX(155);
	     btn.setTranslateY(115);
	     return btn;
	}
	
	
	public Button startGame(){
		Button startBtn = new Button("Start Game");
		startBtn.setTranslateX(35);
        startBtn.setTranslateY(115);
        return startBtn;
	}
	
	public  Button rollButton(){
		Button btn = new Button("Roll Dices");
		btn.setTranslateX(300);
		btn.setTranslateY(300);
	
		return btn;
	}

}
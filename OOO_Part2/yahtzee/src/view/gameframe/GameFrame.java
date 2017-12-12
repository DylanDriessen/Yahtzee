package view.gameframe;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import controller.SubjectInterface;
import exception.DomainException;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.score.Categories;
import view.board.BoardCreator;
import view.board.ObserverInterface;
import view.buttons.Buttons;
import view.dice.DiceCreator;



import view.scoreboard.Scoreboard;

public class GameFrame implements ObserverInterface {
	Buttons buttons = new Buttons();
	SubjectInterface i;
	BoardCreator board = new BoardCreator();
	Group root = board.newGroup();
	Scene scene = board.newScene(root);
	GridPane gridpane = board.maakGrid();
	DiceCreator creator = new DiceCreator();
	private int x1 = 100;
	private int y= 200;
	StackPane dices = new StackPane();

	public void makeFrameWithRoll(Stage primaryStage, String name, Button button, ArrayList<Integer> result){
			Scoreboard scoreboard = new Scoreboard();
		try{
			ArrayList<Text> textLijst = creator.createText(result, x1, y);
			int length = result.size() -1;
			for(int i = 0; i <= 4; i++){
				Rectangle rect = creator.createBackDice(x1, y);
				
				x1 = x1+100;
				length--;
				dices.getChildren().addAll(rect);
			}
			
			for(Text t: textLijst){
				dices.getChildren().add(t);
			}
			
			
//			StackPane dices = creator.createDice(result);
			primaryStage.setTitle("Yahtzee");
			Button turn = buttons.turn();
			gridpane.add(dices, 0, 0);
			ComboBox<Categories> categories = buttons.categories();
			Label nameLabel = buttons.setName(name);
//			GridPane scorebord = scoreboard.setCategories();
//			scorebord.setTranslateX(50);
			root.getChildren().addAll(turn,categories,nameLabel,gridpane,button/*, scorebord*/);	
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		catch(DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public boolean MoveUp(){
		boolean up = true;
		y = y + 100;
		System.out.println(y);
		return  up;
	}
//	public void makeFrameWithoutRoll(Stage primaryStage, String naam, Scoreboard scoreboard){
//		try{
//			Group root = board.newGroup();
//			Scene scene = board.newScene(root);
//			GridPane gridpane = board.maakGrid();
//			content = new MakeContent(); // constructor wordt opgeroepen voor zwarte vierkanten 
////			Pane dices = content.maakContent(); // dices worden aagnemaakt
//			primaryStage.setTitle("Yahtzee");
////			gridpane.add(dices, 0, 0); // hier worden de dices toegevoegd
//			Label name = buttons.setName(naam);
//			root.getChildren().addAll(name,gridpane);
//
//			primaryStage.setScene(scene);
//			primaryStage.show();
//			
//		}
//		catch(DomainException e){
//			JOptionPane.showMessageDialog(null, e.getMessage());
//		}
//	}

	@Override
	public void update(ArrayList<Integer> waardes) {
		int x1 = 100;
		ArrayList<Text> textLijstUpdate = creator.createText(waardes, x1, y);
		dices.getChildren().clear();

		for(Text t: textLijstUpdate){
			Rectangle rect = creator.createBackDice(x1, y);
			dices.getChildren().addAll(rect,t);
			x1 = x1 +100;
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

	


	
	
	
	
	
	



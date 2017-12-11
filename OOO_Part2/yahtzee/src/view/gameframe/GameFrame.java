package view.gameframe;


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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.score.Categories;
import view.board.BoardCreator;
import view.board.MakeContent;
import view.board.ObserverInterface;
import view.buttons.Buttons;

public class GameFrame implements ObserverInterface {
	Buttons buttons = new Buttons();
	SubjectInterface i;
	BoardCreator board = new BoardCreator();
	MakeContent content = new MakeContent();
	Group root = board.newGroup();
	Scene scene = board.newScene(root);
	GridPane gridpane = board.maakGrid();
	
	private List<Label> labels;
	
	public GameFrame() {
		
	}
	
	public void makeFrameWithRoll(Stage primaryStage, String name, List<Label> labels, Button button){
	
		try{
			
			
			Pane dices = content.maakContent(labels); // dices worden aagnemaakt
			primaryStage.setTitle("Yahtzee");
			Button turn = buttons.turn();
			gridpane.add(dices, 0, 0);
			ComboBox<Categories> categories = buttons.categories();
			Label nameLabel = buttons.setName(name);
//			Button roll = this.rollButton();
//			roll.setOnMouseClicked(event -> this.tabelSpelers());// NIET JUIST
			root.getChildren().addAll(turn,categories,nameLabel,gridpane,button);
		
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
			content = new MakeContent(); // constructor wordt opgeroepen voor zwarte vierkanten 
//			Pane dices = content.maakContent(); // dices worden aagnemaakt
			primaryStage.setTitle("Yahtzee");
//			gridpane.add(dices, 0, 0); // hier worden de dices toegevoegd
			Label name = buttons.setName(naam);
			root.getChildren().addAll(name,gridpane);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		catch(DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
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
	
	public MakeContent getMakeContent(){
		return this.content;
	}

	@Override
	public void update(List<Label> labels) {
		this.labels = labels;
		Pane dices = content.maakContent(labels);
		gridpane.add(dices, 0, 0);

		
	}
	
	/*public void askPlayers( ActionEvent e){
		
		Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.BEIGE);
        stage.setScene(scene);
        
        field.setOnKeyPressed(new EventHandler<KeyEvent>() {

        	@Override
			public void handle(KeyEvent event) {
				if(event.getCode() == KeyCode.ENTER){
					getNames(field.getText());
				}
				else if(event.getCode() == KeyCode.SPACE){
					makeFrames(game.getAllNames());
				}
			}
		});
       
        Button btn = new Button("Click here to enter name");
        btn.setTranslateX(155);
        btn.setTranslateY(115);
        btn.setOnMouseClicked(event -> this.getNames(field.getText()));
        Button startBtn = new Button("Start Game");
        startBtn.setOnMouseClicked(event -> this.makeFrames(game.getAllNames()));
        startBtn.setTranslateX(35);
        startBtn.setTranslateY(115);
        Label playersEntered = new Label();
        playersEntered.setText("Players entered the game");
        playersEntered.setTranslateX(35);
        playersEntered.setTranslateY(150);
        root.getChildren().addAll(field,btn,startBtn, playersEntered, table);
        stage.show();
       }
	
	*/
	
	
	
	

}


	
	
	
	
	
	



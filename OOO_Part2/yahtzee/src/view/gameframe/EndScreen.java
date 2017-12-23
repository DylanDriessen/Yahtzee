package view.gameframe;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class EndScreen {
	ArrayList<Button> buttonList = new ArrayList<>();
	Stage stage = new Stage();
    Group root = new Group();	
    Scene scene = new Scene(root, 400, 400, Color.BEIGE);
    Button btn = exitButton();
    Button startBtn = startGame();
    GridPane gridpane = new GridPane();
    int y = 180;
    TextField text;
    HBox buttons = new HBox();
	
    public EndScreen(String winner){
    	Label gwinner = new Label("The winner is "+ winner);
    	gridpane.setPadding(new Insets(35));
    	buttons.setAlignment(Pos.CENTER);
    	buttons.getChildren().add(btn);
    	buttons.getChildren().add(startBtn);
    	buttons.getChildren().add(gwinner);
        stage.setScene(scene);
	    gridpane.setHgap(400);
	    gridpane.setVgap(10);
        gridpane.setGridLinesVisible(false);
        buttons.setSpacing(10);
        buttons.setPadding(new Insets(5,5,5,5));
        buttons.getChildren().get(2).relocate(30, 30);
        gridpane.add(buttons, 0, 2);
        root.getChildren().addAll(gridpane);
    }

	public Group getRoot() {
    	return this.root;
    }
    
    public GridPane getGridPane() {
    	return this.gridpane;
    }
    
    public Stage getStage() {
    	return this.stage;
    }
    
    public TextField getTextField() {
    	return this.text;
    }
    
    public HBox getButtons(){
    	return this.buttons;
    }
    
	
	public Button exitButton(){
		Button btn = new Button("exit");
		 btn.setPrefSize(150, 25);
	     return btn;
	}
	
	public Button startGame(){
		Button startBtn = new Button("Start new game");
		startBtn.setPrefSize(150, 25);
        return startBtn;
	}
}


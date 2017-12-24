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

public class WelcomeScreen {
	ArrayList<Button> buttonList = new ArrayList<>();
	Stage stage = new Stage();
	Group root = new Group();
	Scene scene = new Scene(root, 400, 400, Color.BEIGE);
	Button btn = nameButon();
	Button startBtn = startGame();
	GridPane gridpane = new GridPane();
	int y = 180;
	TextField text;
	HBox buttons = new HBox();

	public WelcomeScreen(ArrayList<String> playerNames) {
		buttons.setAlignment(Pos.CENTER);
		buttons.getChildren().add(btn);
		buttons.getChildren().add(startBtn);
		stage.setScene(scene);

		VBox players = new VBox();
		for (int i = 0; i < playerNames.size(); i++) {
			Label naam = new Label();
			naam.setText(playerNames.get(i));
			naam.setPadding(new Insets(5, 0, 5, 0));
			players.getChildren().add(naam);
		}

		text = spelerField();
		text.setPadding(new Insets(5, 5, 5, 5));

		gridpane.setPadding(new Insets(35));
		gridpane.setHgap(400);
		gridpane.setVgap(10);
		gridpane.setGridLinesVisible(false);
		buttons.setSpacing(10);
		buttons.setPadding(new Insets(5, 5, 5, 5));
		gridpane.add(text, 0, 1);
		gridpane.add(buttons, 0, 2);
		gridpane.add(players, 0, 4);
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

	public HBox getButtons() {
		return this.buttons;
	}

	public TextField spelerField() {
		TextField field = new TextField("What's your name");
		field.setPrefSize(300, 30);
		return field;
	}

	public Button nameButon() {
		Button btn = new Button("Enter the game");
		btn.setPrefSize(150, 25);
		return btn;
	}

	public Button startGame() {
		Button startBtn = new Button("Start Game");
		startBtn.setPrefSize(150, 25);
		return startBtn;
	}
}

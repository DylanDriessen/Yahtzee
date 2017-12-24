package view.gameframe;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EndScreen {
	ArrayList<Button> buttonList = new ArrayList<>();
	Stage stage = new Stage();
	Group root = new Group();
	Scene scene = new Scene(root, 400, 400, Color.BEIGE);
	Button btn = exitButton();
	Button startBtn = startGame();
	GridPane gridpane = new GridPane();
	HBox buttons = new HBox();

	public EndScreen(String winner, String Loser) {
		Label gwinner = new Label("The winner is " + winner);
		Label gloser = new Label("The loser is " + Loser);
		Label end = new Label("This is the end of the game");
		end.setFont(new Font(20));
		end.setTextFill(Color.BLACK);
		gridpane.setPadding(new Insets(35));
		buttons.setAlignment(Pos.CENTER);
		buttons.getChildren().add(btn);
		buttons.getChildren().add(startBtn);
		stage.setScene(scene);
		gridpane.setHgap(400);
		gridpane.setVgap(10);
		gridpane.setGridLinesVisible(false);
		buttons.setSpacing(10);
		buttons.setPadding(new Insets(5, 5, 5, 5));
		gridpane.add(end, 0, 1);
		gridpane.add(gloser, 0, 5);
		gridpane.add(gwinner, 0, 3);
		gridpane.add(buttons, 0, 7);
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

	public HBox getButtons() {
		return this.buttons;
	}

	public Button exitButton() {
		Button btn = new Button("exit");
		btn.setPrefSize(150, 25);
		return btn;
	}

	public Button startGame() {
		Button startBtn = new Button("Start new game");
		startBtn.setPrefSize(150, 25);
		return startBtn;
	}
}

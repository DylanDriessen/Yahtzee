package view.board;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class BoardCreator {

	public GridPane maakGrid() {
		GridPane gridpane = new GridPane();
		gridpane.setPadding(new Insets(5));
		gridpane.setHgap(10);
		gridpane.setVgap(10);
		return gridpane;
	}

	public Group newGroup() {
		Group group = new Group();
		return group;
	}

	public Scene newScene(Group root) {
		Scene scene = new Scene(root, 1400, 800, Color.BEIGE);
		return scene;
	}
}

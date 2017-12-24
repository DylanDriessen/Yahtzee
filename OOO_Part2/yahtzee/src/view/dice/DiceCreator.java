package view.dice;

import java.util.ArrayList;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class DiceCreator extends StackPane {

	ArrayList<Integer> result;

	public DiceCreator() {

	}

	public Rectangle dice1() {
		Rectangle rect = new Rectangle(50, 50, Color.BLACK);
		rect.setX(100);
		rect.setY(0);
		return rect;

	}

	public Rectangle dice2() {
		Rectangle rect = new Rectangle(50, 50, Color.BLACK);
		rect.setX(200);
		rect.setY(0);
		return rect;
	}

	public Rectangle dice3() {
		Rectangle rect = new Rectangle(50, 50, Color.BLACK);
		rect.setX(300);
		rect.setY(0);
		return rect;
	}

	public Rectangle dice4() {
		Rectangle rect = new Rectangle(50, 50, Color.BLACK);
		rect.setX(400);
		rect.setY(0);
		return rect;
	}

	public Rectangle dice5() {
		Rectangle rect = new Rectangle(50, 50, Color.BLACK);
		rect.setX(500);
		rect.setY(0);
		return rect;
	}

	public Rectangle createUpDice(int x1, int y2) {
		Rectangle rect = new Rectangle(50, 50, Color.BLACK);
		rect.setRotate(360);
		rect.setTranslateX(x1);
		rect.setTranslateY(y2);
		return rect;

	}

	public ArrayList<Text> createText(ArrayList<Integer> result, int x1, int y) {
		ArrayList<Text> textLijst = new ArrayList<>();
		for (int i = 0; i <= result.size() - 1; i++) {
			Text text = new Text(Integer.toString(result.get(i)));
			text.setFill(Color.WHITE);
			text.setX(x1 + 22);
			text.setY(27);
			textLijst.add(text);
			x1 = x1 + 100;
		}
		return textLijst;

	}
}

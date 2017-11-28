package model.factory;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.animation.RotateTransition;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;
import model.board.Dice;



public class DiceFactory extends StackPane{
	public final SimpleIntegerProperty property = new SimpleIntegerProperty();
	Dice dobbelsteen;
	ArrayList<String> numbers = new ArrayList<>();
	int rand = 0;
	
	
	public DiceFactory(){
		Rectangle rect = new Rectangle(50 , 50);
		
		Text text = new Text();
		text.setFill(Color.WHITE); // de cijfers in de dobbelstenen
		text.setText("Hallo");
		this.setAlignment(Pos.CENTER);
		getChildren().addAll(rect,text);
		
	}
	

	}

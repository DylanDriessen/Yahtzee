package model.board;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javafx.animation.RotateTransition;
import javafx.beans.binding.IntegerExpression;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;
import model.factory.DiceFactory;

public class 	Dice extends StackPane {
	
	public static final int MIN_VALUE = 1;
	public static final int MAX_VALUE = 6;
	private int rand = 0;
	ArrayList<String> numbers = new ArrayList<>();
	private boolean hold = false;
	
	public final SimpleIntegerProperty property = new SimpleIntegerProperty();
	
	Text text = new Text();
	
	
	public Dice() {
		Rectangle rect = new Rectangle(50 , 50);
		
		
		text.setFill(Color.WHITE); // de cijfers in de dobbelstenen
		text.setText("0");
		this.setAlignment(Pos.CENTER);
		getChildren().addAll(rect,text);
		
	}
	

	
	
	public int getRand() {
		return rand;
	}




	public void setRand(int rand) {
		this.rand = this.randomize();
	}




	public void roll(){
		RotateTransition r = new RotateTransition(Duration.seconds(1), this); // this als een node want we extenden van StackPane
		r.setFromAngle(0);
		r.setToAngle(360); // de graden dat de dobbelsteen gaat draaien
		rand = this.randomize();
		text.setText(Integer.toString(rand));
		numbers.add(Integer.toString(rand));
		System.out.println(numbers);
		
	}
	

	
	
	
	
	public void replaceDice(Dice dice, int y){
<<<<<<< HEAD
=======
		dice.setHold(true);
>>>>>>> 86e06631465c744402653ef75058513f76cc9546
		dice.setTranslateX(100 + y);
		dice.setTranslateY(100 );
		
		
	}
	
	private int randomize(){
		Random random = new Random();
		int numberShowing = random.nextInt(6)+1;
		return numberShowing;
	}
	
	
	private void setHold(boolean hold) {
		this.hold = hold;
	}
	
	public boolean getHold() {
		return this.hold;
	}
}

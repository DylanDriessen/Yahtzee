package model.board;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javafx.beans.binding.IntegerExpression;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import model.factory.DiceFactory;

public class 	Dice extends StackPane {
	
	public static final int MIN_VALUE = 1;
	public static final int MAX_VALUE = 6;
	private int rand = 0;
	ArrayList<String> numbers = new ArrayList<>();
	private boolean hold = false;
	
	public final SimpleIntegerProperty property = new SimpleIntegerProperty();
	
	
	
	
	public Dice() {
		Rectangle rect = new Rectangle(50 , 50);
		
		Text text = new Text();
		text.setFill(Color.WHITE); // de cijfers in de dobbelstenen
		text.setText("Hallo");
		this.setAlignment(Pos.CENTER);
		getChildren().addAll(rect,text);
		
	}
	

	
	
	public int roll(){
//		RotateTransition r = new RotateTransition(Duration.seconds(1), this); // this als een node want we extenden van StackPane
//		r.setFromAngle(0);
//		r.setToAngle(360); // de graden dat de dobbelsteen gaat draaien
//		r.setOnFinished(event ->   
//			 this.randomize() // hier wordt de dobbelsteen gerandomized + casten naar een integer
//			 );
//		r.play();
//		numbers.add(Integer.toString(property.getValue()));
//		System.out.println(numbers);
		rand = this.randomize();
		
		numbers.add(Integer.toString(rand));
		System.out.println(numbers);
		return rand;
	}
	

	
	
	
	
	public void replaceDice(Dice dice, int y){
		dice.setHold(true);
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

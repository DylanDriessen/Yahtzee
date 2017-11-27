package view;



import java.util.ArrayList;

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
import model.Dobbelsteen;



public class Dice extends StackPane{
	public final SimpleIntegerProperty property = new SimpleIntegerProperty();
	Dobbelsteen dobbelsteen;
	ArrayList<String> numbers = new ArrayList<>();
	
	public static final int MIN_VALUE = 1;
	public static final int MAX_VALUE = 6;
	
	public Dice(){
		Rectangle rect = new Rectangle(50 , 50);
		
		Text text = new Text();
		text.setFill(Color.WHITE); // de cijfers in de dobbelstenen
		text.textProperty().bind(property.asString());
		this.setAlignment(Pos.CENTER);
		getChildren().addAll(rect,text);
		//this.setOnMouseClicked(event -> replaceDice()); // wanneer de dobbelsteen wordt geklikt roep de methode roll op 
	}
	
	public void roll(){
		RotateTransition r = new RotateTransition(Duration.seconds(1), this); // this als een node want we extenden van StackPane
		r.setFromAngle(0);
		r.setToAngle(360); // de graden dat de dobbelsteen gaat draaien
		//r.setOnFinished(event ->   {
			 property.set((int) ((Math.random()*(MAX_VALUE - MIN_VALUE + 1 )) + MIN_VALUE) ) ;// hier wordt de dobbelsteen gerandomized + casten naar een integer.
		//});
		r.play();
		numbers.add(Integer.toString(property.getValue()));
		System.out.println(numbers);
	}
	
	public int returnNumber(){
		return property.getValue();
	}
	
	public void replaceDice(){
	
	
	}
	}

package view.board;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import model.board.Dice;
import model.board.RollAllDices;
import model.factory.DiceFactory;

public class MakeContent extends StackPane {
	
	List<Dice> dices = new ArrayList<>();
	private int x = 100;
	private int y = 200;
	

	private SimpleIntegerProperty property = new SimpleIntegerProperty();
	
	
	
	public  MakeContent(SimpleIntegerProperty property){
		Rectangle rect = new Rectangle(50 , 50);
		Text text = new Text();
		text.setFill(Color.WHITE); // de cijfers in de dobbelstenen
		text.textProperty().bind(property.asString());
		
		this.setAlignment(Pos.CENTER);
		getChildren().addAll(rect,text);
	}
	
	
	
	
	
	public Pane maakContent() {
		x = 100;
		
		
	
		Pane root2 = new Pane();
		
		for(int i = 0; i <= 4; i++){
			x =100;
			
			Dice dice = new Dice();
			dices.add(dice);
			MakeContent content = new MakeContent(property);
			
			
			
			dice.setTranslateX(x);
			dice.setTranslateY(y);
			content.setTranslateX(x);
			content.setTranslateY(y);
			x = x + 100; 
			
			
			root2.getChildren().addAll(content,dice);
		
			
		}
		
		
		Button btn = new Button("Roll Dices");
		btn.setOnMouseClicked(event -> this.AllDices());
		btn.setTranslateX(300);
		btn.setTranslateY(300);
		
		
		root2.getChildren().add(btn);
		
		return root2;
	}
	
	
	

	public void replaceDice(Dice dice, int y){
		dice.setTranslateX(100 + y);
		dice.setTranslateY(100 );
	
		
	}

	public void AllDices(){
		for(Dice d: dices){
			d.roll();
			property.set(d.getEyes());
			
			
			
			
	}
		
}

}

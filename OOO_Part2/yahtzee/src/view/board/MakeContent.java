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
	private int random = 0;
	

	private SimpleIntegerProperty property = new SimpleIntegerProperty();
	
	
	
	public  MakeContent(){
		Rectangle rect = new Rectangle(50 , 50);
		Text text = new Text();
		text.setFill(Color.WHITE); // de cijfers in de dobbelstenen
		text.textProperty().bind(property.asString());
		this.setAlignment(Pos.CENTER);
		getChildren().addAll(rect,text);
	}
	
	
	
	public Pane maakContent() {
		
		
	
		Pane root2 = new Pane();
		
		for(int i = 0; i <= 4; i++){
			
			Dice dice = new Dice();
			dices.add(dice);
			MakeContent content = new MakeContent();
			
			
			dice.setTranslateX(x);
			dice.setTranslateY(y);
			content.setTranslateX(x);
			content.setTranslateY(y);
			x = x + 100; 
			
			
			root2.getChildren().addAll(content,dice);
		
			
		}
		
		
		
		
		
		
		/*dice.setOnMouseClicked(event-> dice.replaceDice(dice,0));
		dice.setTranslateX(100);
		dice.setTranslateY(200);
		
		dice2.setOnMouseClicked(event -> dice2.replaceDice(dice2,100));
		dice2.setTranslateX(200);
		dice2.setTranslateY(200);
		
		dice3.setOnMouseClicked(event -> dice3.replaceDice(dice3,200));
		dice3.setTranslateX(300);
		dice3.setTranslateY(200);
		
		dice4.setOnMouseClicked(event -> dice4.replaceDice(dice4,300));
		dice4.setTranslateX(400);
		dice4.setTranslateY(200);
		
		dice5.setOnMouseClicked(event -> dice5.replaceDice(dice5,400));
		dice5.setTranslateX(500);
		dice5.setTranslateY(200);
		*/
		
		
		Button btn = new Button("Roll Dices");
		btn.setOnMouseClicked(event -> this.AllDices());
		
		
		
		
		
		
		//For loop in dices schrijven! 
		
		
		btn.setTranslateX(300);
		btn.setTranslateY(300);
		
		
		root2.getChildren().add(btn);
		
		return root2;
	}
	
	
	

	public void replaceDice(Dice dice, int y){
		dice.setTranslateX(100 + y);
		dice.setTranslateY(100 );
	
		
	}

	private void AllDices(){
		for(Dice d: dices){
			d.roll();
			property.set(d.getEyes());
			System.out.println(property);
			
	}
		
}

}

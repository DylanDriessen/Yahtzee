package view.dice;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

import controller.SubjectInterface;
import controller.YahtzeeController;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import model.ObserverInterfaces.DiceObserver;
import model.ObserverInterfaces.SubjectDiceInterface;
import view.board.ObserverInterface;

public class DiceCreator extends StackPane implements SubjectDiceInterface  {
	
	
	
	private int y = 200;
	private DiceObserver o; 
	List<Label> labels = new ArrayList<>();
	ArrayList<Integer> result;
	
	
	
	
	
	public DiceCreator(){
		
		}
	
	
	public Rectangle dice1(){
		int i = 0;
		Rectangle rect = new Rectangle(50,50,Color.BLACK);
		rect.setTranslateX(100);
		rect.setTranslateY(200);
		return rect;
		
	}
	
	public Rectangle dice2(){
		int i = 1;
		Rectangle rect = new Rectangle(50,50,Color.BLACK);
		rect.setTranslateX(200);
		rect.setTranslateY(200);
		return rect;
	}
	
	public Rectangle dice3(){
		Rectangle rect = new Rectangle(50,50,Color.BLACK);
		rect.setTranslateX(300);
		rect.setTranslateY(200);
		return rect;
	}
	
	public Rectangle dice4(){
		Rectangle rect = new Rectangle(50,50,Color.BLACK);
		rect.setTranslateX(400);
		rect.setTranslateY(200);
		return rect;
	}
	
	public Rectangle dice5(){
		Rectangle rect = new Rectangle(50,50,Color.BLACK);
		rect.setTranslateX(500);
		rect.setTranslateY(200);
		return rect;
	}
	
	public Rectangle createUpDice(int x1, int y2){
		Rectangle rect = new Rectangle(50,50,Color.BLACK);
		rect.setRotate(360);
		rect.setTranslateX(x1);
		rect.setTranslateY(y2);
		return rect;
		
	}
	
	public ArrayList<Text> createText(ArrayList<Integer> result, int x1, int y){
		System.out.println(result);
		ArrayList<Text> textLijst = new ArrayList<>();
		for(int i = 0; i <=result.size()-1; i++){
		Text text = new Text(Integer.toString(result.get(i)));
		text.setFill(Color.WHITE);
		text.setTranslateX(x1);
		text.setTranslateY(y);
		textLijst.add(text);
		x1 = x1+100;
		}
		return textLijst;
	
	}
	
	
//	public StackPane createDice(ArrayList<Integer> result){
//		StackPane pane = new StackPane();
//		System.out.println(result);
//		int j = 0;
//		for(int i = 0; i <=4; i++){
//			Rectangle rect = new Rectangle(50,50, Color.BLACK);
//			Text text = new Text(Integer.toString(result.get(i)));
//			text.setFill(Color.WHITE);
//			text.setTranslateX(x1);
//			text.setTranslateY(y);
//			rect.setTranslateX(x1);
//			rect.setTranslateY(y);
//			x1 = x1+100;
//			j++;
//			pane.getChildren().addAll(rect,text);
//
//		}
//		x1 =100;
//		return pane;
//	}
		
		
	

	


	


	@Override
	public void notifyDiceObserver(int i) {
			
		System.out.println("KAK IN EE NZAK");
		
		o.update(i);

	}


	

		
}


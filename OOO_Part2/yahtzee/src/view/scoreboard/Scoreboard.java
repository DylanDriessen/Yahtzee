package view.scoreboard;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Scoreboard {
	
	
	
	
	//rect kan over tekst komen te staan -> herbekijken
	
	public GridPane setCategories(){
		GridPane grid = new GridPane();
		grid.setGridLinesVisible(true);
	    grid.setHgap(10);
	    grid.setVgap(10);
	    grid.setPadding(new Insets(100, 100, 100, 800));
	    

		Text aces = new Text("Aces");
		grid.add(aces, 1, 4); 
	    Text two = new Text("Two");
	    grid.add(two, 1, 5); 
	    Text three = new Text("Threes");
	    grid.add(three,1, 6); 
	    Text fours = new Text("Fours");
	    grid.add(fours, 1, 7); 
	    Text fives = new Text("Fives");
	    grid.add(fives, 1, 8); 
	    Text sixes = new Text("Sixes");
	    grid.add(sixes, 1, 9); 
	    Text threekind = new Text("3 of a kind");
	    grid.add(threekind, 1, 10); 
	    Text fourkind = new Text("4 of a kind");
	    grid.add(fourkind, 1, 11); 
	    Text house = new Text("Full house");
	    grid.add(house, 1, 12); 
	    Text smstraight = new Text("Small straight");
	    grid.add(smstraight, 1, 13); 
	    Text lastraight = new Text("Large straight");
	    grid.add(lastraight, 1, 14); 
	    Text yaht = new Text("Yahtzee");
	    grid.add(yaht, 1, 15); 
	    Text chance = new Text("Chance");
	    grid.add(chance, 1, 16);
	    Text grandtotal = new Text("Grand total");
	    grid.add(grandtotal, 1, 17);
	    
	    Label labelAces = new Label();
	    Rectangle rect = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
		grid.add(labelAces, 85, 4); 
		grid.add(rect, 85, 4);
		Label labelTwo = new Label();
		Rectangle rect2 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelTwo, 2, 1); 
	    grid.add(rect2, 85, 5);
	    Label labelThree = new Label();
	    Rectangle rect3 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelThree, 3, 1); 
	    grid.add(rect3, 85, 6);
	    Label labelFours = new Label();
	    Rectangle rect4 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelFours, 4, 1);
	    grid.add(rect4, 85, 7);
	    Label labelFives = new Label();
	    Rectangle rect5 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelFives, 5, 1); 
	    grid.add(rect5, 85, 8);
	    Label labelSixes = new Label();
	    Rectangle rect6 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelSixes, 6, 1);
	    grid.add(rect6, 85, 9);
	    Label labelThreekind = new Label();
	    Rectangle rect7 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelThreekind, 7, 1);
	    grid.add(rect7, 85, 10);
	    Label labelFourkind = new Label();
	    Rectangle rect8 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelFourkind, 8, 1); 
	    grid.add(rect8, 85, 11);
	    Label labelHouse = new Label();
	    Rectangle rect9 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelHouse, 9, 1); 
	    grid.add(rect9, 85, 12);
	    Label labelSmstraight = new Label();
	    Rectangle rect10 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelSmstraight, 10, 1); 
	    grid.add(rect10, 85, 13);
	    Label labelLastraight = new Label();
	    Rectangle rect11 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelLastraight, 11, 1); 
	    grid.add(rect11, 85, 14);
	    Label labelYaht = new Label();
	    Rectangle rect12 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelYaht, 12, 1); 
	    grid.add(rect12, 85, 15);
	    Label labelChance = new Label();
	    Rectangle rect13 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelChance, 13, 1);
	    grid.add(rect13, 85, 16);
	    Label labelGrandTotal = new Label();
	    Rectangle rect14 = new Rectangle(80,25,Color.WHITE);
	    rect.setStroke(Color.BLACK);
	    grid.add(labelGrandTotal, 13, 1);
	    grid.add(rect14, 85, 17);
	    
	    rect.setVisible(true);
	   
		return grid; 
		
	}
}

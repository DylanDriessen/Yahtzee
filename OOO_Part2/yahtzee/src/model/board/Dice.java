package model.board;

import java.util.Random;
import javafx.scene.layout.StackPane;

public class Dice extends StackPane {
	
	private boolean rolled = false;
	private int eyes;
	
	public Dice() {
		
	}
	
	public int getEyes() {
		return eyes;
	}

	public void roll(){
		eyes = this.randomize();
		
	}
	private int randomize(){
		Random random = new Random();
		int numberShowing = random.nextInt(6)+1;
		return numberShowing;
	}
	public void setRolled(boolean roll) {
		this.rolled = roll;
	}
	
	public boolean getRolled() {
		return this.rolled;
	}
	
	public void resetEyes() {
		this.eyes = 0;
	}
}

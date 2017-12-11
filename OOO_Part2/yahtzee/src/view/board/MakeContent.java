package view.board;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import view.dice.DiceCreator;

public class MakeContent extends StackPane {
	
	

	private int x2 = 100;
	private int y = 200;
	DiceCreator creator;
	
	public MakeContent(){
	}

	public Pane maakContent(List<Label> labels) {	

		System.out.println(labels);

		Pane root2 = new Pane();
		creator = new DiceCreator(labels, root2);
		System.out.println(labels);
		root2 = creator.returnRoot();
		return root2;
	}
}

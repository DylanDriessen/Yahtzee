package view.board;

import java.util.ArrayList;
import java.util.List;

import controller.SubjectInterface;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import view.dice.DiceCreator;

public class MakeContent extends StackPane  {
	
	
	
	private int x2 = 100;
	private int y = 200;
	DiceCreator creator;
	List<Label> labels = new ArrayList<>();
	private SubjectInterface controller;
	
	public MakeContent(SubjectInterface s){
	this.controller = s;
	}

	public Pane maakContent() {	
		Pane root2 = new Pane();
		creator = new DiceCreator(root2,controller);
		System.out.println(labels);
		root2 = creator.returnRoot();
		
		return root2;
	}

	
}

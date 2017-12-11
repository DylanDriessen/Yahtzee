package view.facade;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;

import javafx.stage.Stage;
import model.facade.IModelFacade;
import view.AskPlayers;
import view.gameframe.GameFrame;

public class ViewFacade implements IViewFacade {
	

	private GameFrame view;
	
	public ViewFacade(){
		this.view = new GameFrame();
	}

	@Override
	public void makeWithRoll(Stage primaryStage, String name) {
		view.makeFrameWithRoll(primaryStage, name);
		
	}

	@Override
	public void makeWithoutRoll(Stage primaryStage, String name) {
		view.makeFrameWithoutRoll(primaryStage, name);
		
	}

	@Override
	public JTable getScoreboard() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
	
}

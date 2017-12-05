package view.facade;

import java.util.List;

import javax.swing.JTable;

import javafx.stage.Stage;
import model.facade.IModelFacade;
import view.AskPlayers;
import view.gameframe.GameFrame;

public class ViewFacade implements IViewFacade {
	
	private GameFrame view;
	
	public ViewFacade(IModelFacade model){
		this.view = new GameFrame();
	}
	
	@Override
	public void makeWithRoll(Stage primaryStage, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeWithoutRoll(Stage primaryStage, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JTable getScoreboard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String askPlayers() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

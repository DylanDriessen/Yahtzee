package view.facade;

import java.util.List;

import model.facade.IModelFacade;
import view.AskPlayers;

public class ViewFacade implements IViewFacade {
	
	private AskPlayers view;
	
	public ViewFacade(IModelFacade model){
		this.view = new AskPlayers();
	}
	
	@Override
	public String getStringInput(String message) {
		return this.view.getStringInput(message);
	}
	
}

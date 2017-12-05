

package view;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controller.YahtzeeController;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.facade.IModelFacade;
import model.facade.ModelFacade;
import model.game.PersonalGame;
import model.player.Player;
import view.AskPlayers;
import view.board.MakeContent;
import view.facade.IViewFacade;
import view.facade.ViewFacade;
import view.dice.DiceCreator;
import view.gameframe.GameFrame;


public class Speelbord extends Application {	
	
	public static void main(String[] args) {
		try {
			IModelFacade model = new ModelFacade();
			IViewFacade view = new ViewFacade(model);
			Stage primaryStage = new Stage();
			new Speelbord(model, view, primaryStage);
		} catch (Exception e) {
		}
	}

	private final IViewFacade view;
	private final IModelFacade model;
	private String message;
	private Stage primaryStage;
	
	public Speelbord(IModelFacade model, IViewFacade view, Stage primaryStage) throws Exception {
		this.model = model;
		this.view = view;
		this.primaryStage = primaryStage;
		System.out.println("fd");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("START");
		YahtzeeController persons = new YahtzeeController();
		AskPlayers player = new AskPlayers();
		List<String> result = player.askJavaFxPlayer(primaryStage);
		List<PersonalGame> players = persons.getAll();
		for (int i = players.size()-1; i >= 0;i--){	
			PersonalGame s = players.get(i);
			Stage stage = new Stage();
			GameFrame frame = new GameFrame();
			MakeContent content = new MakeContent();
			frame.makeFrameWithRoll(primaryStage, s.getPlayer().getNaam());
			}
		}
	
	public void askPlayersName(String message){
		List<String> result = new ArrayList<>();
		String playerName;
		playerName = this.view.getStringInput(message);
		result.add(playerName);
		System.out.println("test");
	}
	
}

	


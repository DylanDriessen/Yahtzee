package view;

import javax.swing.JOptionPane;


public class AskPlayers {

	
	
	
	public String askNewPlayer(){
		String naam = JOptionPane.showInputDialog("geef nieuwe speler");
		return naam;
	}
	
}

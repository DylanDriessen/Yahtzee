package model.game;

import model.player.Player;
import model.score.Score;

public class PersonalGame {
	private Player player;
	private Score score;
	public PersonalGame(Player player, Score score) {
		super();
		this.player = player;
		this.score = score;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	

}

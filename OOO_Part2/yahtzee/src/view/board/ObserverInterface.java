package view.board;

import java.util.ArrayList;

public interface ObserverInterface {

	void updatePredictionsScoreboard(int score, int place, int currentPlayerTotalScore);
	void updateScoreboard(int score, int place, int currentPlayerTotalScore);
	void update(ArrayList<Integer> result);
	void updateCurrentName(String currentName);
}

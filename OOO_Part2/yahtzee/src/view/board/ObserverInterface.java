package view.board;

import java.util.ArrayList;

public interface ObserverInterface {

	void update(ArrayList<Integer> result);
	void updateCurrentName(String currentName);
	void updatePredictionsScoreboard(int score, int place);
	void updateScoreboard(int score, int place, int currentPlayerTotalScore);
}

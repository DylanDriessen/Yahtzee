package view.board;

import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public interface ObserverInterface {


	public void update( List<Label> labels);
}

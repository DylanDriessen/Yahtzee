package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.facade.IModelFacade;
import model.facade.ModelFacade;
import view.Speelbord;
import view.facade.IViewFacade;
import view.facade.ViewFacade;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			IModelFacade model = new ModelFacade();
			IViewFacade view = new ViewFacade(model);
			new YathzeeController(view, model);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
public class Main  {
	
	
		public static void main(String[] args) {

	
	}

	
}

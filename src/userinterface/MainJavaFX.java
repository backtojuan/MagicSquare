package userInterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import model.MagicSquare;
import userInterface.MagicSquareController;

public class MainJavaFX extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("MagicSquare.fxml"));
		
		Scene scene = new Scene(root);
		stage.setTitle("MagicSquare");
		stage.setScene(scene);;
		stage.show();
	}
	
	public static void main (String[] args) {
		
		launch(args);
	}	
}
	

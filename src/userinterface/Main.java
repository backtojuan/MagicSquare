//___________________________________________________package of the class___________________________________________________________

	package userinterface;

//__________________________________________________________________________________________________________________________________
	
	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.stage.Stage;
	import javafx.scene.image.Image;
//__________________________________________________________________________________________________________________________________
	/**
	 * This class manage the necessary attributes and methods to manage and launch the User Interface.
	 * 
	 * @author Juan José Valencia Jaramillo
	 * @version V_01_February-2019
	 */
	public class Main extends Application{
		@Override
		public void start(Stage stage) throws Exception{
			Parent root =
					FXMLLoader.load(getClass().getResource("MagicSquare.fxml"));
	
			Scene scene = new Scene(root);
			stage.setTitle("Magic Square Generator");
			stage.setFullScreen(true);
			stage.setScene(scene);
			
			
			Image icon = new Image("userinterface/imgs/icon.png");
			stage.getIcons().add(icon);
			stage.show();
		}
//___________________________________________________________________________________________________________________________________
	
	public static void main(String[]args){
		launch(args);
	}
	
//___________________________________________________________________________________________________________________________________
}

//___________________________________________________package of the class___________________________________________________________

	package userinterface;

//________________________________________________used packages for this class______________________________________________________

	import javafx.fxml.FXML;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.event.ActionEvent;
	import javafx.scene.layout.GridPane;
	import model.MagicSquare;
	import javafx.scene.control.Button;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.control.ScrollPane;

//_________________________________________________________attributes_______________________________________________________________

	/**
	 * This class manage the necessary attributes and methods to create and manage the User Interface.
	 * 
	 * @author Juan José Valencia Jaramillo
	 * @version V_01_February-2019
	 */
	public class MagicSquareController {
	
		@FXML
		private BorderPane borderpane;
	
		@FXML
		private ScrollPane scrollpane;
	
		@FXML
		private TextField orderTextField;
	
		@FXML
		private ComboBox<?> centralboxComboBox;
	
		@FXML
		private ComboBox<?> directionComboBox;
	
		@FXML
		private Label lbOrder;
	
		@FXML
		private Label lbCentralBox;
	
		@FXML
		private Label lbDirection;
	
		@FXML
		private Label lbMagicConstant;
	
		@FXML
		private Label lbMessage;
	
		private MagicSquare magicsquare;

//____________________________________________methods for this class_____________________________________________________________
	@FXML
	/** this method allows to generate the magic square with the desired order given by the user. <br>
	 * @param event the event that is caused by the user to trigger the method.
	 * @see userinterface.MagicSquare#fillMatrix
	 */
	void createMagicSquare(ActionEvent event) {

		//manages the data choosen by the user so it can be shown at the right side of the GUI
		//_____________________________________________________________________________________

			//order given by the user
			int order = Integer.parseInt(orderTextField.getText());
	
			//data choosen by the user
			String centralbox = (String) centralboxComboBox.getValue();
			String direction = (String) directionComboBox.getValue();
			int magicalconstant = (order*((order*order)+1))/2;
	
			//value of the centralbox to create the MagicSquare
			char cb = centralbox.charAt(0);
	
			//value of the direction to fill in the MagicSquare
			int d = Integer.parseInt(direction.substring(0,1));
			
		//_____________________________________________________________________________________

			//condition to only creates odd MagicSquares 
			if(order % 2 == 0) {
				lbMessage.setText("THE ORDER NUMBER MUST BE ODD");
			}
			else if(cb=='U'&& (d == 3 || d ==4)) {
				lbMessage.setText("YOU CAN ONLY GO THROUGHT NORTH WEST AND NORTH EAST DIRECTIONS");
			}
			else if(cb=='D' && (d == 1 || d ==2)) {
				lbMessage.setText("YOU CAN ONLY GO THROUGH SOUTH WEST AND SOUTH EAST DIRECTIONS");
			}
			else if(cb=='L' && (d == 2 || d == 4)) {
				lbMessage.setText("YOU CAN ONLY GO THROUGHT NORTHWEST AND SOUTH WEST DIRECTIONS");
			}
			else if(cb=='R' && (d == 1 || d == 3)) {
				lbMessage.setText("YOU CAN ONLY GO THROUGHT NORTHEAST AND SOUTH EAST DIRECTIONS");
			}
			else {

		//______________________________________________________________________________________

			//creates and sets the right controls to show the MagicSquare generated on the GUI
			GridPane gridpane = new GridPane();
			borderpane.setCenter(scrollpane);
			scrollpane.setContent(gridpane);

			//creates the MagicSquare

			MagicSquare magicsquare = new MagicSquare(order);

		//______________________________________________________________________________________

			//Creates the MagicSquare
			int[][] ms = magicsquare.determinateFillInOfMagicSquare(order, cb, d);

			//sets the labels to be read with the right messages on the GUI

			lbMessage.setText("¡Presence the magic of the algorithms!");
			lbOrder.setText("" + order);;
			lbCentralBox.setText(centralbox);
			lbDirection.setText(direction);
			lbMagicConstant.setText(" " + magicalconstant);

			//Generates a MagicSquare of buttons to be displayed on the GUI
			for(int i=0;i<order;i++) {
				for(int j=0;j<order;j++) {
					gridpane.add(new Button(" "+ms[i][j] +" "),j,i);
				}
			}
			
		//_______________________________________________________________________________________
			
		}
	}
//_______________________________________________________________________________________________________________________________________
}

//___________________________________________________package of the class_____________________________________________________________

	package model;

//________________________________________________________attributes__________________________________________________________________
	
	/**
	 * This class manages the necessary attributes and methods to creates exception objects of type InvalidInformationException
	 *@author Juan José Valencia Jaramillo
	 *@version V_01_February_2019
	 */
	public class InvalidInformationException extends Exception{
	
	private int invalidorder;
	private char invalidcentralbox;
	private int invaliddirection;
	
//___________________________________________________Constructor method_______________________________________________________________
		
		/**
		 * <b>InvalidInformationException constructor</b><br>
		 * @param invalidorder the order that the user enter wrong asked information
		 * @param invalidcentralbox the centralbox that the user choosed wrong asked information
		 * @param invaliddirection the direction that the user choosed wrong asked information
		 */
		public InvalidInformationException(int invalidorder, char invalidcentralbox, int invaliddirection) {
			
			super();
			this.invalidorder = invalidorder;
			this.invalidcentralbox = invalidcentralbox;
			this.invaliddirection = invaliddirection;
			
		}
//__________________________________________________Methods for this class____________________________________________________________
		
		/**
		 * This method allow the exception to generates an special message for every case where the user enter or choosed wrong values
		 * @return A string report with the reason that lead the program to caused an exception
		 */
		@Override
		public String getMessage() {
			
			//report that is going to be return
			String report = "";
			
			//Order must be an odd
			if(this.invalidorder%2 == 0)
			{
				report += "THE ORDER MUST BE AN ODD";
			}
			
			//Order must be positive
			if(this.invalidorder < 0)
			{
				report += "You cannot create a Magic Square with a negative order";
			}
			
			//Direction cannot contain south in upper central box
			else if(this.invalidcentralbox=='U'&& (this.invaliddirection == 3 || this.invaliddirection ==4))
			{
				report += "YOU CAN ONLY GO THROUGHT NORTH WEST AND NORTH EAST DIRECTIONS";
			}
			
			//Direction cannot contain north in lower central box
			else if(this.invalidcentralbox=='D' && (this.invaliddirection == 1 || this.invaliddirection ==2)) 
			{
				report += "YOU CAN ONLY GO THROUGH SOUTH WEST AND SOUTH EAST DIRECTIONS";
			}
			
			//Direction cannot contain east in left central box
			else if(this.invalidcentralbox=='L' && (this.invaliddirection == 2 || this.invaliddirection == 4))
			{
				report += "YOU CAN ONLY GO THROUGHT NORTHWEST AND SOUTH WEST DIRECTIONS";
			}
			
			//Direction cannot contain west in right central box
			else if(this.invalidcentralbox=='R' && (this.invaliddirection == 1 || this.invaliddirection == 3)) 
			{
				report += "YOU CAN ONLY GO THROUGHT NORTHEAST AND SOUTH EAST DIRECTIONS";
			}
			
			return report;
		}
//____________________________________________________________________________________________________________________________________
	
}

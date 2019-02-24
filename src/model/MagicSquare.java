//___________________________________________________package of the class___________________________________________________________

	package model;

//__________________________________________________attributes & constants__________________________________________________________

	/**
	 * This class manage the necessary attributes and methods to create and manage objects of type MagicSquare.
	 * 
	 * @author Juan José Valencia Jaramillo
	 * @version V_01_February-2019
	 */
	public class MagicSquare {
		
	
		public int[][] magicsquare;
		
		public final static char UPPERCENTRALBOX = 'U';
		public final static char LOWERCENTRALBOX = 'D';
		public final static char LEFTCENTRALBOX = 'L';
		public final static char RIGHTCENTRALBOX = 'R';
	
		public final static int NORTHWEST = 1;
		public final static int NORTHEAST = 2;
		public final static int SOUTHWEST = 3;
		public final static int SOUTHEAST = 4;

//__________________________________________________methods for this class__________________________________________________________
	
	/**
	 * <b>MagicSquare Constructor</b><br>
	 * @param order the size that is going to have the MagicSquare
	 */
	public MagicSquare(int order) {
		this.magicsquare = new int[order][order];
	}

//__________________________________________________methods for this class__________________________________________________________

	/** 
	 * 
	* this method determinate the way to fill the MagicSquare based on the direction and the CentralBox given by the user <br><br>
	 * <b>Pre:</b> the MagicSquare has been previously initiliazed. <br><br>
	 * <b>Post:</b> the MagicSquare is right filled depending of the case given. <br><br>
	 * @param: order the size of the MagicSquare 
	 * @param: direction the direction that is going to have the process of filling the Magic Square.
	 * @param: centralbox the CentralBox where is going to be put the number one, so the Magic Square can start to be filled.
	 * @see: userinterface.MagicSquareController#createMagicSquare
	 * 
	 */
	public int[][] determinateFillInOfMagicSquare(int order, char centralbox, int direction) {
		
		// it triggers the right methods depending on the case.
		//_________________________________________________________
		
			if(centralbox == UPPERCENTRALBOX){
	
				if(direction == NORTHWEST) {
					fillUpperNorthWestMS(order);
				}
				else if(direction == NORTHEAST) {
					fillUpperNorthEastMS(order);
				}
			}
		
		//_________________________________________________________
		
			else if(centralbox == LOWERCENTRALBOX) {
	
				if(direction == SOUTHWEST) {
					fillLowerSouthWestMS(order);
				}
				else if(direction == SOUTHEAST) {
					fillLowerSouthEastMS(order);
				}
			}
		
		//__________________________________________________________
		
			else if(centralbox == LEFTCENTRALBOX) {
	
				if(direction == NORTHWEST) {
					fillLeftNorthWestMS(order);
				}
				else if(direction == SOUTHWEST) {
					fillLeftSouthWestMS(order);
				}
			}
		
		//___________________________________________________________
		
			else if(centralbox == RIGHTCENTRALBOX) {
	
				if(direction == NORTHEAST) {
					fillRightNorthEastMS(order);
				}
				else if(direction == SOUTHEAST) {
					fillRightSouthEastMS(order);
				}
			}
		//___________________________________________________________
		
		return this.magicsquare;
	}
	
//_________________________________________________________________________________________________________________________________
	
	/**
	 * this method fill the MagicSquare starting in the upper central box towards "North-West" Direction.<br><br>
	 * @param  order the size of the Magic Square
	 * @return the MagicSquare filled properly based on this specific case.
	 * @throws NullPointerException in the case of the MagicSquare equals to null.
	 */
	public int[][] fillUpperNorthWestMS(int order){

		int size = order;
		int row = 0;
		int column = (size-1)/2; 
		int current_row;
		int current_column;

		magicsquare[row][column] = 1;

		for (int i = 2; i <= size*size; i++) {

			current_row = row;
			current_column = column;
			row -= 1;
			column -=1;
			
			//condition when the last number positioned is in the first column (0)
			if(column == -1) {
				column = size-1;
			}
			//condition when the last number positioned is in the first row (0)
			if(row == -1){
				row = size-1;
			}
			//condition when the position is already filled with another number
			if(this.magicsquare[row][column] != 0) {
				row= current_row +1;
				column = current_column;
				
				if(row == -1) {
					row = size-1;
				}
			}

			magicsquare[row][column] = i;
		}

		return magicsquare;
	}

//_________________________________________________________________________________________________________________________________
	
	/**
	 * this method fill the MagicSquare starting in the upper central box towards "North-East" Direction.<br><br>
	 * @param order the size of the MagicSquare
	 * @return the MagicSquare filled properly based on this specific case.
	 * @throws NullPointerException in the case of the MagicSquare equals to null.
	 */	
	public int[][] fillUpperNorthEastMS(int order){

		int size = order;
		int row = 0;
		int column = (size-1)/2;
		int current_row;
		int current_column;

		magicsquare[row][column] = 1;

		for (int i = 2; i <= size*size; i++) {

			current_row = row;
			current_column = column;
			row -= 1;
			column +=1;
			
			//condition when the last number positioned is in the last column (size-1)
			if(column == size) {
				column = 0;
			}
			//condition when the last number positioned is in the first row (0)
			if(row == -1){
				row = size-1;
			}
			//condition when the position is already filled with another number
			if(magicsquare[row][column] != 0) {
				row= current_row +1;
				column = current_column;
				
				if(row == -1) {
					row = size-1;
				}
			}

			magicsquare[row][column] = i;
		}

		return magicsquare;

	}
	
//_________________________________________________________________________________________________________________________________
	
	/**
	 * this method fill the MagicSquare starting in the lower central box towards "South-West" Direction.<br><br>
	 * @param order the size of the MagicSquare
	 * @return the MagicSquare filled properly based on this specific case.
	 * @throws NullPointerException in the case of the MagicSquare equals to null.
	 */
	public int[][] fillLowerSouthWestMS(int order){

		int size = order;
		int row = size-1;
		int column = (size-1)/2;
		int current_row;
		int current_column;

		magicsquare[row][column] = 1;

		for (int i = 2; i <= size*size; i++) {

			current_row = row;
			current_column = column;
			row += 1;
			column -=1;
			
			//condition when the last number positioned is in the first column (0)
			if(column == -1) {
				column = size-1;
			}
			//condition when the last number positioned is in the last row (size-1)
			if(row == size){
				row = 0;
			}
			//condition when the position is already filled with another number
			if(magicsquare[row][column] != 0) {
				row= current_row -1;
				column = current_column;
				
				if(row == size) {
					row = 0;
				}
			}

			magicsquare[row][column] = i;
		}

		return magicsquare;
	}
	
//_________________________________________________________________________________________________________________________________

	/**
	 * this method fill the MagicSquare starting in the lower central box towards "South-East" Direction.<br><br>
	 * @param order the size of the MagicSquare
	 * @return the MagicSquare filled properly based on this specific case.
	 * @throws NullPointerException in the case of the MagicSquare equals to null.
	 */
	public int[][] fillLowerSouthEastMS(int order){
		
		int size = magicsquare[0].length;
		int row = size-1;
		int column = (size-1)/2;
		int current_row;
		int current_column;

		magicsquare[row][column] = 1;

		for (int i = 2; i <= size*size; i++) {

			current_row = row;
			current_column = column;
			row += 1;
			column +=1;
			
			//condition when the last number positioned is in the last column (size-1)
			if(column == size) {
				column = 0;
			}
			//condition when the last number positioned is in the last row (size-1)
			if(row == size){
				row = 0;
			}
			//condition when the position is already filled with another number
			if(magicsquare[row][column] != 0) {
				row= current_row -1;
				column = current_column;
				
				if(row == size) {
					row = 0;
				}
			}

			magicsquare[row][column] = i;
		}	
		
		return magicsquare;
	}

//_________________________________________________________________________________________________________________________________
	
	/**
	 * this method fill the MagicSquare starting in the left sided central box towards "North-West" Direction.<br><br>
	 * @param order the size of the MagicSquare
	 * @return the MagicSquare filled properly based on this specific case.
	 * @throws NullPointerException in the case of the MagicSquare equals to null.
	 */	
	public int[][] fillLeftNorthWestMS(int order){
		
		int size = order;
		int row = (size-1)/2;
		int column = 0;
		int current_row;
		int current_column;

		magicsquare[row][column] = 1;

		for (int i = 2; i <= size*size; i++) {

			current_row = row;
			current_column = column;
			row -= 1;
			column -=1;
			
			//condition when the last number positioned is in the first column (0)
			if(column == -1) {
				column = size-1;
			}
			//condition when the last number positioned is in the first row (0)
			if(row == -1){
				row = size-1;
			}
			//condition when the position is already filled with another number
			if(magicsquare[row][column] != 0) {
				row= current_row;
				column = current_column + 1;
				if(row == size) {
					row = 0;
				}
			}

			magicsquare[row][column] = i;
		}

		return magicsquare;

	}
	
//_________________________________________________________________________________________________________________________________
	
	/**
	 * this method fill the MagicSquare starting in the left sided central box towards "South-West" Direction.<br><br>
	 * @param order the size of the MagicSquare
	 * @return the MagicSquare filled properly based on this specific case.
	 * @throws NullPointerException in the case of the MagicSquare equals to null.
	 */	
	public int[][] fillLeftSouthWestMS(int order){
		
		int size = order;
		int row = (size-1)/2;
		int column = 0;
		int current_row;
		int current_column;

		magicsquare[row][column] = 1;

		for (int i = 2; i <= size*size; i++) {

			current_row = row;
			current_column = column;
			row += 1;
			column -=1;
			
			//condition when the last number positioned is in the first column (0)
			if(column == -1) {
				column = size-1;
			}
			//condition when the last number positioned is in the last row (size-1)
			if(row == size){
				row = 0;
			}
			//condition when the position is already filled with another number
			if(magicsquare[row][column] != 0) {
				row= current_row;
				column = current_column + 1;
				
				if(row == size) {
					row = 0;
				}
			}

			magicsquare[row][column] = i;
		}

		return magicsquare;

	}
	
//_________________________________________________________________________________________________________________________________
	
	/**
	 * this method fill the MagicSquare starting in the right sided central box towards "North-East" Direction.<br><br>
	 * @param order the size of the MagicSquare
	 * @return the MagicSquare filled properly based on this specific case.
	 * @throws NullPointerException in the case of the MagicSquare equals to null.
	 */
	public int[][] fillRightNorthEastMS(int order){
		
		int size = order;
		int row = (size-1)/2;
		int column = size-1;
		int current_row;
		int current_column;

		magicsquare[row][column] = 1;

		for (int i = 2; i <= size*size; i++) {

			current_row = row;
			current_column = column;
			row -= 1;
			column +=1;
			
			//condition when the last number positioned is in the last column (size-1)
			if(column == size) {
				column = 0;
			}
			//condition when the last number positioned is in the first row (0)
			if(row == -1){
				row = size-1;
			}
			//condition when the position is already filled with another number
			if(magicsquare[row][column] != 0) {
				row= current_row;
				column = current_column - 1;
				
				if(row == size) {
					row = 0;
				}
			}

			magicsquare[row][column] = i;
		}
		
		return magicsquare;
	}
	
//_________________________________________________________________________________________________________________________________
	
	/**
	 * this method fill the MagicSquare starting in the right sided central box towards "South-East" Direction.<br><br>
	 * @param order the size of the MagicSquare
	 * @return the MagicSquare filled properly based on this specific case.
	 * @throws NullPointerException in the case of the MagicSquare equals to null.
	 */	
	public int[][] fillRightSouthEastMS(int order){
		
		int size = order;
		int row = (size-1)/2;
		int column = size-1;
		int current_row;
		int current_column;

		magicsquare[row][column] = 1;

		for (int i = 2; i <= size*size; i++) {

			current_row = row;
			current_column = column;
			row += 1;
			column +=1;
			
			//condition when the last number positioned is in the last column (size-1)
			if(column == size) {
				column = 0;
			}
			//condition when the last number positioned is in the last row (size-1)
			if(row == size){
				row = 0;
			}
			//condition when the position is already filled with another number
			if(magicsquare[row][column] != 0) {
				row= current_row;
				column = current_column-1;
				if(row == size) {
					row = 0;
				}
			}

			magicsquare[row][column] = i;
		}
		
		return magicsquare;
	}
	
	//_____________________________________________________________________________________________________________________________
	/**
	 * This method returns the matrix that is generated by creating an object of type MagicSquare <br>
	 * @return the matrix that represents the magicsquare with the correct order (dimension)
	 */
	public int[][] getMatrix(){
		return magicsquare;
	}
//_________________________________________________________________________________________________________________________________
	
}



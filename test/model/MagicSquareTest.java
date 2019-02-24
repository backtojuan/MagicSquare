//________________________________________________package of the class________________________________________________________________
	
	package model;

	import static org.junit.Assert.assertEquals;

//_____________________________________________used packages for this class___________________________________________________________
	
	import static org.junit.Assert.assertNotNull;
	import static org.junit.Assert.assertTrue;
	import static org.junit.jupiter.api.Assertions.*;
	
	import org.junit.jupiter.api.Test;

//_____________________________________________________Scenaries______________________________________________________________________

	class MagicSquareTest {
		
		private MagicSquare magicsquare;
		
		private void setUpScenary1() {
			
		}
		private void setUpScenary2() {
			int order = 7;
			magicsquare = new MagicSquare(order);
		}

//____________________________________________________Test Methods____________________________________________________________________

		@Test
		void testMagicSquare() {
			
			setUpScenary1();
			
			int order = 5;
			magicsquare = new MagicSquare(order);
			
			assertNotNull("The magicsquare was not succesfully created",magicsquare.equals(null));
			
			assertTrue("The magicsquare does not have 5 rows", magicsquare.getMatrix().length == 5);
			assertTrue("The magicsquare does not have 5 columns", magicsquare.getMatrix()[0].length == 5);
		}
		
		//_____________________________________________________________________________________________________________
		
		@Test
		void testDeterminateFillInOfMagicSquare() {
			
			setUpScenary2();
			
			//magicsquare with order 7, upper central box and north west direction
			char cb = 'U';
			int d = 1;
			magicsquare.determinateFillInOfMagicSquare(magicsquare.getMatrix().length, cb, d);
			
			//evaluates the number 1 was set in the correct initial box
			assertEquals("The upper central box does not have the number one",1,magicsquare.getMatrix()[0][3]);
			
			//evaluates 3 times the process of fill in revising that nothing gone wrong (if fail all of them something's wrong)
			assertEquals("The fill in direction has not gone right, (reported once)",2,magicsquare.getMatrix()[6][2]);
			assertEquals("The fill in direction has not gone right, (reported twice)",3,magicsquare.getMatrix()[5][1]);
			assertEquals("The fill in direction has not gone right, (reported three times)",4,magicsquare.getMatrix()[4][0]);
		
		//________________________________________________________________________________________________________________________
	
			setUpScenary2();
		
			//magicsquare with order 7, upper central box and north east direction
			int d2 = 2;
			magicsquare.determinateFillInOfMagicSquare(magicsquare.getMatrix().length, cb, d2);
			
			//evaluates the number 1 was set in the correct initial box
			assertEquals("The upper central box does not have the number one",1,magicsquare.getMatrix()[0][3]);
			
			//evaluates 3 times the process of fill in revising that nothing gone wrong (if fail all of them something's wrong)
			assertEquals("The fill in direction has not gone right, (reported once)",2, magicsquare.getMatrix()[6][4]);
			assertEquals("The fill in direction has not gone right, (reported twice)",3, magicsquare.getMatrix()[5][5]);
			assertEquals("The fill in direction has not gone right, (reported three times)",4,magicsquare.getMatrix()[4][6]);
		
		//_______________________________________________________________________________________________________________________
			
			setUpScenary2();
			
			//magicsquare with order 7, lower central box and south west direction
			char cb2 = 'D';
			int d3 = 3;
			magicsquare.determinateFillInOfMagicSquare(magicsquare.getMatrix().length, cb2, d3);
			
			//evaluates the number 1 was set in the correct initial box
			assertEquals("The upper central box does not have the number one",1,magicsquare.getMatrix()[6][3]);
			
			//evaluates 3 times the process of fill in revising that nothing gone wrong (if fail all of them something's wrong)
			assertEquals("The fill in direction has not gone right, (reported once)",2, magicsquare.getMatrix()[0][2]);
			assertEquals("The fill in direction has not gone right, (reported twice)",3, magicsquare.getMatrix()[1][1]);
			assertEquals("The fill in direction has not gone right, (reported three times)",4,magicsquare.getMatrix()[2][0]);
			
		//_______________________________________________________________________________________________________________________
			
			setUpScenary2();
			
			//magicsquare with order 7, lower central box and south west direction
			int d4 = 4;
			magicsquare.determinateFillInOfMagicSquare(magicsquare.getMatrix().length, cb2, d4);
			
			//evaluates the number 1 was set in the correct initial box
			assertEquals("The upper central box does not have the number one",1,magicsquare.getMatrix()[6][3]);
			
			//evaluates 3 times the process of fill in revising that nothing gone wrong (if fail all of them something's wrong)
			assertEquals("The fill in direction has not gone right, (reported once)",2, magicsquare.getMatrix()[0][4]);
			assertEquals("The fill in direction has not gone right, (reported twice)",3, magicsquare.getMatrix()[1][5]);
			assertEquals("The fill in direction has not gone right, (reported three times)",4,magicsquare.getMatrix()[2][6]);
			
		//_______________________________________________________________________________________________________________________
			
			setUpScenary2();
			
			//magicsquare with order 7, lower central box and south west direction
			char cb3 = 'L';
			magicsquare.determinateFillInOfMagicSquare(magicsquare.getMatrix().length, cb3, d);
			
			//evaluates the number 1 was set in the correct initial box
			assertEquals("The upper central box does not have the number one",1,magicsquare.getMatrix()[3][0]);
			
			//evaluates 3 times the process of fill in revising that nothing gone wrong (if fail all of them something's wrong)
			assertEquals("The fill in direction has not gone right, (reported once)",2, magicsquare.getMatrix()[2][6]);
			assertEquals("The fill in direction has not gone right, (reported twice)",3, magicsquare.getMatrix()[1][5]);
			assertEquals("The fill in direction has not gone right, (reported three times)",4,magicsquare.getMatrix()[0][4]);
			
		//_______________________________________________________________________________________________________________________
			
			setUpScenary2();
			
			//magicsquare with order 7, lower central box and south west direction
			magicsquare.determinateFillInOfMagicSquare(magicsquare.getMatrix().length, cb3, d3);
			
			//evaluates the number 1 was set in the correct initial box
			assertEquals("The upper central box does not have the number one",1,magicsquare.getMatrix()[3][0]);
			
			//evaluates 3 times the process of fill in revising that nothing gone wrong (if fail all of them something's wrong)
			assertEquals("The fill in direction has not gone right, (reported once)",2, magicsquare.getMatrix()[4][6]);
			assertEquals("The fill in direction has not gone right, (reported twice)",3, magicsquare.getMatrix()[5][5]);
			assertEquals("The fill in direction has not gone right, (reported three times)",4,magicsquare.getMatrix()[6][4]);
			
		//_______________________________________________________________________________________________________________________
			
			setUpScenary2();
			
			//magicsquare with order 7, lower central box and south west direction
			char cb4 = 'R';
			magicsquare.determinateFillInOfMagicSquare(magicsquare.getMatrix().length, cb4, d2);
			
			//evaluates the number 1 was set in the correct initial box
			assertEquals("The upper central box does not have the number one",1,magicsquare.getMatrix()[3][6]);
			
			//evaluates 3 times the process of fill in revising that nothing gone wrong (if fail all of them something's wrong)
			assertEquals("The fill in direction has not gone right, (reported once)",2, magicsquare.getMatrix()[2][0]);
			assertEquals("The fill in direction has not gone right, (reported twice)",3, magicsquare.getMatrix()[1][1]);
			assertEquals("The fill in direction has not gone right, (reported three times)",4,magicsquare.getMatrix()[0][2]);
			
		//_______________________________________________________________________________________________________________________
			
			setUpScenary2();
			
			//magicsquare with order 7, lower central box and south west direction
			magicsquare.determinateFillInOfMagicSquare(magicsquare.getMatrix().length, cb4, d4);
			
			//evaluates the number 1 was set in the correct initial box
			assertEquals("The upper central box does not have the number one",1,magicsquare.getMatrix()[3][6]);
			
			//evaluates 3 times the process of fill in revising that nothing gone wrong (if fail all of them something's wrong)
			assertEquals("The fill in direction has not gone right, (reported once)",2, magicsquare.getMatrix()[4][0]);
			assertEquals("The fill in direction has not gone right, (reported twice)",3, magicsquare.getMatrix()[5][1]);
			assertEquals("The fill in direction has not gone right, (reported three times)",4,magicsquare.getMatrix()[6][2]);
			
		//_______________________________________________________________________________________________________________________
			
		}
		//____________________________________________________________________________________________________________________________
		@Test
		void getMatrixTest() {
			setUpScenary2();
			
			assertNotNull("The matrix has not been initialized", magicsquare.getMatrix());
			
			assertEquals("The matrix does not have 7 rows",7, magicsquare.getMatrix().length);
			assertEquals("The matrix does not have 7 columns",7, magicsquare.getMatrix().length);
		}
//____________________________________________________________________________________________________________________________________
	
}

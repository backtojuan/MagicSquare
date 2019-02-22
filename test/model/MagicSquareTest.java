package model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagicSquareTest {
	
	private void setUpScenary1() {
		
	}
	private void setUpScenary2() {
		
	}
	
	@Test
	void testMagicSquare() {
		
		int order = 5;
		MagicSquare ms = new MagicSquare(order);
		
		assertNotNull("The magicsquare was not succesfully created",ms.equals(null));
		
		assertTrue("The magicsquare does not have 5 rows", ms.getMatrix().length == 5);
		assertTrue("The magicsquare does not have 5 columns", ms.getMatrix()[0].length == 5);
	}

}

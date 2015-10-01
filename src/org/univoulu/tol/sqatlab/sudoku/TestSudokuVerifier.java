package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void FirstRowisCorrectHorizontally() {
		int result = 0;
		for(int i = 0;i < 9; i++)
		{
			
			assertEquals(result, 45)	;

		}
	}

}

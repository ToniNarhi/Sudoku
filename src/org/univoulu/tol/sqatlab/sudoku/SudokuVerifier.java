package org.univoulu.tol.sqatlab.sudoku;



public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		String[] firstrow = new String[9];
		String[] stringArray = new String[] {candidateSolution};
		for(int i = 0; i < 8; i++)
		{
		firstrow[i] = stringArray[i];
		}		
		System.out.println("Runs!");
		return 0;
	}
}

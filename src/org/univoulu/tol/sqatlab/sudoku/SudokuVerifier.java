package org.univoulu.tol.sqatlab.sudoku;



public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		//String[] firstrow = new String[10];
		final String[] stringArray = new String[] {candidateSolution};
		int[][] firstrow = new int[stringArray.length/9][stringArray.length/9];
		//String[] stringArray = new String[] {candidateSolution};
		//int candidateSolInt = Integer.parseInt(candidateSolution);
		for(int i = 0; i < stringArray.length/9; i++)
		{
			System.out.println("Array i Runs!");
			for(int u = 0; u < stringArray.length/9; u++)
			{
				System.out.println("Array Runs!");
				firstrow[i][u] = Integer.parseInt(stringArray[u]);
				System.out.println(firstrow[i][u]);
			}
		}	
		System.out.println("Runs!");
		return 0;
	}
}

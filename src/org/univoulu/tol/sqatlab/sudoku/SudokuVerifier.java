package org.univoulu.tol.sqatlab.sudoku;



public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		//String[] firstrow = new String[10];
		String[] stringArray = new String[] {candidateSolution};
		int[][] firstrow = new int[stringArray.length/9][stringArray.length/9];
		//String[] stringArray = new String[] {candidateSolution};
		//int candidateSolInt = Integer.parseInt(candidateSolution);
		for(int i = 0; i < stringArray.length/9; i++)
		{
			for(int u = 0; u < stringArray.length/9; u++)
			{
				firstrow[i][u] = Integer.parseInt(stringArray[i+u]);
				System.out.println(firstrow[i][u]);
			}
		}	
		System.out.println("Runs!");
		return 0;
	}
}

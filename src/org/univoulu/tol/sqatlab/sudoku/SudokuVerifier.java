package org.univoulu.tol.sqatlab.sudoku;



public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		//String[] firstrow = new String[10];
		final char[] stringArray = candidateSolution.toCharArray();//new String[] {candidateSolution};
		int[][] firstrow = new int[stringArray.length/9][stringArray.length/9];
		//String[] stringArray = new String[] {candidateSolution};
		//int candidateSolInt = Integer.parseInt(candidateSolution);
		//System.out.println(stringArray.length);
		for(int i = 0; i < stringArray.length/9; i++)
		{
			//System.out.println("Array i Runs!");
			for(int u = 0; u < stringArray.length/9; u++)
			{
				//System.out.println("Array Runs!");
				firstrow[i][u] = Character.getNumericValue(stringArray[(u*9))+i]);
				System.out.println(firstrow[i][u]);
			}
		}	
		System.out.println("Runs!");
		return 0;
	}
}

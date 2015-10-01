package org.univoulu.tol.sqatlab.sudoku;



public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		//String[] firstrow = new String[10];
		final char[] stringArray = candidateSolution.toCharArray();//new String[] {candidateSolution};
		int[][] firstrow = new int[stringArray.length/9][stringArray.length/9];
		//String[] stringArray = new String[] {candidateSolution};
		//int candidateSolInt = Integer.parseInt(candidateSolution);
		for(int i = 0; i < stringArray.length/9; i++)
		{
			//System.out.println("Array i Runs!");
			for(int u = 0; u < stringArray.length/9; u++)
			{
				//System.out.println("Array Runs!");
				firstrow[i][u] = Character.getNumericValue(stringArray[u%9+i*9]);
				System.out.println(firstrow[i][u]);			
			}

		}	
		int[] answerArray = new int[9];
		for(int i = 0; i < stringArray.length/9; i++)
		{
			for(int u = 0; u < stringArray.length/9; u++)
			{
				int x =0;
				x= u +1;
				System.out.println("U:" + x);
				System.out.println("firstrow:" + firstrow[0][i]);
				if(x == firstrow[i][0])
				{
					System.out.println("Answer Array runs!");
					answerArray[i]++;
				}	
			}
		
		}
		for(int i = 0; i < 9; i++)
		{
			System.out.println("Answer Array:" + answerArray[i]);
		}
		System.out.println("Runs!");
		return 0;
	}
}

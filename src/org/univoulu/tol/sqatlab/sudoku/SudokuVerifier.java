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
		int[] VerticalAnswerArray = new int[9];
		int[] HorizontalAnswerArray = new int[9];
		
		//Vertical
		for(int j = 0; j < stringArray.length/9; j++)
		{
			//Correct
			for(int i = 0; i < stringArray.length/9; i++)
			{
				for(int u = 0; u < stringArray.length/9; u++)
				{
					int x =0;
					x= u +1;
					System.out.println("U:" + x);
					System.out.println("firstrow:" + firstrow[j][i]);
					if(x == firstrow[j][i])
					{
						//if(x == 1 && firstrow[0][i] == 1)
						//{
						//System.out.println("Answer Array runs!");
						VerticalAnswerArray[x-1]++;
						
				
						//}
					}	
				}
			}
		}
		//Horizontal
		for(int j = 0; j < stringArray.length/9; j++)
		{
			//Correct
			for(int i = 0; i < stringArray.length/9; i++)
			{
				for(int u = 0; u < stringArray.length/9; u++)
				{
					int x =0;
					x= u +1;
					System.out.println("U:" + x);
					System.out.println("firstrow:" + firstrow[i][j]);
					if(x == firstrow[i][j])
					{
						//if(x == 1 && firstrow[0][i] == 1)
						//{
						//System.out.println("Answer Array runs!");
						HorizontalAnswerArray[x-1]++;
						
				
						//}
					}	
				}
			}
		}
		
		//Grid
		for()
		for(int i = 0; i < 9; i++)
		{
			System.out.println("Vertical Answer Array:" + VerticalAnswerArray[i]);
		}
		for(int i = 0; i < 9; i++)
		{
			System.out.println("Horizontal Answer Array:" + HorizontalAnswerArray[i]);
		}
		System.out.println("Runs!");
		return 0;
	}
}

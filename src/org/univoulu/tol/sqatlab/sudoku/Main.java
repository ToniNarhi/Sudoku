package org.univoulu.tol.sqatlab.sudoku;

public class Main {
	
	public static void main(String[] args)
	{
	String sudokuValues = "41369825632158947958724316825437169791586432346912758289643571573291684164875293";
	SudokuVerifier sudokuVerifier = new SudokuVerifier();
	sudokuVerifier.verify(sudokuValues);

	}
}

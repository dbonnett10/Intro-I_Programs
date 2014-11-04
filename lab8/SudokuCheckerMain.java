//************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts
// Dan Bonnett
// CMPSC Fall 2014
// Lab 8
// 11 04 2014
//
// Purpose: To enhance your experience with designing and implementing your own Java classes
// ************************************

public class SudokuCheckerMain
{

    public static void main (String[] args)
    {
        SudokuChecker checker = new SudokuChecker();
        System.out.println("Welcome to the Sudoku Checker");
        checker.getGrid();
        checker.checkGrid();
    }
}

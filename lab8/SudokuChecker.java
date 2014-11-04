//**************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts
// Dan Bonnett
// CMPSC Fall 2014
// Lab 8
// 11 04 2014
//
// Purpose: To enhance your experience with designing and implementing your own Java classes
// ************************************

import java.util.Scanner;

public class SudokuChecker
{
    //Private Data Members:
    int w1, w2, w3, w4;
    int x1, x2, x3, x4;
    int y1, y2, y3, y4;
    int z1, z2, z3, z4;

    Scanner scan = new Scanner(System.in);

    //The Constructor:
    public SudokuChecker()
    {
        w1 = 0;
        w2 = 0;
        w3 = 0;
        w4 = 0;

        x1 = 0;
        x2 = 0;
        x3 = 0;
        x4 = 0;

        y1 = 0;
        y2 = 0;
        y3 = 0;
        y4 = 0;

        z1 = 0;
        z2 = 0;
        z3 = 0;
        z4 = 0;

    }
    public void getGrid()
    {
        System.out.println("Enter the values for row 1(Do not use spaces)");
        String row1 = scan.next();
        char char0 = row1.charAt(0);
        char char1 = row1.charAt(1);
        char char2 = row1.charAt(2);
        char char3 = row1.charAt(3);

        w1 = Character.getNumericValue(char0);
        w2 = Character.getNumericValue(char1);
        w3 = Character.getNumericValue(char2);
        w4 = Character.getNumericValue(char3);

        System.out.println("Enter the values for row 2(Do not use spaces)");
        String row2 = scan.next();
        char0 = row2.charAt(0);
        char1 = row2.charAt(1);
        char2 = row2.charAt(2);
        char3 = row2.charAt(3);

        x1 = Character.getNumericValue(char0);
        x2 = Character.getNumericValue(char1);
        x3 = Character.getNumericValue(char2);
        x4 = Character.getNumericValue(char3);

        System.out.println("Enter the values for row 3(Do not use spaces)");
        String row3 = scan.next();
        char0 = row3.charAt(0);
        char1 = row3.charAt(1);
        char2 = row3.charAt(2);
        char3 = row3.charAt(3);

        y1 = Character.getNumericValue(char0);
        y2 = Character.getNumericValue(char1);
        y3 = Character.getNumericValue(char2);
        y4 = Character.getNumericValue(char3);

        System.out.println("Enter the values for row 4(Do not use spaces)");
        String row4 = scan.next();
        char0 = row4.charAt(0);
        char1 = row4.charAt(1);
        char2 = row4.charAt(2);
        char3 = row4.charAt(3);

        z1 = Character.getNumericValue(char0);
        z2 = Character.getNumericValue(char1);
        z3 = Character.getNumericValue(char2);
        z4 = Character.getNumericValue(char3);


    }

        public void checkGrid()
        {
            boolean sudoku = true;

            if (w1+w2+w3+w4==10)    //Checks if row1 is good
            {
                System.out.println("Row 1 is good");
            }

            else
            {
                System.out.println("Row 1 is not good");
                sudoku=false;
            }

            if (x1+x2+x3+x4==10)    //Checks if row2 is good
            {
                System.out.println("Row 2 is good");
            }

            else
            {
                System.out.println("Row 2 is not good");
                sudoku=false;
            }

             if (y1+y2+y3+y4==10)   //Checks if row3 is good
            {
                System.out.println("Row 3 is good");
            }

            else
            {
                System.out.println("Row 3 is not good");
                sudoku=false;
            }

             if (z1+z2+z3+z4==10)   //Checks if row4 is good
            {
                System.out.println("Row 4 is good");
            }

            else
            {
                System.out.println("Row 4 is not good");
                sudoku=false;
            }

                    System.out.println();

                if (w1+x1+y1+z1==10)   //Checks if the first column is good
            {
                System.out.println("Column 1 is good");
            }

            else
            {
                System.out.println("Column 1 is not good");
                sudoku=false;
            }

             if (w2+x2+y2+z2==10)   //Checks if the second column is good
            {
                System.out.println("Column 2 is good");
            }

            else
            {
                System.out.println("Column 2 is not good");
                sudoku=false;
            }

             if (w3+x3+y3+z3==10)   //Checks if the third column is good
            {
                System.out.println("Column 3 is good");
            }

            else
            {
                System.out.println("Column 3 is not good");
                sudoku=false;
            }

             if (w4+x4+y4+z4==10)   //Checks if the fourth column is good
            {
                System.out.println("Column 4 is good");
            }

            else
            {
                System.out.println("Column 4 is not good");
                sudoku=false;
            }

                System.out.println();

             if (w1+w2+x1+x2==10)   //Checks if the first region is good
            {
                System.out.println("Region 1 is good");
            }

            else
            {
                System.out.println("Region 1 is not good");
                sudoku=false;
            }

             if (y1+y2+z1+z2==10)   //Checks if the second region is good
            {
                System.out.println("Region 2 is good");
            }

            else
            {
                System.out.println("Region 2 is not good");
                sudoku=false;
            }

             if (w3+w4+x3+x4==10)   //Checks if the third region is good
            {
                System.out.println("Region 3 is good");
            }

            else
            {
                System.out.println("Region 3 is not good");
                sudoku=false;
            }

             if (y3+y4+z3+z4==10)   //Checks if the fourth region is good
            {
                System.out.println("Region 4 is good");
            }

            else
            {
                System.out.println("Region 4 is not good");
                sudoku=false;
            }

                System.out.println();

                if (sudoku==true)
                {
                    System.out.println("The Sudoku Grid is Valid");
                }

                else
                {
                    System.out.println("The Grid is Invalid");
                }

        }


}





















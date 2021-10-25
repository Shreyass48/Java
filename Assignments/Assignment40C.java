/*
  Write Java program which accept number of rows and number of columns
  from user and display below pattern.
  Input  :  iRow = 6, iCol = 6
  Output : * * * * * *
           *       * *          
           *     *   *
           *   *     *
           * *       *
           * * * * * *

*/

import java.util.*;


class Pattern
{
  public void Pattern(int row, int col)
  {
    int i = 0, j = 0;
        
    for(i = 1; i <= row; i++)
    {
      for(j = col; j >= 1 ; j--)
      {
        if(i == j )
        {
        System.out.print("*\t");
        }
        else if((i == 1 || i == row) || (j == 1 || j == col))
        {
          System.out.print("*\t");
        }
        else
        {
          System.out.print(" \t");
        }
     
      }
      System.out.println();
      
    } 
    
  }
}

class Assignment40C
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    int iRow = 0, iCol = 0;

    System.out.println("Enter number of rows:");
    iRow = sobj.nextInt();
    System.out.println("Enter number of cols:");
    iCol = sobj.nextInt();


    Pattern pobj = new Pattern();
    pobj.Pattern(iRow, iCol);

  }
}
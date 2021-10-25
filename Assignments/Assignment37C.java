/*
  Write Java program which accept number of rows and number of columns
  from user and display below pattern.
  Input  :  iRow = 3, iCol = 5
  Output : 5 4 3 2 1
           5 4 3 2 1
           5 4 3 2 1

*/

import java.util.*;


class Pattern
{
  public void Pattern(int row, int col)
  {
    int i = 0, j = 0;
    
    for(i = 1; i <= row; i++)
    {
      for(j = col; j >= 1; j--)
      {
          System.out.print(j);
          System.out.print("   ");
          
      }
      System.out.println();
      
    } 
    
  }
}

class Assignment37C
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    int iRow = 0, iCol = 0;

    System.out.println("Enter number of rows:");
    iRow = sobj.nextInt();
    System.out.println("Enter number of columns:");
    iCol = sobj.nextInt();

    Pattern pobj = new Pattern();
    pobj.Pattern(iRow,iCol);



  }
}
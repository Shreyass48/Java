/*
  Write Java program which accept number of rows and number of columns
  from user and display below pattern.
  Input  :  iRow = 4, iCol = 5
  Output : 4 4 4 4 4
           3 3 3 3 3
           2 2 2 2 2
           1 1 1 1 1
           
*/

import java.util.*;


class Pattern
{
  public void Pattern(int row, int col)
  {
    int i = 0, j = 0;
    
    for(i = row; i >= 1; i--)
    {
      for(j = 1; j <= col; j++)
      {
          System.out.print(i);
          System.out.print("   ");
          
      }
      System.out.println();
      
    } 
  }
}

class Assignment36D
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
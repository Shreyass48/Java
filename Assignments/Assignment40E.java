/*
  Write Java program which accept number of rows and number of columns
  from user and display below pattern.
  Input  :  iRow = 4, iCol = 4
  Output :  1 2 3 4 5
            1 2     5
            1   3   5
            1     4 5
            1 2 3 4 5


*/

import java.util.*;


class Pattern
{
  public void Pattern(int row, int col)
  {
    int i = 0, j = 0;
        
    for(i = 1; i <= row; i++)
    {
      for(j = 1; j <= col ; j++)
      {
       if(i == j)
       {
       System.out.print(j);
       System.out.print("\t");
       }
       else if(i == 1 || i == row)
       {
        System.out.print(j);
        System.out.print("\t");
       }
       else if(j == 1 || j == col)
       {
        System.out.print(j);
        System.out.print("\t");
       }
       else
       {
        System.out.print("\t");
       }
      
     
      }
      System.out.println();
      
    } 
    
  }
}

class Assignment40E
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
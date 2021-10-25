/*
  Write Java program which accept number of rows and number of columns
  from user and display below pattern.
  Input  :  iRow = 3, iCol = 4
  Output : * # * #
           * # * #
           * # * #

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
          if(j % 2 == 0)
          {
            System.out.print("#");
            System.out.print("   ");
          }
          else
          {
            System.out.print("*");
            System.out.print("   ");
          }
          
      }
      System.out.println();
      
    } 
    
  }
}

class Assignment37D
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
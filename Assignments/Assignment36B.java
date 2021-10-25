/*
  Write Java program which accept number of rows and number of columns
  from user and display below pattern.
  Input  :  iRow = 4, iCol = 4
  Output : A B C D
           a b c d
           A B C D
           a b c d
*/

import java.util.*;


class Pattern
{
  public void Pattern(int row, int col)
  {
    int i = 0,j = 0;
    char ch = 'A', chh = 'a';
    
    for(i = 1; i <= row; i++)
    {
      for(j = 1; j <= col; j++)
      {
        if(i % 2 == 0)
        {
          System.out.print(chh);
          System.out.print("   ");
          chh++;
        }
        else
        {
          System.out.print(ch);
          System.out.print("   ");
          ch++;
        }

      }
      ch = 'A';
      System.out.println();
    }
  }
}

class Assignment36B
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
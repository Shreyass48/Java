/*
  Write Java program which accept number of rows and number of columns
  from user and display below pattern.
  Input  :  hello
  Output : h e l l o
           h e l l *
           h e l * *
           h e * * *
           h * * * *

*/

import java.util.*;

class Pattern
{
  public void Pattern(String str)
  {
    char Arr[] = str.toCharArray();
    int i = 0, j = 0;

    for(i = Arr.length - 1; i >= 0; i--)
    {

      for(j = 0; j < Arr.length; j++)
      {

        
        if(i >= j)
        {
          System.out.print(Arr[j]);
          System.out.print("    ");
        }
        else
        {
          System.out.print("*");
          System.out.print("    ");
        }
        
      
      }
      System.out.println();
    }

  }
} 

class Assignment39B
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    String s;
    System.out.println("Enter string:");
    s = sobj.nextLine();

    Pattern pobj = new Pattern();
    pobj.Pattern(s);
  }
}
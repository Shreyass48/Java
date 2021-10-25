/*
  Write Java program which accept number of rows and number of columns
  from user and display below pattern.
  Input  :  hello
  Output : h e l l o
           h e l l o
           h e l l o
           h e l l o

*/

import java.util.*;


class Pattern
{
  public void Pattern(String str)
  {
    int i = 0, j = 0;

    char Arr[] = str.toCharArray();
        
    for(i = 0; i < Arr.length - 1; i++)
    {
      for(j = 0; j < Arr.length; j++)
      {
        
        System.out.print(Arr[j]);
        System.out.print("   ");
        
      }
      System.out.println();
      
    } 
    
  }
}

class Assignment38A
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    String s;

    System.out.println("Enter String:");
    s = sobj.next();

    Pattern pobj = new Pattern();
    pobj.Pattern(s);

  }
}
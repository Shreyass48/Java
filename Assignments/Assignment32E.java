/*
  Write Java program which accept N numbers from user and display
  all such elements which are multiples of 11.
  Input  : 22 44 54 23 88
  Output : 22 44 88
 */

import java.util.*;

class ArrayDemo
{
  public void Display(int Arr[])
  {
    int  i = 0;
    for(i = 0; i < Arr.length; i++)
    {
      if(Arr[i] % 11 == 0)
      {
        System.out.println(Arr[i]);
      }
    }
  }
}

class Assignment32E
{
  public static void main(String arg[])
  {
   Scanner sobj = new Scanner(System.in);

   int iNo = 0, i = 0;
   System.out.println("Enter number of elements:");
   iNo = sobj.nextInt();

   int [] brr = new int[iNo];

   for(i = 0; i < iNo; i++)
   {
      brr[i] = sobj.nextInt();
   } 

   System.out.println("Output:");

   ArrayDemo obj = new ArrayDemo();
   obj.Display(brr);


  }
}
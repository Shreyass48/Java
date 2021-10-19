/*
  Write Java program which accept N numbers from user and display
  all such elements which are divisible by 5.
  Input  : 85 66 3 80 93 88
  Output : 85 80
 */

import java.util.*;

class ArrayDemo
{
  public void Display(int Arr[])
  {
    int i = 0;
    for(i = 0; i < Arr.length; i++)
    {
      if(Arr[i] % 5 == 0)
      {
        System.out.println(Arr[i]);
      }
    }
  }
}

class Assignment32B
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
 
    System.out.println("Divisible by 5 elements:");

    ArrayDemo obj = new ArrayDemo();
    obj.Display(brr);


  }
}
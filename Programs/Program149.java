/*
  Program to pass String to the function.
  Date : 19/10/21
*/

import java.util.*;

class Marvellous
{
   public void Display(String Data)
   {
        System.out.println("WELCOME "+Data);
   }
}

class Program149
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        String str;

        System.out.println("Enter Username: ");
        str = sobj.nextLine();

        Marvellous mobj = new Marvellous();
        mobj.Display(str);
    }
}
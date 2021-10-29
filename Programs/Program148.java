/*
  Program to take String from suer and Display on screen.
  Date : 19/10/21
*/

import java.util.*;

class Program148
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        String str;

        System.out.println("Enter Username: ");
        str = sobj.nextLine();

        System.out.println("Hey "+str);
    }
}
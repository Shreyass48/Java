/*
  Program to pass String to the function.
  Date : 19/10/21
*/

import java.util.*;

class StringX
{
    public String str;          // Characteristics

    public void Accept()        // Behaviour
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String :");
        str = sobj.nextLine();
    }

    public void Display()
    {
        System.out.println("Entered String is :"+str);
    }
}


class Program150
{
    public static void main(String arg[])
    {
        StringX sobj = new StringX();
        sobj.Accept();
        sobj.Display();
    }
}
/*
  Program to accept String and display reverse.
  use valueOf method to convert array into str
  Date : 19/10/21
*/

import java.util.*;

class StringX
{
    public String str;          

    public void Accept()        
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


class Marvellous extends StringX    
{
    public String ReverseX()
    {
        char Arr [] = str.toCharArray();
        int iStart = 0, iEnd = Arr.length - 1;
        char iTemp;

        while(iStart < iEnd)
        {
            iTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = iTemp;

            iStart++;
            iEnd--;
        }

        return String.valueOf(Arr);    // Method2 : using valueof() to convert into string and return
    }
}


class Program154
{
    public static void main(String arg[])
    {
        String s;
       Marvellous mobj = new Marvellous();
       mobj.Accept();
       mobj.Display();
       s = mobj.ReverseX();
       System.out.println("Reverse String is: "+s);
    }
}
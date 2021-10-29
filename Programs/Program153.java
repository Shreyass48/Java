/*
  Program to accept String and display reverse.
  use object string then return
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

        return new String(Arr);          // Method1 : Create obj and then convert to string and return
        //return String.valueOf(Arr);    // Method2 : using valueof() to convert into string and return
    }
}


class Program153
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
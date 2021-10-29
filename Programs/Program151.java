/*
  Program to accept String from user and count vowels.
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
    public int CountVowel()
    {
        char Arr[] = str.toCharArray();     //String convert to char Array
        int iCnt = 0, i = 0;
        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] == 'a') || (Arr[i] == 'e') || (Arr[i] == 'i') || (Arr[i] == 'o') || (Arr[i] == 'u') ||
                (Arr[i] == 'A') || (Arr[i] == 'E') || (Arr[i] == 'I') || (Arr[i] == 'O') || (Arr[i] == 'U'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}


class Program151
{
    public static void main(String arg[])
    {
        int iRet = 0;

        Marvellous mobj = new Marvellous();
        mobj.Accept();
        mobj.Display();
        iRet = mobj.CountVowel();

        System.out.println("Number of Vowels are: "+iRet);

    }
}
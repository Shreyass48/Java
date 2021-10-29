/*
  Program to accept String and check whether it is palindrome or not.
  use equal built in method
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
    public boolean CheckPalindrome()
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

        String newstr = new String(Arr);    //Create new string and it holds reverse of string.(which is in Arr)

        boolean bRet = newstr.equals(str); //using equal method we compare str and arr(rev string).
        return bRet; 
       
    }
}


class Program156
{
    public static void main(String arg[])
    {
       boolean bRet = false;
       Marvellous mobj = new Marvellous();
       mobj.Accept();
       mobj.Display();
       bRet = mobj.CheckPalindrome();

       if(bRet == true)
       {
         System.out.println("String is Palindrome!");
       }
       else
       {
         System.out.println("String is not Palindrome!");
       }
       
    }
}
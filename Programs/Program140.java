// Program to Add of 2 number in Diff class.(best approch)
// Date : 13/10/21

import java.util.*;

class Marvellous
{
    public int Addition(int i, int j)
    {
        int iResult = 0;
        iResult = i + j;
        return iResult;

    }
}

class Program140
{
    public static void main(String str[])
    {
    

        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0, iAns = 0;
        
        System.out.println("Enter first number:");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number:");
        iNo2 = sobj.nextInt();

        Marvellous mobj = new Marvellous();   //object creation
        iAns = mobj.Addition(iNo1, iNo2);     //obj.method
        
        System.out.println("Addition is:"+iAns);

    }   
}
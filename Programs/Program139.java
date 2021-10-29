// Program to Add of 2 number in same class.
// Date : 13/10/21

import java.util.*;

class Program139
{
    public static int Addition(int i, int j)   //static is needed coz we can't access non static method in same class.
    {
        int iResult = 0;
        iResult = i + j;
        return iResult;

    }
    public static void main(String str[])
    {
    

        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0, iAns = 0;
        
        System.out.println("Enter first number:");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number:");
        iNo2 = sobj.nextInt();

        iAns = Addition(iNo1, iNo2);
        
        System.out.println("Addition is:"+iAns);

    }   
}

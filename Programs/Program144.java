/*
  Array
  Accept N numbers from user and perform Addition on it.
  Date : 18/10/21
*/

import java.util.*;
class Marvellous{

    public int Addition(int Brr[])
    {
        int iSum = 0, iCnt = 0;
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            iSum = iSum + Brr[iCnt];
        }
        return iSum;
    }
}


class Program144
{   
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize = 0, iCnt = 0, iRet = 0;

        System.out.println("Enter number of elements:");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];


        System.out.println("Enter elements:");
         for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }


        Marvellous obj = new Marvellous();
        iRet = obj.Addition(Arr);   //only call by value valid in JAVA(we passed directly value HASHCODE)

        System.out.println("Addition is:"+iRet);
       
       
    }
}



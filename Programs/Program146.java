/*
  Accept N numbers from user and perform Addition on it.(Best approch,using OOP)
  Using own pkg
  Date : 18/10/21
*/

import java.util.*;
import MarvellousNumbers.ArrayX;


class Marvellous extends ArrayX     
{
    public Marvellous(int iValue)
    {
        super(iValue);             
    }
    public int Add()
    {
        int iSum = 0, iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
}

class Program146
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLen = 0, iRet = 0;

        System.out.println("Enter number of elements:");
        iLen = sobj.nextInt();

        Marvellous obj = new Marvellous(iLen);     //it calls constructor
        obj.Accept();
        obj.Display();
        iRet = obj.Add();
        System.out.println("Addition is:"+iRet);

        
    }
}
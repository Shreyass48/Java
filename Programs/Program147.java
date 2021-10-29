/*
  Return Average of given array
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
    public float Average()
    {
        int iSum = 0, iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return (iSum / Arr.length);
    }
}

class Program147
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLen = 0;
        float fRet = 0.0f;

        System.out.println("Enter number of elements:");
        iLen = sobj.nextInt();

        Marvellous obj = new Marvellous(iLen);     //it calls constructor
        obj.Accept();
        obj.Display();
        fRet = obj.Average();
        System.out.println("Average is:"+fRet);
        
    }
}
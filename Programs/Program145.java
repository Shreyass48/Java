/*
  Accept N numbers from user and perform Addition on it.(Best approch,using OOP)
  Date : 18/10/21
*/

import java.util.*;

class ArrayX
{
    public int Arr[];               //reference to array 

    public ArrayX(int iSize)        //Parameterised Constructor
    {
        Arr = new int[iSize];     //Allocate memory
    }

    public void Accept()            //setter method
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;
        System.out.println("Enter elements:");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;
        System.out.println("elements are:");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

class Marvellous extends ArrayX     //Inheritance (it used ArrayX's array)
{
    public Marvellous(int iValue)
    {
        super(iValue);              // to call parent call constructor
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

class Program145
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
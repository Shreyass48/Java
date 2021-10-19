/*
  Write Java program which accept N numbers from user and return
  difference between summation of even elements and summation of
  odd elements.
  Input  : 85 66 3 80 93 88
  Output : 53 (234 - 181)
 */

  import java.util.*;

  class ArrayDemo
  {
  	public int Difference(int Arr[])
  	{
  		int i = 0, iEsum = 0, iOsum = 0, iDiff = 0;
  	    for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] % 2) == 0)
            {
              iEsum = iEsum + Arr[i];
            }
            else
            {
              iOsum = iOsum + Arr[i];
            }
        }

        iDiff = iEsum - iOsum;

        if(iDiff < 0)
        {
          iDiff = -iDiff;
        }
        return iDiff;
  	}
  }

  class Assignment32A
  {
  	public static void main(String arg[])
  	{
  		Scanner sobj = new Scanner(System.in);
  		int iNo = 0, i = 0;
  		int [] brr = new int[20];
  		int iRet = 0;

  		System.out.println("Enter number of elements:");
  		iNo = sobj.nextInt();


  		for(i = 0; i < iNo; i++)
  		{
  			System.out.println("Enter element:");
  			brr[i] = sobj.nextInt();
  		}

      ArrayDemo obj = new ArrayDemo();
  		iRet = obj.Difference(brr);

  		System.out.println("Difference is:"+iRet);




  	}
  }
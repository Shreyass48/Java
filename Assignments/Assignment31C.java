/*
  Write a java program which accept string from user and return
  difference between frequency of small characters and frequency
  of capital characters.
  Input  : MarvellouS 
  Output : 6 (8 - 2)
*/

import java.util.*;

class StringDemo
{
		public int CountDiff(String str)
		{
			 int i = 0;
			 int iCapCnt = 0, iSmlCnt = 0, iDiff = 0;

			 for(i = 0; i < str.length(); i++)
			 {
			 		if((str.charAt(i) >= 'A') && (str.charAt(i) >= 'Z'))
			 		{
			 			iCapCnt++;
			 		}
			 		else
			 		{
			 			iSmlCnt++;
			 		}
			 }

			 iDiff = iSmlCnt - iCapCnt;

			 if(iDiff < 0)
			 {
			 	iDiff = -iDiff;
			 }
			 
			 return iDiff;
		}
	
}

class Assignment31C
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		String s;
		int iRet = 0;

		System.out.println("Enter String:");
		s = sobj.nextLine();

		StringDemo obj = new StringDemo();
		iRet = obj.CountDiff(s);

		System.out.println("Difference is:"+iRet);
	}
 
}


/*
  Write a Java program which accept string from user and count
  number of capital characters.
  Input  : Marvellous Multi OS 
  Output : 4
*/

import java.util.*;

class StringDemo
{
	
	public int CountCapital(String str)
	{
		int iCnt = 0;
		int i = 0;
		for(i = 0; i < str.length(); i++)
		{
		  if((str.charAt(i) <= 'Z') && (str.charAt(i) >= 'A'))
		  {
			  iCnt++;
		  }
	  }
		return iCnt;
	}
}

class Assignment31A
{
	public static void main(String arg [])
	{

		Scanner sobj = new Scanner(System.in);
		
		String s;
		int iRet = 0;

		System.out.println("Enter String:");
		s = sobj.nextLine();

		StringDemo obj = new StringDemo();
		iRet = obj.CountCapital(s);

		System.out.println("Count of capital capital latters are : "+iRet);

	}
}


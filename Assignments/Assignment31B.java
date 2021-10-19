/*
  Write a java program which accept string from user and count
  number of small characters.
  Input  : Marvellous 
  Output : 9
*/

import java.util.*;

class StringDemo
{
	
	 public int CountSmall(String str)
	 {
	 	 int i = 0;
	 	 int iCnt = 0;

	 	 for(i = 0; i < str.length(); i++)
	 	 { 
	 	 		if((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
	 	 		{
	 	 			 iCnt++;
	 	 		}
	 	 	

	 	 }
	 	 return iCnt;
	 }
	
}

class Assignment31B
{
	public static void main(String arg[])
	{
	  Scanner sobj = new Scanner(System.in);

	  String s;
	  int iRet = 0;

	  System.out.println("Enter String:");
	  s = sobj.nextLine();

	  StringDemo obj = new StringDemo();
	  iRet = obj.CountSmall(s);


	  System.out.println("Count of small latters are :"+iRet);


  }
}


/*
  Write a java program which accept string from user and check
  whether it contains vowels in it or not.
  Input  : MarvellouS 
  Output : True
*/

import java.util.*;

class StringDemo
{
	public boolean ChkVowel(String str)
	{
		int i = 0;
		boolean bFlag = false;

		for(i = 0; i < str.length(); i++)
		{
			if((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u') ||
				(str.charAt(i) == 'A') || (str.charAt(i) == 'E') || (str.charAt(i) == 'I') || (str.charAt(i) == 'O') || (str.charAt(i) == 'U'))
			{
				bFlag = true;
				break;
			}

		}
			
				return bFlag;

		}

	}
	


class Assignment31D
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		String s;
		boolean bRet = false;

		System.out.println("Enter String:");
		s = sobj.nextLine();

		StringDemo obj = new StringDemo();
		bRet = obj.ChkVowel(s);

		if(bRet == true)
		{
			System.out.println("Vowels are present!");

		}	
		else
		{
			System.out.println("Vowels are not present!");
		}
	}
 
}


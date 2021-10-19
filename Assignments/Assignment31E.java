/*
  Write a java program which accept string from user and display
  it in reverse order.
  Input  : MarvellouS 
  Output : SuollevraM
*/

import java.util.*;

class StringDemo
{
	public void Reverse(String str)
	{
		
		int i = 0;
		for(i = str.length()-1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}

	}
}
	


class Assignment31E
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		String s;

		System.out.println("Enter String:");
		s = sobj.nextLine();

		StringDemo obj = new StringDemo();
		obj.Reverse(s);

		System.out.println();

		}
 
}


/*
  Accept string from user and check whether the string is
  palindrome or not without considering its case
  Input  :  1abccBA1
  Output :  palindrome
*/

import java.util.*;

class StringX
{
	public String str1;


	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter First String: ");
		str1 = sobj.nextLine();
		
	}

	public void Display()
	{
		System.out.println("Entered first String: "+str1);
	}
}


class StringDemo extends StringX
{
	public String StrPallindrome()
	{
			char Arr[] = str1.toCharArray();
			int iStrt = 0, iEnd = Arr.length - 1, i = 0;
			char temp;

			while(iStrt < iEnd)
			{
				temp = Arr[iStrt];
				Arr[iStrt] = Arr[iEnd];
				Arr[iEnd] = temp;

				iStrt++;
				iEnd--;
			}

			return new String(Arr);


	}
}
	


class Assignment35D
{
	public static void main(String arg[])
	{
		String s;

		StringDemo obj = new StringDemo();
		obj.Accept();
		
		s = obj.StrPallindrome();

		System.out.println("Output:"+s);



	}
 
}

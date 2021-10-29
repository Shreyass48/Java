// Program to check given number is Armstrong or not.
// Date : 13/10/21


import java.util.*;

class Marvellous
{
    public boolean CheckArmstrong(int iNo)
    {
    	int iTemp = 0;
    	
    	if(iNo < 0)    // Filter.
    	{
    	   iNo = -iNo;
    	}
    	
    	iTemp = iNo;
	int iDigCnt = 0, iCnt = 0, iSum = 0;
	int iDigit = 0;
	int iPower = 1;
	while(iTemp != 0)		//while for index count(digit count)
	{
	   iDigCnt++;
	   iTemp = iTemp / 10;
	}
	iTemp = iNo;    //reset value to iTemp
	
	while(iTemp != 0)
	{
	   iDigit = iTemp % 10;
	   for(iCnt = 1; iCnt <= iDigCnt; iCnt++)
	   {
	      iPower = iPower * iDigit;
	   }
	   iSum =  iSum + iPower; //add power into sum
	   iPower = 1;           //reset after loop to 1 
	   iTemp = iTemp / 10;
	}
	if(iSum == iNo)
	{
	    return true;
	}
	else
	{
	   return false;
	}
    }
}

class Program142
{   
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number:");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        bRet = mobj.CheckArmstrong(iValue);

        if(bRet == true)
        {
            System.out.println("It is a Armstrong number!");
        }
        else
        {
            System.out.println("It is not a Armstrong number!");
        }
    }
}



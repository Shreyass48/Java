package MarvellousNumbers;
import java.util.*;

public class StringX
{
    public String str;          

    public void Accept()        
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String :");
        str = sobj.nextLine();
    }

    public void Display()
    {
        System.out.println("Entered String is :"+str);
    }
}
package Palindrome;
import java.util.*;

public class PalindromeMain {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
        StringBuffer str=new StringBuffer(s.nextLine());		
		String str2=str.toString();
        StringBuffer str1=str.reverse();
        
        System.out.println(str2.equals(str1.toString()));
        if(str2.equals(str1.toString()))
        {
        	System.out.println("string is palindrome");
        }
        else
        {
        	System.out.println("string is not palindrome");
        }
        System.out.println(str2+str1.toString());
	}

}

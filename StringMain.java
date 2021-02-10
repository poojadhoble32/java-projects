package Stringopt;
import java.util.*;
import java.io.*;

public class StringMain {
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		
		char ch[]=new char[s.length()];
		ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
		if((ch[i]>='A')&&(ch[i]<='Z'))
		{
			ch[i]=Character.toLowerCase(ch[i]);
		}
		else
		{
			ch[i]=Character.toUpperCase(ch[i]);
		}
		}
		
		String s1=new String(ch);
		System.out.print(s1);
	}	
	
	
}

package charcase;
import java.io.*;

public class CaseMain{
	public static void main(String arg[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("enter string");
	
	char ch=br.readLine().charAt(0);
	
	if((ch>='A')&&(ch<='Z'))
	{
		ch=Character.toLowerCase(ch);
	}
	else
	{
		ch=Character.toUpperCase(ch);
	}
    	
    System.out.println(ch);
}}

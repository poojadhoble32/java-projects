package checkcharinstring;
import java.util.*;
import java.io.*;

public class CheckCharMain {
	public static void main(String arg[])throws Exception
	{ 
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		System.out.println("enter first string");
		sb.append(s.nextLine());
		
		StringBuffer sb1=new StringBuffer();
		System.out.println("enter second string");
		sb1.append(s.nextLine());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb2=new StringBuffer();
		System.out.println("enter third string");
		sb2.append(br.readLine());
		
		StringBuffer sb3=new StringBuffer();
		System.out.println("enter fourth string");
		sb3.append(br.readLine());
		
		if(sb.toString().equals(sb1.toString()))
		{
			System.out.println("both string 1 and 2 are same");
		}
		else
		{
			System.out.println("both string 1 and 2 are not same");
		}
		
		if(sb.toString().equals(sb2.toString()))
		{
			System.out.println("both string 1 and 3 are same values");
		}
		else
		{
			System.out.println("both string 1 and 3 are not same values");
		}
		
		if(sb2.toString().equals(sb3.toString()))
		{
			System.out.println("both string 3 and 4 are same");
		}
		else
		{
			System.out.println("both string 3 and 4 are not same");
		}
		
		if(sb==sb1)
		{
			System.out.println("both string 1 and 2 hashcode is same");
		}
		else
		{
			System.out.println("both string 1 and 2 hashcode is not same");
		}
		
		if(sb==sb2)
		{
			System.out.println("both string 1 and 3 hashcode is same");
		}
		else
		{
			System.out.println("both string 1 and 3 hashcode is not same");
		}
	}

}

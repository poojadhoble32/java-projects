package checkchar;

import java.util.Scanner;

public class CheckMain {
	public static void main(String arg[])throws Exception
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String ss=s.nextLine();
		
		StringBuffer sb=new StringBuffer(ss);
		
		System.out.println(ss.contains("o"));
		System.out.println(ss.indexOf("o"));
		System.out.println(ss.lastIndexOf("o"));
		System.out.println(sb.reverse());
		System.out.println(ss.replace('h','m'));
	}
}
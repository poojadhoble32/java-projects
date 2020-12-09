package array;
import java.util.Scanner;
import java.util.ArrayList;

public class arrayremovemain {
      public static void main(String[] args)
      {
    	  int size=0;
    	  
    	  Scanner sc=new Scanner(System.in);
    	  
    	  System.out.println("enter size");
    	  
    	  size=sc.nextInt();
    	  
    	  ArrayList al=new ArrayList();
    	  
    	  al.add(23);
    	  al.add("p");
    	  al.add(34);
    	  al.add(44);
    	  al.add(5);
    	  
    	  System.out.println(al);
    	/*  System.out.println("enter objects in arraylist:");
    	  int i=0;
          while(i<size)
          {
        	  al.add(i,al);
        	  i++;
          }
          
    	  System.out.println("enter element to remove:");
    	  sc.no=al.add(e);
    	  */
    	  removelement re=new removelement();
    	  
    	  re.remov(al);
    	  
    	  System.out.println("new array is:"+al);
    	  
      }
	
}

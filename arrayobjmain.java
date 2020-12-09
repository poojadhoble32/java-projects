package arrayobj;
import java.util.Scanner;


public class arrayobjmain {
      public static void main(String args[])
      {
    	  Scanner sc=new Scanner(System.in);
    	  
    	  System.out.println("enter size of student list:");
    	  int size=sc.nextInt();
    	  
    	  arrayobjclass[] array=new arrayobjclass[size];
    	  
    	  for(int i=0;i<array.length;i++)
    	  {
    		  System.out.println("rollno");
        	  int rollno=sc.nextInt();
        	  
        	  System.out.println("name");
        	  String name=sc.next();
        	  
        	  System.out.println("marks");
        	  int marks=sc.nextInt();
        	  
        	  array[i]=new arrayobjclass(rollno,name,marks);
    	  }
    	  
    	  int count=0,j=0;
    	  int max=array[j].marks;
    	  
    	  for(j=0;j<array.length;j++)
    	  {
    		  if((j+1)>=array.length)
    		  {
    			  break;
    		  }
    		  
    		  if(array[j+1].marks>max)
    		  {
    			  max=array[j+1].marks;
    			  count=j+1;
    		  }
    	  }
    	  
    	  array[count].display();
    	  
      }
}

import java.util.*;

class Demo1
{
public void Check(int Arr1[],int Arr2[])
{
int i=0;

for(i=Arr1.length-1;i>=0;i--)
{
Arr2[i]=Arr1[i];
System.out.print(Arr2[i]+"\t");
}

/*for(int j=0;j<Arr2.length;j++)
{
System.out.print(Arr2[j]+"\t");
}*/


} 
}

class Array
{
public static void main(String arg[])
{
Scanner sobj=new Scanner(System.in);

System.out.println("enter size of first array");

int size1=sobj.nextInt();

int Arr1[]=new int[size1];

System.out.println("enter elements"); 

for(int i=0;i<Arr1.length;i++)
{
Arr1[i]=sobj.nextInt();
}

/*System.out.println("enter size of second array");

int size2=sobj.nextInt();*/

int Arr2[]=new int[size1];

/*System.out.println("enter elements"); 

for(int i=0;i<Arr2.length;i++)
{
Arr2[i]=sobj.nextInt();
}


System.out.println("enter element to search");

int No=sobj.nextInt();
*/
Demo1 dobj=new Demo1();

int iRet=0;

dobj.Check(Arr1,Arr2);

/*if(iRet==true)
{
System.out.println("present");
}
else
{
System.out.println("Absent");
}*/

/*System.out.println("first occurance is at"+iRet);*/
}
 }
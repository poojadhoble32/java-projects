import java.util.*;

/*class Demo1
{
int iSum1=0,iSum2=0;

public int Diff(int Arr[])
{
for(int i=0;i<Arr.length;i++)
{
if((Arr[i]%2)==0)
{
iSum1=iSum1+Arr[i];
}
else
{
iSum2=iSum2+Arr[i];
}
}
int Dif=iSum1-iSum2;

return Dif;
}
}*/

class Demo2
{
public void Diff(int Arr[])
{
for(int i=0;i<Arr.length;i++)
{
if((Arr[i]%5)==0)
{
System.out.println(Arr[i]);
}
}
}
}

class Number
{
public static void main(String arg[])
{
Scanner sobj=new Scanner(System.in);

System.out.println("enter size of array");
int size=sobj.nextInt();

int Arr[]=new int[size];

System.out.println("enter elements");

for(int i=0;i<size;i++)
{
Arr[i]=sobj.nextInt();
}

Demo2 dobj=new Demo2();

dobj.Diff(Arr);

/*System.out.println("Differenc is"+iRet);*/
}
}
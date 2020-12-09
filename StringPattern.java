import java.util.*;

class Demo1
{
public void Pattern(String str)
{
int iCnt=1,iCnt1=str.length();

for(int i=0;i<str.length()-1;i++)
{
for(int j=0;j<str.length();j++)
{
if(j<iCnt)
{
System.out.print(str.charAt(j)+"\t");
}
else
{
System.out.print("#\t");
}
}
System.out.println();
iCnt++;
}

for(int i=0;i<str.length();i++)
{
for(int j=0;j<str.length();j++)
{
if(j<iCnt1)
{
System.out.print(str.charAt(j)+"\t");
}
else
{
System.out.print("%d\t");
}
}
System.out.println();
iCnt1--;
}
}
}

class StringPattern
{
public static void main(String arg[])
{
Scanner sobj=new Scanner(System.in);

System.out.println("enter string ");
String str=sobj.nextLine();

Demo1 dobj=new Demo1();

dobj.Pattern(str);
}
}



import java.util.*;

class Demo1
{
public boolean string(String str1,String str2,int iCnt)
{
int j=0,i=0;
char Arr1[]=str1.toCharArray();
char Arr2[]=str2.toCharArray();
boolean flag=true;

/*if(Arr1.length!=Arr2.length)
{
return ;
}*/

for(i=Arr1.length-1;i>=0;i--)
{
for(j=0;j<Arr1.length;j++)
{
if(Arr1[i]!=Arr1[j])
{
flag=false;
break;
}
/*else if((Arr1[i]<='z')&&(Arr1[i]>='a'))
{
char ch=Arr1[i]-32;
System.out.print(ch);
}*/

}
}


/*System.out.print("\t");*/

/*for(int j=0;j<iCnt;j++)
{
System.out.print(Arr2[j]);
}*/

if(flag==false)
{
return false;
}
else
{
return true;
}

}
}

class StringConcat
{
public static void main(String arg[])
{
Scanner sobj=new Scanner(System.in);

System.out.println("enter string 1");
String str1=sobj.nextLine();

System.out.println("enter string 2");
String str2=sobj.nextLine();

System.out.println("enter count");
int No=sobj.nextInt();

Demo1 dobj=new Demo1();

boolean Ret=false;

Ret=dobj.string(str1,str2,No);

if(Ret==true)
{
System.out.println("TRUE");
}
else
{
System.out.println("FALSE");
}

}
}



import Marvellous.Maths;

class Demo
{
public static void main(String arg[])
{
System.out.println("inside main");

Maths Mobj;
Mobj=new Maths();

int iRet=0;

iRet=Mobj.Add(10,11);
System.out.println("adiition is"+iRet);
}
}
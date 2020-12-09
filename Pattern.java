import java.util.*;

class Demo1
{
public void DisplayPattern(int Row,int Col)
{
for(int i=0;i<Row;i++)
{
for(int j=0;j<Col;j++)
{
if((j%2)==0)
{
System.out.print("*\t");
}
else
{
System.out.print("#\t");
}
}
System.out.println();

}
}
}

class Pattern
{
public static void main(String arg[])
{
Scanner sobj=new Scanner(System.in);

System.out.println("enter number of rows");
int iRow=sobj.nextInt();

System.out.println("enter number of coloumns");
int iCol=sobj.nextInt();

Demo1 dobj=new Demo1();

dobj.DisplayPattern(iRow,iCol);
}
}

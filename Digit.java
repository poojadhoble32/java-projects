import java.util.*;

class Demo1
{
public int CountDigit(int iNo)
{
int iCnt=0;

if(iNo<0)
{
iNo=-iNo;
}
while(iNo!=0)
{
int iDigit=iNo%10;

if((iDigit>3)&&(iDigit<7))
{
 iCnt++;
}
iNo=iNo/10;
}
return iCnt;
}
}

class Digit
{
public static void main(String arg[])
{
Scanner sobj=new Scanner(System.in);

System.out.println("enter no");

int No=sobj.nextInt();

Demo1 dobj=new Demo1();

int iRet=dobj.CountDigit(No);

System.out.println("count is"+iRet);
}
}

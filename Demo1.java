import java.util.*;

class Number
{
    public boolean chkLucky(int No)
    {
        int arr[]={0,0,0,0,0,0,0,0,0,0};
        
        int iDigit = 0;
        
        if (No < 0)
        {
            No = -No;
        }
        
        while(No != 0)
        {
            iDigit = No %10;
            arr[iDigit]++;
            if(arr[iDigit] > 1)
            {
                break;
            }
            No = No /10;
        }
        
        if (No != 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class Demo1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number");
        int no = sobj.nextInt();
        
        Number nobj = new Number();
        
        boolean bret = false;
        
        bret = nobj.chkLucky(no);
        
        if(bret == true)
        {
            System.out.println("It is Lucky");
        }
        else
        {
            System.out.println("It is not Lucky");
        }
    }
}






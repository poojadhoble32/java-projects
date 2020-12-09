import java.util.*;

class Digits
{
    public boolean ChkAnagram(int no1, int no2)
    {
        int arr[] = {0,0,0,0,0,0,0,0,0,0};
        
        int idigit = 0;
        
        while(no1 != 0)
        {
            idigit = no1 %10;
            arr[idigit]++;
            no1 = no1 /10;
        }
        
        while(no2 != 0)
        {
            idigit = no2 %10;
            arr[idigit]--;
            no2 = no2 /10;
        }
        
        int i = 0;
        for(i = 0; i < 10; i++)
        {
            if (arr[i] != 0)
            {
                break;
            }
        }
        
        if (i == 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Demo41
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int value1 = sobj.nextInt();
        
        System.out.println("Enter second number");
        int value2 = sobj.nextInt();
        
        Digits dobj = new Digits();
        
        boolean bret = false;
        
        bret = dobj.ChkAnagram(value1,value2);
        
        if(bret == true)
        {
            System.out.println("It is anagram");
        }
        else
        {
            System.out.println("It is not anagram");
        }
    }
}







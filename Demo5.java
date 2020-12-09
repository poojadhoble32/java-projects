import java.util.*;

class Line
{
    public int CountCap(String input)
    {
        int count = 0;
        for(int i = 0; i < input.length(); i++)
        {
            if ((input.charAt(i) >= 'A') && (input.charAt(i) <= 'Z'))
            {
                count++;
            }
        }
        return count;
    }
    
    public int CountCapX(String input)
    {
        int count = 0;
        
        char arr[] = input.toCharArray();
        
        for(int i=0; i< arr.length; i++)
        {
            if((arr[i] >= 'A')&&(arr[i]<= 'Z'))
            {
                count++;
            }
        }
        
        return count;
    }
}

class Demo5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String");
        String str = sobj.nextLine();
        
        Line lobj = new Line();
        
        int iret = lobj.CountCapX(str);
        System.out.println("Capital count is "+iret);
    }
}







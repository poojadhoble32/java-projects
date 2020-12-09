package pattern;

public class Pattern {
    void Pattern(int Row,int Col)
    {
    	/*for(int i=1;i<=Row;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(j+"\t");
    		}
    		System.out.println();
    	}*/
    	
    	/*for(int i=1;i<=Row;i++)
    	{
    		for(int j=i;j>=1;j--)
    		{
    			System.out.print(j+"\t");
    		}
    		System.out.println();
    	}*/
    	
    	/*for(int i=1;i<=Row;i++)
    	{
    		
    		for(int j=i;j>=1;j--)
    		{
    			if(j%2==0)
    			{
    				System.out.print("0\t");
    			}
    			else
    			{
    				System.out.print("1\t");
    			}
    			
    		}
    		System.out.println();
    	}*/
    	
    	/*for(int i=1;i<=Row;i++)
    	{
    		
    		for(int j=1;j<=i;j++)
    		{
    			if(j%2==0)
    			{
    				System.out.print("0\t");
    			}
    			else
    			{
    				System.out.print("1\t");
    			}
    			
    		}
    		System.out.println();
    	}*/
    	int k=0;
    	for(int i=1;i<=Row;i++)
    	{
    		
    		int m=i;
    		int n=1;
    		for(int j=1;j<=(k+i);j++)
    		{
    			
    			if(j<=i)
    			{
    				System.out.print(m+"\t");
    				m--;
    			}
    			else
    			{
    				n++;
    				System.out.print(n+"\t");
    				 
    			}
    			
    		}
    		k++;
    		System.out.println();
    	}
    }
	
}

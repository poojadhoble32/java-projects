package pattern;

public class Pattern2 {
	int row=0,dist=0,star=0;
	
	void pattern(int input)
	{
		for(row=input;row>=1;row--)
		{
			for(dist=1;dist<=(input-row);dist++)
			{
				System.out.print(" ");
			}
			
			for(star=1;star<(row*2);star++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}

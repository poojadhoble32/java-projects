package pattern;

public class Pattern3 {
	int row=0,dist=0,star=0,cnt=0;
	
	void pattern(int input)
	{
		for(row=1;row<=input;row++)
		{
			for(dist=1;dist<=(input-row);dist++)
			{
				System.out.print(" ");
			}
			
			for(star=1,cnt=row;star<(row*2);star++)
			{
				
				if(star<=row)
				{
					System.out.print(star);
				}
				else
				{
					cnt--;
					System.out.print(cnt);
					
				}
			}
			
			System.out.println();
		}
	}
}

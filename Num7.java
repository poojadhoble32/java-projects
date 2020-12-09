package numwith7;

public class Num7 {
	
	void Num(int Start,int End)
	{
		for(int i=Start;i<=End;i++)
		{
			int iDigit=i%10;
			if(iDigit==7)
			{
				System.out.println(i);
			}
		}
	}

}

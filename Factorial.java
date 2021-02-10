package Facrors;

public class Factorial {
	int Fact=1;
	
	int factorial(int no)
	{
		for(int i=1;i<=no;i++)
		{
			Fact*=i;
		}
		return Fact;
	}

}

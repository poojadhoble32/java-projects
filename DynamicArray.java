package dynamicarray;

public class DynamicArray {
	
	int DArray(int iArray[])
	{
		int sum=0;
		
		for(int i=0;i<iArray.length;i++)
		{
			sum=sum+iArray[i];
		}
		
		return sum;
	}

}

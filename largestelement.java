package largestelementarray;

public class largestelement {
	int secondlargestno(int arr1[])
	{
		int i=0,first=0,temp=0;
		
		first=arr1[i];
		temp=arr1[i+1];
		
		for(i=0;i<arr1.length;i++)
		{
			if((i+1)>=arr1.length)
			{
				break;
			}
			
			if(arr1[i+1]>first)
			{
				temp=first;
				
				first=arr1[i+1];
			}
			
			if(temp>=first)
			{
				temp=arr1[i+1];
			}
		}
		System.out.println("first:"+first);
		return temp;
	}

}

package diff;

public class diffclass {
	int diffun(int arr1[])
	{
		int i=0,large=0,small=0,diff=0;
		
		large=arr1[i];
		small=arr1[i];
		
		for(i=0;i<arr1.length;i++)
		{
			if(arr1[i]>large)
			{
				large=arr1[i];
			}
			
			if(arr1[i]<small)
			{
				small=arr1[i];
			}
		}
		
		return  diff=(large-small);
	}

}

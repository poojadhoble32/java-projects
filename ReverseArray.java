package reversearray;

public class ReverseArray {
	void reversea(int arr1[],int size)
	{
		int temp=0,start=0,end=arr1.length-1;
		
		for(start=0;start<=end;start++,end--)
		{
			temp=arr1[start];
			arr1[start]=arr1[end];
			arr1[end]=temp;
		}
	}

}

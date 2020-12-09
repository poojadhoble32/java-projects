package matrixlarge;

public class matrixclass {
       int matfun(int Arr[][],int Row,int Col)
       {
    	   int L=Arr[0][0];
    	   
    	   for(int i=0;i<Arr.length;i++)
    	   {
    		   for(int j=0;j<Arr.length;j++)
    		   {
    			   if(Arr[i][j]>L)
    			   {
    				   L=Arr[i][j];
    			   }
    		   }
    	   }
    	   return L;
       }
}

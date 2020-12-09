package avgGrade;

public class AvgClass {
	float FindAvg(int Marks[])
	{
		int i=0,Total=0;
		float Avg=0.0f;
		
		while(i<Marks.length)
		{
			Total=Total+Marks[i];
			i++;
		}
		
		Avg=Total/5;
		
		return Avg;
		
	}

}

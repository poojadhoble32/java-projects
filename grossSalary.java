package gross_salary;

public class grossSalary {
            int HRA=0,DA=0;
            
            float GrossSalary(int Salary)
            {
            	if(Salary<=10000)
            	{
            		DA=(80*Salary)/100;
            		HRA=(20*Salary)/100;
            		
            		return (Salary+DA+HRA);
            	}
            	else if(Salary<=20000)
            	{
            		DA=(90*Salary)/100;
            		HRA=(25*Salary)/100;
            		
            		return (Salary+DA+HRA);
            	}
            	else
            	{
            		DA=(95*Salary)/100;
            		HRA=(30*Salary)/100;
            		
            		return (Salary+DA+HRA);
            	}
            }
}

package gross_salary;
import java.util.Scanner;

public class grosssalarymain {
	public static void main(String[] args)
	{
		int Salary=0;
		float iRet=0.0f;
		
		grossSalary gs=new grossSalary();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter basic salary =");
		Salary=sc.nextInt();
		
		iRet=gs.GrossSalary(Salary);
		
		System.out.println("gross salary is:"+iRet);
	}
	

}

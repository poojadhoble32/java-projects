package arrayobj;

public class arrayobjclass {
	
	int rollno=0,marks=0;
	String name="\0";
	
	public arrayobjclass(int rollno,String name,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	void display()
	{
			System.out.println(rollno+"  "+name+"  "+marks);
	}

}

package overiding;

public class child extends parent {
	//{super();}
	child()
	{
		
		System.out.println("child constructor");
	}
	//{super.run();}
	
	void run()
	{
		
		System.out.println("child run");
	}
}

package overloading;

public class overload {
      void test()
      {
    	  System.out.println("nothing contains\n");
      }
      
      void test(int a,int b)
      {
    	  System.out.println(a+b);
      }
      
      void test(int a)
      {
    	  System.out.println(a);
      }
      
      void test(int a,int b,int c)
      {
    	  System.out.println(a+b+c);
      }
}

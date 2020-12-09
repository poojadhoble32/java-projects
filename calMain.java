package calculator;

public class calMain {
      public static void main(String[] args)
      {
    	  int add=0,sub=0,mult=0;
    	  double div=0.0d;
    	  
    	  cal cc=new cal(50,100);
    	 
    	  add=cc.Add();
    	  sub=cc.Sub();
    	  mult=cc.Mult();
    	  div=cc.Div();
    	  System.out.println("addition is:"+add+"\nsubtraction is:"+sub+"\n mult is:"+mult+"\ndiv is:"+div);
      }
}

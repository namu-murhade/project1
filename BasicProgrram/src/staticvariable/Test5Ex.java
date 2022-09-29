package staticvariable;

public class Test5Ex {
	 int a=5;
	int b=10;

	
	   static void Method(double x , double y){
		   int result = 0;
		   Test5Ex m1 = new Test5Ex();
		   System.out.println("print value a " +m1.a);
		   System.out.println("print value a " +m1.b);
		   System.out.println("print value result " + (m1.a+m1.b));
		   System.out.println("print value result " + (m1.a-m1.b));
		   System.out.println("print value result " + (m1.a*m1.b));
		   System.out.println("print value result " + (m1.a/m1.b));
		   System.out.println("print value result " + (x+y));
		   System.out.println("print value result " + (y/x));
		   
				   
		   
		   
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method(2.3 , 5);

	}

}

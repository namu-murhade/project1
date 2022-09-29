package example;

public class Test{
		// TODO Auto-generated method stub
		static int age=25;
		double salary=15000.57;
		
		/* static block or SIB*/
		static {		
			age=30;		
		}
		/* non-static block or IIB*/
		{
			salary=45000.32;
			age=34;
		}
		
		public static void main(String[] args) {
			System.out.println("main() Starts..");
			System.out.println("age: "+Test.age);
			System.out.println("---------------------------------");
			Test b1=new Test();
			System.out.println("salary: "+b1.salary);
			System.out.println("age: "+Test.age);
			System.out.println("main() ends..");
		}
	}

	



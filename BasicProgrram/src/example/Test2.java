package example;

public class Test2 {
	    static int emp_id=23;
	    final static int salary=343540;
	    int a=45;
	    final double amount;
	    
	    {
	    	 amount=35000;
	    	 square();
	    }
	    static {
	    	Add(23,43);
	    }
	    
	Test2(){
		this(6);
		
		System.out.println("start program");
	}
	
	Test2(int age){
		
		System.out.println("Print Emp_id: "+emp_id);
		System.out.println("Print Emp_id: "+salary);
		System.out.println("Print Emp_id: "+age);
		
	}
	public  void square() {
	
		this.a=a;
		int res=a*a;
		System.out.println("value a "+a);
		System.out.println("square: "+res);
		
	}
	public static void square(int a) {
	
		int res=a*a;
		System.out.println("square: "+res);
		
	}
	public static void Add(int c, int b) {
		int add= c+b;
		System.out.println("addtition: "+add);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() method");
		Test2 t3= new Test2();
		t3.square(8);
		
		System.out.println("amount "+t3.amount);

	}

}

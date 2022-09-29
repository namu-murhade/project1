package assesment;

 
	 class Company {
		 int age=25;
		double salary=345000.45;
	    public void Display() {
	    	
			System.out.println("Print display method");//method with method overloading use of this keyword
		}
		public void Display(int a) {
			this.Display();
			System.out.println("print value a "+a);
		}
		Company(){
			
			
			System.out.println("Print Compamy Construtructor");
		}
		Company(int emp_salary){
		
			
			System.out.println("print Employ salary"+emp_salary);
		}
			
		}

	
		
	
	
	class Employee extends Company {
		double salary;
		//global variable name as Company name variable
			void employA(){
			this.employA(90);
		    System.out.println("This is employA method");
		    System.out.println("Salary "+salary);
		    
				//method with method overloading use of this & super keyword
			}
			void employA(int Eid) {
				super.Display(34);
		        System.out.println("Print Eid "+Eid);
			}
			Employee(){
				this('Z');
				System.out.println("Employee constructor");
			}
			
			Employee(char name){
				super(32);
				System.out.println("print Employee name "+name);
			}}
			//constructor with overloading and use of this() & super()
	
	 public class TestEx{

		public static void main(String[] args) {
			Employee E1 = new Employee();
			E1.employA();
			
			Company P1=E1;
		
			
			
			
			//access all the above class members
		}	
}

package method;



public class Pratices {
	int age=20;
	Pratices(){
		this(5);
		System.out.println("Introduction:");
		
		
	}
	
	Pratices(char ch) {
		this(21,1234);
		System.out.println("My name is: "+ch);
		
	}
	Pratices(int a){
		this('n');
		System.out.println("Roll No: "+a);
		
		
	}
	Pratices(int age,double mo){
		System.out.println("My age is: "+this. age);
		System.out.println("My age is: "+age);
		this.age=age;
		System.out.println("My age is: "+age);
		System.out.println("My mobile is: "+mo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pratices p1= new Pratices();
		/*Pratices p2= new Pratices('N');
		Pratices p3= new Pratices(22,95030);
		Pratices p4= new Pratices(34);*/

	}

}

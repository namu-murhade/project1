package constructor;

public class Sample {
	int age=25;
//	Cons0(){
//		//empty body ---> default constructor --> written by java compiler
//	}
	void display() {
		System.out.println("Hi, I am display method");
	}
	public static void main(String[] args) {
		
		Sample c1=new Sample();//calling default constructor of the current class written by java compiler
		System.out.println(c1.age);
		c1.display();
	}
}



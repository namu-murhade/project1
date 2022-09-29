package AccessModifier;

public class Sample {
	void display() {
		System.out.println("Display of Simple");
	}
	public static void main(String args[]) {
		System.out.println("Welcome to package");
		Sample a1=new Sample();
		System.out.println(a1);//string representation of on object 
	}

}

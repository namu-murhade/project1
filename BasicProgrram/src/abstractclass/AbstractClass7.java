package abstractclass;

abstract class Abs {
	// global variable
	// constructor
	// normal or non-abstract or concrete method
	// abstract method
}

abstract class Abs1 { 
	// abstract method ------>
	abstract void call1();
	abstract void call2();
	// non-abstract method
	void display() {
		System.out.println("Hello");
	}
}
abstract class Abs2 {
	// abstract method  ---->100%
	abstract void call1();
	abstract void call2();
}
abstract class Abs3 {
	// non-abstract method ----->0%
	void display() {
	}
}
public class AbstractClass7 extends Abs2 {//
	void call1() {
		System.out.println("Hello");
	}
	void call2() {
		System.out.println("he");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass7 d1=new AbstractClass7();

	}
}


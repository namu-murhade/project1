package overriding;

//Base Class or parent class or Super class
class Parent1 {
	void show() {
		System.out.println("Parent's show()");
	}
}
//Inherited class or child class or sub class
class Child1 extends Parent1 {
	// This method overrides show() of Parent
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}
//Driver class
class Overriding5 {
	public static void main(String[] args) {
		// If a Parent type reference refers to a Parent object, then Parent's show is called
		Parent1 obj1 = new Parent1();
		obj1.show();//Parent's show()
		// If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent1 obj2 = new Child1();
		obj2.show();//Child's show()
	}
}

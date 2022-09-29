package thisstatement;

class Student{
	int rollno;
	float fee;
	Student(int rollno) {
		this.rollno = rollno;
		}
	Student(int rollno, float fee) {
		this(rollno);// reusing constructor
		this.fee = fee;
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}
}
class ThisStatement7{
	public static void main(String args[]) {
		System.out.println("**********************Creating S1 object***************************");
		Student s1 = new Student(111);// rollno--->111 fee--->0.0
		System.out.println(s1.rollno +" "+s1.fee);
		System.out.println("**********************Creating S2 object***************************");
		Student s2 = new Student(112, 6000f);// rollno--->112 fee--->6000.0
		System.out.println(s2.rollno +" "+s2.fee);
		System.out.println("*****************Display()*************************");
		s1.display();//111 0.0
		s2.display();//112 6000
	}
}
/**
* One constructor calls another constructor of the class called Constructor Chaining
*/

package finalkeyword;

public class FinalKeyword2 {
	final int empId=90;
	double salary=34400.67;
	void run() {
		System.out.println("empId: "+empId);
	}
	public static void main(String args[]) {
		FinalKeyword2 obj = new FinalKeyword2();
		obj.run();
		System.out.println(obj.salary);
	}

}

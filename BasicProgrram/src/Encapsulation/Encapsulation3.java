package Encapsulation;

public class Encapsulation3 {
	private int ssn;
	private int empAge;
	// Getter and Setter methods
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
}
class Encap2 {
	public static void main(String args[]) {
		Encapsulation3 obj = new Encapsulation3();
		System.out.println("Employee SSN: " + obj.getSsn());
		System.out.println("Employee Age: " + obj.getEmpAge());
		System.out.println("**************************************");
		obj.setEmpAge(32);
		obj.setSsn(112233);
		System.out.println("Employee SSN: " + obj.getSsn());
		System.out.println("Employee Age: " + obj.getEmpAge());
	}
}



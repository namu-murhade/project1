package AccessModifier;

public class ProtectMember {
	
	protected int accNum=12345;
	protected void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		ProtectMember p1=new ProtectMember();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessProtectedMembers {

	public static void main(String[] args) {
		
		ProtectMember p1=new ProtectMember();
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
 * protected members are accessible with in package 
 * but can be access these member from outside the page using inheritance
 */



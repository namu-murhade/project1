package AccessModifier;


public class AccessModifier2 {
public static void main(String[] args) {
		
	DefaultMembers p1=new DefaultMembers   ();
		System.out.println("Accessing default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}



package method;

public class Pratices2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex();

	}
	public static void Ex() {
		int n=343,n1,rem,sum=0;
		n1=n;
		while(n1<0) {
			rem=n1%10;
			sum=sum*10+rem;
			n1=n1/10;
		}
		if(n1==sum) {
			System.out.println("no is palliondrome"+n1);
		}
		else {
			System.out.println("no is palliondrome"+n1);
		}
	}

}

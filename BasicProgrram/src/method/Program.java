package method;

public class Program {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Reverse();

	}
	public static void Reverse() {
		int num=123,rev=0;
		while(num!=0) {
			int rem;
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
			System.out.println(""+rev);
			
			
		}
	}



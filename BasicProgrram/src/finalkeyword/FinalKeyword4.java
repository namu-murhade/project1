package finalkeyword;

public class FinalKeyword4 {
	int cube(final int n){ //final int n=5;
		System.out.println(n);//5
		  // n=n+2;  
		   return n*n*n;  
		  }

	public static void main(String args[]) {
		FinalKeyword4 b = new FinalKeyword4();
		System.out.println(b.cube(5));
	}
}

package staticvariable;

public class Nonstatic {
	static int sum = 34;
	static float min = 45.6f;
	char grade='c';
	boolean ave= false;
	

	public static void main(String[] args) {
		Nonstatic ref = new Nonstatic();
		System.out.println("Print Sum  " +sum);
		System.out.println("Print min  " +min);
		System.out.println("Print grade  " +ref.grade);
		System.out.println("Print ave " +ref.ave);
		
		Nonstatic ref1 = new Nonstatic();
		
		System.out.println("Print Sum  " +sum);
		System.out.println("Print min  " +min);
		System.out.println("Print grade  " +ref1.grade);
		System.out.println("Print ave " +ref1.ave);
		// TODO Auto-generated method stub

	}

}

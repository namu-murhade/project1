package block;

public class Block3 {
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-1 of class Blocks2..");		
	}
	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		System.out.println("I am main() of Blocks2 class...");
		System.out.println("main() ends");
	}
	
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-2 of class Blocks2..");		
	}

}
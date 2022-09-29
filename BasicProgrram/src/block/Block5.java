package block;

public class Block5 {
	Block5(){
		System.out.println("zero-param cons..");
	}
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-1 of class Blocks2..");		
	}
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		Block5 b1=new Block5();
		System.out.println("---------------------------------");
		Block5 b2=new Block5();
		System.out.println("main() ends");
	}
}



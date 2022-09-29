// Multiply two floating point Number


package assesment;

public class Float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float f1= new Float();
		f1.Mul(3.5f,2.0f);

	}
	
		// TODO Auto-generated method stub
		
	
	boolean Mul(float x, float y)
	{
		float res;
		res= x*y;
		System.out.println("Value of x "+x);
		System.out.println("Value of y "+y);
		System.out.println("Value of Multiplication "+res);
		return true;
	}

}

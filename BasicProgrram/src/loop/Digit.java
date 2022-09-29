package loop;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digit d = new Digit();
		d.Test2();
	}
	public static void Test2()
	{
		int count = 0 , num=12345;
		for(; (num != 0); num /= 10, ++count)
		{
			System.out.println("count " +count);
			
		}
	}

}

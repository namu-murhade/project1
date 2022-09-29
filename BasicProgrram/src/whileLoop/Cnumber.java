package whileLoop;

public class Cnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dnumber();

	}
           public static void Dnumber()
           {
        	   int count=0,num=12345;
        	   while (num != 0) {
        		      // num = num/10
        		      num /= 10;
        		      ++count;
        	   }
        	   System.out.println(""+count);
           }
}

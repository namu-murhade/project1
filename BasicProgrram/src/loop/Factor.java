package loop;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Fnumber();
	}
	public static void Fnumber() {
		int num=-10;
		  System.out.println( "Factors of " + num + " are " );
		
		  for(int i=1;i>=num;++i) {
			
			       if(num%i==0) {
				System.out.println("Print number " +i);
			}
		}
	}

}

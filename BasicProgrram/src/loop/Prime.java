package loop;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Pnumber();
	}
	public static void Pnumber(){
		int num=29;
		for (int i = 2; i <= num / 2; ++i) {
			if(!(num%i==0)) {
				System.out.println("prime number" +num);
				break;
			}
			else {
				System.out.println("prime is not number");
				
			}
			
		}
		
	}

}

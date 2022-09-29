package whileLoop;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Ex2(35);
	}
	public static void Ex2(int num){
		
		int i=2;
		boolean flag= false;
		while(i <= num / 2) {
			if(num % i == 0)
			{
				flag=true;
				break;
			}
			i++;
			if(flag) {
				System.out.println("prime number" +num);
				break;
				
			}
			else if(!flag) {
				System.out.println("prime is not number");
				break;
				
		}
	}

}}

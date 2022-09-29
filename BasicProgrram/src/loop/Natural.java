package loop;

public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Sum();
	}
	public static void Sum() {
		int i,n=10,sum=0;
		for(i=1 ;i<=n; ++i) {
			sum=sum+i;
			
			System.out.println("sum "+i+" = "+sum);
		}
			
	}

}

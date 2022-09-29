package whileLoop;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Ex3();
	}
	public static void Ex3(){
		int n=153,n1,rem,res=0;
		n1=n;
		while(n1!=0) {
			rem = n1 % 10;
			
            res=res+(rem*rem*rem);
			n1/=10;
		}
		if(res==n) {
			System.out.println("ArmStrong Number"+n);
		}
		else {
			System.out.println("Not ArmStrong Number"+n);
		}
		
		}
	}



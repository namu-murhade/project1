package assesment;

public class Fabonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=1;
		int a = 0,n = 10;
		int nextstep=a+b;
		System.out.print(+ a +  " " +" " + b);
		for(int i=1; i<=n;++i) {
	
			a=b;
			b=nextstep;
			nextstep=a+b;
			System.out.print("  "  +nextstep);
		}
		/* int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;*/    
		 } 
		

	}



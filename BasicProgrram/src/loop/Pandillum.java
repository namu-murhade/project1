package loop;

public class Pandillum {
	public static void main(String[] args) {
		Seen();
	}
       public static void Seen() {
    	   int num=131, t,s,rem;
    	   t=num;
    	   for(s=0; num>0; num/=10) {
    		   rem=num%10;
    		   s=(s*10)+rem;
    	   }
    	   if(s==t) {
    		   System.out.println("Number is palindrome "+s);
    	   }
    	   else {
    		   System.out.println("Number is not  palindrome ");
    	   }
       }
       
}

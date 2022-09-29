//WAP Using if-else to check no is even or odd

package ifelse;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		OddNumber o1 = new OddNumber();
		o1.Even(59);

	}
	  public int Even(int i) {
		  

	           if(i%2==0) {
				System.out.println("even number is: "+i);
			     return i;
			}
			 else
             {
            	 System.out.println("Odd Number" +i);
            	 return i;
            	
             }
			
		
		}
	  }



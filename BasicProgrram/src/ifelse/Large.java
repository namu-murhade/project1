//WAP to find large no amoung Three

package ifelse;

public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three(935,605,87);

	}
	
	public static void Three(double i,int j,int k) {
	 
		 if(i>=j && i>=k) {
			System.out.println("Largest No is i "+i);
		}
	else if(j>=i && j>=k) {
			System.out.println("Largest No is j "+j);
		}
		else {
			System.out.println("Largest No is k "+k);
		}
	}

}

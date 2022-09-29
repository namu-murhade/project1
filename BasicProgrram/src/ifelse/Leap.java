package ifelse;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leap L1 = new Leap();
		L1.Year(2020);

	}
	public void Year(int y) {
		if((y%4==0) && ((y%100)!=0) || (y%400==0)){
			
			System.out.println("Leap Year");
		}
		
		else {
			System.out.println("Not Leap Year");
		}
	}

}

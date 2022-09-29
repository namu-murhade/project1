package finalkeyword;

public class finalKeyword3 {

	final int speedlimit;// blank final variable
	finalKeyword3() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		finalKeyword3 f1=new finalKeyword3();
		System.out.println(f1.speedlimit); 
	}
}
/**
Any variable which is declared as final should be initialize at the same time.
but for Non static global final variable can declared and initialize inside the constructor body
*/

package Encapsulation;

public class Encapsulation4 {
	public static void main(String[] args) {
		// creating instance of Account class
		encapsulation1 acc = new encapsulation1();
		// getting values through getter methods
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getAmount());
		// setting values through setter methods
		acc.setAcc_no(7560504000L);
		acc.setAmount(500000f);
		// getting values through getter methods
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getAmount());
	}

}

package thisstatement;

class C2 {
	C2() {
		this(5);
		System.out.println("hello a");
	}
	C2(int x) {
		System.out.println(x);
	}
}

class ThisStatement16{
	public static void main(String args[]) {
		C2 a = new C2(10);
	}
}


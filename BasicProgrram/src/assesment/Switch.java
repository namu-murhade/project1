package assesment;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Ex4();
	}
	public static void Ex4() {
		int num1=10,num2=5,res;
		int operator='*';
		switch(operator){
		
		case '+':
		res=num1+num2;
		System.out.println(num1+ " + " +num2+ " = " +res);
		break;
		
		case '-':
			res=num1-num2;
			System.out.println(num1+ " - " +num2+ " = " +res);
			break;
			
			
		case '*':
			res=num1*num2;
			System.out.println(num1+ " * " +num2+ " = " +res);
			break;
			
			
		case '/':
			res=num1/num2;
			System.out.println(num1+ " / " +num2+ " = " +res);
			break;
			
		case '%':
			res=num1%num2;
			System.out.println(num1+ " % " +num2+ " = " +res);
			break;
			
		
		
		}
	}

}

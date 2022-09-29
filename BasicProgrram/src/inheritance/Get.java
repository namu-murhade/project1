package inheritance;
	//class Ex{
class Student{
	  
	   /**Student(){
	    int num1=1,num2=0,next=num1+num2,n=10;
	 System.out.print(num1+" "+num2);
	      
	 for(int i=1; i<=n;i++)
	       
	     {
	       num1=num2;
	       num2=next;
	       next=num1+num2;
	       System.out.println("  "+ next);
	 }}
	 public static void main(String[] args){
	Student s1 =new Student();
	}}**/
	/** Student(){
	       int num=21,n=50;
	for(int i=2; i<=n; i++)
	{
	  if(num%i==1){
	    System.out.println("Prime no "+ num);
	    break;
	}
	else{
	     System.out.println("Prime no not "+ num);
	     break;
	}
	  
	 }}
	 public static void main(String[] args){
	Student s1 =new Student();
	}}
	
	
	
	
	Student(){
        int a=0,b=1,c=a+b,n=10;
   System.out.print(a+""+b);
   for(int i=0; i<=n; i++)
  {
    a=b;
    c=b;
   c= a+b;
     System.out.print(""+c);
   }}
public static void main(String[] args){
Student s1 = new Student();
}}
	
	
	      Student(){
	         int a=0,b=1,c=a+b,n=10;
	    System.out.print(a+""+b);
	    for(int i=0; i<=n; i++)
	   {
	     a=b;
	     b=c;
	    c= a+b;
	    System.out.print(" "+c);
	}}
	public static void main(String[] args){
	 Student s1 = new Student();
	}}**/
	
	

	public static void main(String[] args) {

		for(int i=0;i<5;i++) {			
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++");
		for(int i=0;i<5;i++) {			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++");
		for(char i='a';i<'e';i++) {			
			for(char j='a';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++");
		for(int i=0;i<10;i++) {
			if(i%2==0)
			for(int j=0;j<=i;j++) {
				System.out.print(+i+" ");
			}
			System.out.println("");
		}
		System.out.println("+++++++++++++++++++++++++++++");
		for(int i=0;i<10;i++) {
			if(i%2==1)
			for(int j=0;j<=i;j++) {
				System.out.print(+i+" ");
			}
			System.out.println("");
		}
	/**	System.out.println("+++++++++++++++++++++++++++++");
		int count=0;
		for(int i=2;i<100;i++) {
			
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				if(count==2)
			   
					
				System.out.print(+i+" ");
			}
			count=0;
			System.out.println("");
		}**/
		
		
		
		
		
	}
}
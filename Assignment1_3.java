public class Assignment1_3 {
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		System.out.println("Before swaping the initial value of a is = "+a);
		System.out.println("Before swaping the initial value of b is = "+b);
	
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swaping the value of a is = "+a);
		System.out.println("After swaping the value of b is = "+b);	
	}
}

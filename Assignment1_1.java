import java.util.Scanner;

public class Example {
	public static void main(String args[])
	{
		System.out.print("Enter the value of a = ");
		Scanner Sc =  new Scanner(System.in);
		int a = Sc.nextInt();
		System.out.println("Enter the value of b = ");
		int b = Sc.nextInt();
	
		
		int x = (a - (-b));
		System.out.println("the sum of two numbers is =  "+x);
	}

}

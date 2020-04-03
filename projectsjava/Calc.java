package projectsjava;


import java.util.Scanner;

public class Calc {
	
		public static float add(float a,float b)
		{
			return a+b;
		}
		public static float sub(float a,float b)
		{
			return a-b;
		}
		public static float mul(float a,float b)
		{
			return a*b;
		}
		public static float div(float a,float b)
		{
			return (float)(a/b);
		}
		public static void instruction() {
			System.out.println(" If you want do sqrt put number in 'a', and 'b' set 0"
					+ "\n If you want to raise the number to the power of put number in 'a' and the the power of to 'b'"
					+ "\n If you want to do other operation 'a' is the first number and the 'b' is second");
		}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		instruction();
		System.out.println("Put a ");
		float a = sc.nextFloat();
		System.out.println("Put b ");
		float b = sc.nextFloat();
		System.out.println("What you want to do \n (+, -, *, /, sqrt, pow)");
		String option = sc.next();
		
		switch(option)
		{
			case "+":
				System.out.println(a+option+b+"="+ add(a, b));
				break;
			case "-":
				System.out.println(a+option+b+"="+ sub(a, b));
				break;
			case "*":
				System.out.println(a+option+b+"="+ mul(a, b));
				break;
			case "/":
					if(b!=0) {
						System.out.println(a+option+b+"="+ div(a, b));
					}
					else {
						System.out.println("Option b can't be 0");
					}
				break;
			case "sqrt":
				System.out.println(Math.sqrt((double)a));
				break;
			case "pow":
				System.out.println(Math.pow(a, b));
				break;
			default:
				System.out.println("Bad option");
			
				
		}
		

	}
	

}

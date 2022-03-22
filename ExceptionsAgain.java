import java.util.Scanner;
public class ExceptionsAgain {
	public static void main (String [] args) {
	System.out.println("Enter 1 for Arithmetic exception and anything else for Null pointer exception");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();

	try {
		if(choice == 1) {
				int a=0;
				int b=20;
				int c=10;
				System.out.println("20/10="+" "+b/c);
				System.out.println("20/0="+" "+b/a);
		}
		else {
				String s2=null;
				System.out.println(s2.length());
		}
	}

	catch (ArithmeticException e) {
		System.out.println("Exception occurred called -> "+e);
		System.exit(0);
	}

	catch(NullPointerException e) {System.out.println("Exception occurred called -> "+e);}
	
	finally {
		System.out.println("Try again Later");
	}

	}
}
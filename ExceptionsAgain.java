import java.util.Scanner;
public class ExceptionsAgain {
	public static void main (String [] args) {
	System.out.println("Enter 1 for Arithmetic exception 2 for Null pointer exception and 3 for NumberFormatExceptions");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	boolean flag=true;
	try {
		if(choice == 1) {
				int a=0;
				int b=20;
				int c=10;
				System.out.println("20/10="+" "+b/c);
				System.out.println("20/0="+" "+b/a);
		}
		else if (choice == 2) {
				String s2=null;
				System.out.println(s2.length());
		}
		else if(choice == 3) {
				String s="vedansh";
				int n = Integer.parseInt(s);
		}

		else 
			System.out.println("Wrong Input");
	}

	catch (ArithmeticException e) {
		System.out.println("Exception occurred called -> "+e);
		System.exit(0);
	}

	catch(NullPointerException e) {System.out.println("Exception occurred called -> "+e);}

	catch(NumberFormatException e) {
		System.out.println("Exception occurred called -> "+e);
		flag=false;
		}
	
	finally {
		if(flag)
		System.out.println("Try again Later");
	}

	System.out.println("ThankYou !!");

	}
}
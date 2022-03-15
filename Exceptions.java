public class Exceptions {
	public static void main (String [] args) {
	int a=0;
	int b=20;
	int c=10;
	try {
		System.out.println("20/10="+" "+b/c);
		System.out.println("20/0="+" "+b/a);
		
		
	}

catch (ArithmeticException e) {System.out.println("Exception occurred called -> "+e);}

try {
		String s1="xyz";
		int x=Integer.parseInt(s1);
		
	}

catch(NumberFormatException e) {System.out.println("Exception occurred called -> "+e);}

try {
		String s2=null;
		System.out.println(s2.length());
		
	}

catch(NullPointerException e) {System.out.println("Exception occurred called -> "+e);}
	}
}
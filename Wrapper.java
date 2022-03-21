import java.util.Scanner;
public class Wrapper {
	public static void main (String [] args){
	int a = Integer.MAX_VALUE;
	short s = Short.MAX_VALUE;
	boolean b = true;
	String sInt = "12";
	String sLong = "12354354135";
	String sFloat = "12.7";
	String sBoolean = "false";
	Float ff = new Float(3.14);

	System.out.println(a+" in Integer type is still "+ Integer.valueOf(a));
	System.out.println(s+" in Short type is still "+ Short.valueOf(s));
	System.out.println(ff+" in primitive type float is "+ff.toString());
	System.out.println("String to long is "+ Long.parseLong(sLong));
	System.out.println("String to boolean is "+ Boolean.parseBoolean(sBoolean));

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a binary number");
	String num = sc.next();
	System.out.println(num + "in decimal is "+ Integer.parseInt(num, 2));
	}
}
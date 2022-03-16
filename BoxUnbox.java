/*
	Auto boxing and unboxing ->
	Boxing : It is the automatic conversion of a primitive data type into its Wrapper Class object.
	ex - char to Character, int to Integer, float to Float, etc.
	
	Unboxing : It is the automatic conversion from an objectt of the wrapper class to its correspomdimg primitive data type.

*/
import java.util.*;
public class BoxUnbox {
	public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an int value");
	int i = sc.nextInt();
	System.out.println("Enter a char value");
	char c = sc.next().charAt(0);
	System.out.println("Enter a float value");
	float f = sc.nextFloat();

	System.out.println("Now autoboxing -----------");
	Integer x=i;
	System.out.println("Autoboxed int value is "+ x);
	
	Character ch = c;
	System.out.println("Autoboxed char value is "+ ch);

	Float fl = f;
	System.out.println("Autoboxed float value is "+ f);
	}
}
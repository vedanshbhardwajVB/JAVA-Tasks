import java.util.Scanner;
class Mouse {
boolean isWireless;
String color;

	Mouse(boolean b, String s){
		isWireless=b;
		color=s;
	}
		
	public String toString(){
		return (isWireless+"  "+color); 
	}
}

public class ShallowDeep {
	public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
		System.out.println("is your mouse wireless ? 0 for no, 1 for yes");
		int n=sc.nextInt();
		boolean wire = n==1 ? true: false;
		System.out.println("What is the color of your mouse ?");
		String color = sc.next();
		
		Mouse m1 = new Mouse(wire, color);
		Mouse m2 = m1;//shallow copy
		Mouse m3 = new Mouse (m1.isWireless, m1.color);//deep copy
	
		System.out.println("The details are ------>");
		System.out.println("Mouse 1 "+m1);
		System.out.println("Mouse 2 "+m2);
		System.out.println("Mouse 3 "+m3);

		System.out.println("Change the color of your mouse, enter a new color  ->");
		m1.color = sc.next();

		System.out.println("After change the details are -------->");
		System.out.println("Mouse 1 "+m1);
		System.out.println("Mouse 2 "+m2);
		System.out.println("Mouse 3 "+m3);
		
	}
}
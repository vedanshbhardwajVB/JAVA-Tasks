import java.util.Scanner;

public class MultiLevelDemo {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile's ram space 5Gcompatibility and AndroidVersion space separated");
		Narzo twentyA = new Narzo(sc.nextInt(),sc.nextInt(), sc.nextBoolean(),sc.nextInt());
		System.out.println("The price is "+twentyA.calculatePrice());
	}
}

class Mobile {
int ram;
int space;
boolean isFiveG;

Mobile (int ram, int space, boolean b){
	this.ram=ram;
	this.space = space;
	this.isFiveG=b;
	System.out.println("Inside MOBILE class");
}
}

class Realme extends Mobile {
int androidVersion;

Realme (int ram, int space, boolean b, int version){
	super(ram, space, b);
	this.androidVersion = version;
	System.out.println("Inside REALME class");
}
}

class Narzo extends Realme {

Narzo(int ram, int space, boolean b, int version){
super(ram, space,b, version);
}

	public int calculatePrice(){

		if(androidVersion >=9 && isFiveG)
			return 10000;
		return (ram*1000 + space*100);
	}
}
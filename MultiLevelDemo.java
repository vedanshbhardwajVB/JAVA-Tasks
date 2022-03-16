public class MultiLevelDemo {
	public static void main (String [] args) {
		Narzo twentyA = new Narzo(8,32, true,9);
		System.out.println(twentyA.calculatePrice());
	}
}

class Mobile {
int ram;
int space;
boolean isFiveG;

Mobile (int ram, int space, boolean b){
	ram=ram;
	space = space;
	isFiveG=b;
	System.out.println("Inside MOBILE class");
}
}

class Realme extends Mobile {
int androidVersion;

Realme (int ram, int space, boolean b, int version){
	super(ram, space, b);
	androidVersion = version;
	System.out.println("Inside REALME class");
}
}

class Narzo extends Realme {

Narzo(int ram, int space, boolean b, int version){
super(ram, space,b, version);
}

	public int calculatePrice(){
		//System.out.println("android version is "+androidVersion);
		if(androidVersion >=9 && isFiveG)
			return 10000;
		return (ram*1000 + space*100);
	}
}
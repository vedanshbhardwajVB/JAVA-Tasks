public class ConstructorDemo {
	public static void main(String [] args) {
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop(4, 25000);
		Laptop l3 = new Laptop(8, 50000, true);
		Laptop l4 = new Laptop(l2);
		
		System.out.println();
		System.out.println("making l4 a copy of l2");
		l1.printDetails();
		l2.printDetails();
		l3.printDetails();
		l4.printDetails();
	}
}

class Laptop {
	int ram;
	int price;
	boolean sdd;
	
	Laptop(){
		System.out.println("Inside the default constructor");
	}

	Laptop(int r, int p){
		System.out.println("Inside the first parametrised constructor");
		this.ram=r;
		this.price=p;
	}

	Laptop(int r, int p, boolean b){
		System.out.println("Inside the second parametrised constructor");
		this.ram=r;
		this.price=p;
		this.sdd=b;
	}

	Laptop(Laptop l){
		System.out.println("Inside the copy constructor");
		this.ram=l.ram;
		this.price=l.price;
	}

	public void printDetails(){
		System.out.println(this.ram+"----"+this.price+"----"+this.sdd);
	}
}
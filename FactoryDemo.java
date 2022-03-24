import java.util.Scanner;

public class FactoryDemo {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey, what did you buy ? ");
		String item = sc.next();
		System.out.println("How many units of "+item+" did you buy ? ");
		int units = sc.nextInt();
		
		Grocery gcr = GroceryFactory.getInstance(item);
		int price = gcr.calculatePrice(units);
		System.out.println("You need to pay "+price+" Rupees. THANKYOU !!");
	}
}

interface Grocery {
	
	int calculatePrice(int i);
}

class Rice implements Grocery {

	public int calculatePrice(int units){
		return units*80;
	}
}

class Bread implements Grocery {

	public int calculatePrice(int units){
		return units*15;
	}
}

class Sauce implements Grocery {

	public int calculatePrice(int units) {
		return units*65;
	}
}

class GroceryFactory {

	public static Grocery getInstance(String obj) {
		if(obj.equals("Rice")) {
		return new Rice();
		}

		else if(obj.equals("Bread")) {
		return new Bread();
		}

		else if(obj.equals("Sauce")) {
		return new Sauce();
		}

		else
			return null;
	}
}
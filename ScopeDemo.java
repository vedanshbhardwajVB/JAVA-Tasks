public class ScopeDemo {
	public static void main (String [] args) {

		int a=20;
		
		for(int i=0;i<5; i++) {
			System.out.println("Can access a value="+a+" and also the for loops i value ="+i+" here");
		}
		
		System.out.println("Can only access value of a="+a+" here");
		
		
	}
}

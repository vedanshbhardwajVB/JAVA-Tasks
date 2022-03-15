/*

Interface new features (JAVA 8)
In java 8, the concept of JAVA Functional Interface is introduced.
Functional Interface is an interface in java having only one Abstract Method.
This can be used as a Lambda Expression. 
And introduces FUNCTIONAL PROGRAMMING in java.
*/

interface Add {
	void adder(int a, int b);
}

public class InterfaceNew {
	public static void main (String [] args){
	
		Add ad=(a,b)->(System.out.println(a+b));  
        	ad.adder(10,20);  
	}
}
/**
Static Keyword - 
1- In variables - This is used to create variables which have the same copy for all objkects of a class.
			Value of a static variable remains common for all the instances of the class.

2- In functions - Static functions are those functions that deal with static variables only. These functions don't need an object to be created before calling, because they are directly attached to the class and not any instance of the class.

3- A class can be made static only if it is a nested class.
	Nested static class doesn’t need reference of Outer class
	A static class cannot access non-static members of the Outer class

 **/

public class StaticDemo {
	public static void main(String [] args){
	ABC a1 = new ABC();
	ABC a2 = new ABC();
	a1.b=-1;
	a2.b=-2;
	a1.a++;
	a2.a++;

	System.out.println("Non static var of 1st Object is -->"+a1.b);
	System.out.println("Non static var of 1st Object is -->"+a2.b);
	System.out.println("Static var of 1st Object is -->"+a1.a);
	System.out.println("Static var of 1st Object is -->"+a2.a);

	System.out.println("Static values are same even after individual operations done");
	System.out.println();
	System.out.println("Now accessing a static function without using any object as reference");
	ABC.staticF();
	}
}

class ABC {
public static int a=100;
int b;

public static void staticF(){
	System.out.println("Contrl is now inside the static function of class ABC");
}
}
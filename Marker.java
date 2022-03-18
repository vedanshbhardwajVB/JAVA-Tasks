/*
MARKER INTERFACE -> An empty interface that is implemented to provide some special features to an object of a class.
This program works fine only bcs the Student class is implementing the interface.
*/
import java.util.*;
class Student implements markerExample{
	private String name;
	
	public String getName(){
	return this.name;
	}

	public void setName(String name){
	this.name = name;
	}
}

interface markerExample {

}

public class Marker {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a student's full name ");
		String n = sc.nextLine();
		Student s = new Student();
		s.setName(n);
		if(s instanceof markerExample)
		System.out.println("The student name you entered is "+ s.getName());
		else
		System.out.println("You don't have permission to see the name ! Sorry !!");
	}
}

/* 
Examples of Marker Interface which are used in real-time applications --------------------------------------------------------------------->
 

Cloneable interface : Cloneable interface is present in java.lang package. 
There is a method clone() in Object class. A class that implements the Cloneable interface indicates that it is legal for clone() method to make a field-for-field copy of instances of that class. 
Invoking Object’s clone method on an instance of the class that does not implement the Cloneable interface results in an exception CloneNotSupportedException being thrown. 
By convention, classes that implement this interface should override Object.clone() method. 

Serializable interface : Serializable interface is present in java.io package. 
It is used to make an object eligible for saving its state into a file. This is called Serialization. 
Classes that do not implement this interface will not have any of their state serialized or deserialized. 
All subtypes of a serializable class are themselves serializable.

Remote interface is present in java.rmi package. A remote object is an object which is stored at one machine and accessed from another machine. 
So, to make an object a remote object, we need to flag it with Remote interface. Here, Remote interface serves to identify interfaces whose methods may be invoked from a non-local virtual machine.Any object that is a remote object must directly or indirectly implement this interface. 
RMI (Remote Method Invocation) provides some convenience classes that remote object implementations can extend which facilitate remote object creation
*/
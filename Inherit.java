class Animal {
protected String name;
int legs;
int tail;
public void walk(){
System.out.println(name + " is walking ");
}
}

class Dog extends Animal {
//this class has no "name" attribute and is using the name attribute of the Parent class Animal
public void walk(){
System.out.println(name+" is a dog and is walking");
	}
}

public class Inherit{
	public static void main(String [] args){
	//first trying the Animal class
	Animal a1 = new Animal();
	a1.name="Duffy";
	a1.walk();
	//now trying the Dog class
	Dog d1 = new Dog();
	d1.name="Jimmy";
	d1.walk();
}
}
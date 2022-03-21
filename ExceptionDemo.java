import java.lang.Exception;
import java.util.*;

public class ExceptionDemo {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your FULL name");
		String name = sc.nextLine();
		try{
		boolean hasSpace = false;
		for(int i=0; i<name.length(); i++)
			if(name.charAt(i) == ' ') hasSpace=true;
			
		if(!hasSpace) 
			throw new CustomException("Oops \n looks like you did not enter the full name ! \n try again later !!");
		else
			System.out.println("Welcome "+name+" . That is a nice name !!");
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
}

class CustomException extends Exception {
	CustomException(String s){
		super(s);
		System.out.println("Err occurred");
	}
}
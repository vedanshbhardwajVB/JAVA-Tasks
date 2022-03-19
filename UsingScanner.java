import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class UsingScanner {
	public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1 for using Scanner to read a string and 2 to for using Scanner to read from a Path");
	int choice = sc.nextInt();
	switch (choice)
	{
		case 1 :
			String input = "1 2 33 This 4 is a string which will be read by the Scanner class 11 \n And here is the second line of the String 12";	
			sc = new Scanner(input);
			sc.useDelimiter("\\s*the*\\s");
			while(sc.hasNext()){
				System.out.println(sc.next());
			}
			sc.close();
			break ; 
		case 2 :
			try {
			sc = new Scanner(new File("C:/Users/UPLC/Documents/JavaPrograms/simple.txt"));
			while(sc.hasNext()){
				System.out.println(sc.next());
			}
			sc.close();
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			break ; 
		default :
		System.out.println("Unexpected input");
	}
	
    }
}
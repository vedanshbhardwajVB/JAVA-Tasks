import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadCsv {
	public static void main (String [] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\Users\\Vedansh\\Downloads\\tasks.csv"));
		sc.useDelimiter(",");
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
import java.io.File;  
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
 	public static void main(String[] args) {
    try {
      File myFile = new File("SampleFile.txt");
      Scanner sc= new Scanner(myFile);
      while (sc.hasNextLine()) {
        String data = sc.nextLine();
        System.out.println(data);
      }
      sc.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
import java.io.FileWriter; 
import java.io.IOException;

public class WriteFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("SampleFile.txt");
      myWriter.write("This is the first line written to a file ! \n This is the second and line \n And here is the third.");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred !!");
      e.printStackTrace();
    }
  }
}
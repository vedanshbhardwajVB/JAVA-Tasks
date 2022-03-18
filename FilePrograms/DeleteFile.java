import java.io.File;

public class DeleteFile {
  public static void main(String[] args) { 
    File myFile = new File("SampleFile.txt"); 
    if (myFile.delete()) { 
      System.out.println("Deleted the file called " + myFile.getName());
    } else {
      System.out.println("There was some error while deleting the file called "+ myFile.getName());
    } 
  } 
}
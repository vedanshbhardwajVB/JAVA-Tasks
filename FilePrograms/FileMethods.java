import java.io.File; 

public class FileMethods { 
  	public static void main(String[] args) {
    File myFile = new File("SampleFile.txt");
    if (myFile.exists()) {
      System.out.println("File name is : " + myFile.getName());
      System.out.println("Absolute path of the file is : " + myFile.getAbsolutePath());
      System.out.println("Is the file writable ?  " + myFile.canWrite());
      System.out.println("Is the file readable ?  " + myFile.canRead());
      System.out.println("File size in bytes " + myFile.length());
    } else {
      System.out.println("The file does not exist.");
    }
  }
}
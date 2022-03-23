//casting possible in byte -> short -> char -> int -> long -> float -> double 
import java.util.*;
public class TypeCasting 
{  
public static void main(String[] args)  
{  
Scanner sc=new Scanner(System.in);
int x = 91;  
//automatically converts the integer type into long type  
long y = x;  
//automatically converts the long type into float type  
float z = y;  
System.out.println("Before conversion, int value "+x);  
System.out.println("After conversion, long value "+y);  
System.out.println("After conversion, float value "+z);  

//Converting char to int (gives ascii value)
char c='a';
System.out.println(c+" in int is "+(int)c);  

//Converting int to char

System.out.println((int)c+" mapped to character is -> "+ (char)((int)c));


//Scanner sc=new Scanner(System.in);

//String to primitive data type conversion and vice versa
System.out.println("Enter a Integer string ");
String i = sc.nextLine();
System.out.println("The primitive int value is "+ Integer.parseInt(i));

System.out.println("Enter a Boolean string ");
//checking what happens if user enters anything accept True and False, - > the bolean is assigned false
String b = sc.nextLine();
System.out.println("The Wrapper Boolean value is "+ Boolean.valueOf(b));

System.out.println("Enter a character value");
char chh = sc.next().charAt(0);
System.out.println("Converting it to string ...");
String cv = String.valueOf(chh);
boolean isinstance = cv instanceof String;
System.out.println("Converted  ? "+ isinstance);
}  
}
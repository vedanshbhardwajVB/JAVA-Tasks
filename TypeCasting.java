//casting possible in byte -> short -> char -> int -> long -> float -> double 
public class TypeCasting 
{  
public static void main(String[] args)  
{  
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
}  
}  
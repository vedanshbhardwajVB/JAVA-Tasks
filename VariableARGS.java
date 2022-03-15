/*
VarArgs - Variable Arguments in java 

A variable-length argument is specified by three periods or dots(…). 
A method can have variable length parameters with other parameters too, but there can be only one varargs parameter.
The varargs parameter should be only included as the last parameter in the function signature

*/
import java.util.*;
public class VariableARGS {
	public static void main(String [] args){
		funVar(1, "FirstCall");
		funVar(2, "SecondCall", 0);
		funVar(3, "ThirdCall", 0, 1, 2);
	}

	public static void funVar(int i, String s, int...a){
		System.out.print(i+"---"+s);
		System.out.println("Now printing variable args");
		for(int x : a){
			System.out.println("VarArgs are-"+x+" ");
		}
	}
}
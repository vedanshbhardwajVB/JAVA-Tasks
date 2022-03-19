import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main (String [] args) {
		System.out.println("Enter your technical skills in decresing order of your knowledge separated by space");
		List<String> l = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the skill");
		l.add(sc.next());
		System.out.println("More to add ? Y for YES, N for NO");
		char c=sc.next().charAt(0);
		if(c == 'N')
		break;
		}
		sc.close();
		System.out.println("Your skills are - ");
		for(String skill : l){
			System.out.print(" <-> "+skill);
		}
		System.out.println();
		System.out.println("Hey you also have a typing skill, adding it too .............!!");
		l.add("TYPING");
		System.out.println(l);
		
	}
}
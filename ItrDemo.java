import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class ItrDemo {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter 10 random numbers...");
		for(int i=0; i<10; i++){
			System.out.println("Enter "+i+"th number");
			list.add(sc.nextInt());
		}

		Iterator it =list.iterator();
		while(it.hasNext()){
		int i = (Integer)it.next();
		System.out.print(i+" ");
            	if (i % 2 != 0)
                	it.remove();
		}

		System.out.println(list);
	}
}
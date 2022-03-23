import java.util.Scanner;
public class LinearSearch {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ?");
		int n=sc.nextInt();
		System.out.println("Enter the numbers ...");
		int a[] = new int[n];
		for(int i=0;i<n; i++)
			a[i]=sc.nextInt();

		System.out.println("Enter the element to be searched ?");
		int key = sc.nextInt();
		int ind=-1;
		for(int i=0; i<n; i++)
			if(a[i] == key){
				ind=i;
			}
		if(ind == -1)
			System.out.println(key+" could not be found ! Sorry !!");
		else
			System.out.println(key+" found at position "+ind+1+" in the array");

	}

}
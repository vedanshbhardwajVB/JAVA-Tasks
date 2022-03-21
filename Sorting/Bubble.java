import java.util.Scanner;
public class Bubble {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many unsorted numbers do you have ?");
		int n=sc.nextInt();
		System.out.println("Start entering the"+n+" numbers");
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
		a[i]=sc.nextInt();
		}
		sc.close();
		bubbleSort(a, n);

		System.out.println("The sorted order is ------------------------------------------------------------->");
		for(int i: a){
		System.out.print(i+" ");
		}
	}

	private static void bubbleSort(int a[], int n){
		
		        for (int i = 0; i < n-1; i++)
            			for (int j = 0; j < n-i-1; j++)
                			if (a[j] > a[j+1])
                			{
                   			 int temp = a[j];
                    			a[j] = a[j+1];
                    			a[j+1] = temp;
               		 		}
	}
}
import java.util.Scanner;
public class Selection {
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
		selectionSort(a, n);

		System.out.println("The sorted order is ------------------------------------------------------------->");
		for(int i: a){
		System.out.print(i+" ");
		}
	}

	private static void selectionSort(int a[], int n){
		
		        for (int i = 0; i < n-1; i++){
			int minIndex = i;
			for (int j = i+1; j < n; j++){
				minIndex = a[j] < a[minIndex] ? j : minIndex;
			}
			int temp = a[i];
			a[i]=a[minIndex] ;
			a[minIndex] =temp;			
		}
            			
	}
}
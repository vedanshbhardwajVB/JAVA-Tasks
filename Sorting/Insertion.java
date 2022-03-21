import java.util.Scanner;
public class Insertion {
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
		insertionSort(a, n);

		System.out.println("The sorted order is ------------------------------------------------------------->");
		for(int i: a){
		System.out.print(i+" ");
		}
	}

	private static void insertionSort(int a[], int n){
		
		for(int i=1; i<n; i++){
			int temp = a[i];
			int index=i-1;
			for(int j=i-1; j>=0; j--){
			if(a[j] > temp){
				a[j+1]=a[j];
			}
			else{
				index=j+1;
				break;
			}
				
			}

		a[index]=temp;
		}
	}
}
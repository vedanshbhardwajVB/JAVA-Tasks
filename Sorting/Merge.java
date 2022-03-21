import java.util.Scanner;
public class Merge {
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
		mergeSort(a, 0, n-1);

		System.out.println("The sorted order is ------------------------------------------------------------->");
		for(int i: a){
		System.out.print(i+" ");
		}
	}

	private static void mergeSort(int a[], int l, int r){
		if(l<r){
			int mid = l + ((r-l)/2);
			mergeSort(a, l, mid);
			mergeSort(a, mid+1, r);
			merge(a, l, mid, r);
		}
	}

	private static void merge (int [] a, int l, int mid, int r){
		int l1 = mid - l + 1;
        	int l2 = r - mid;
  
        int L[] = new int[l1];
        int R[] = new int[l2];
  
        for (int i = 0; i < l1; ++i)
            L[i] = a[l + i];
        for (int j = 0; j < l2; ++j)
            R[j] = a[mid + 1 + j];

	int i=0, j=0;
	int k = l;
        while (i < l1 && j < l2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
  
        while (i < l1) {
            a[k] = L[i];
            i++;
            k++;
        }
  
        while (j < l2) {
            a[k] = R[j];
            j++;
            k++;
        }
	}
}
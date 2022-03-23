import java.util.Scanner;
public class BinarySearch {
	public static void main (String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ?");
		int n=sc.nextInt();


		System.out.println("Enter the numbers in sorted order ...");
		int a[] = new int[n];
		int prev=Integer.MIN_VALUE;
		try {
		for(int i=0;i<n; i++){
			a[i]=sc.nextInt();
			if(a[i] < prev)
				throw new UnsortedArrayException("You entered an element that does'nt follows the sorted order ! Try Again.");
			prev=a[i];			
		}
		}
		catch (UnsortedArrayException e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Enter the element to be searched ?");
		int key = sc.nextInt();
		
		int indexFound = recBinarySearch (a, 0, n-1, key);
		
		if (indexFound == -1)
			System.out.println(key + " not found ");
		else
			System.out.println(key + " found at position "+indexFound);
	

	}

	private static int itrBinarySearch (int a[], int i, int j, int key) {
		while(i<=j) {
			int mid = i + (j-i)/2;
			if(a[mid] == key) return mid;
			else if(a[mid] > key ) j=mid-1;
			else i=mid+1;
		}	
		return -1;
	}

	private static int recBinarySearch (int a[], int i, int j, int key) {
			if(i > j)
				return -1;
			int mid = i + (j-i)/2;
			if(a[mid] == key) return mid;
			else if(a[mid] > key ) return recBinarySearch (a, i, mid-1, key);
			else return recBinarySearch (a, mid+1, j, key);
	}
}

class UnsortedArrayException extends Exception {
	UnsortedArrayException(String s) {
		super(s);
		}
}
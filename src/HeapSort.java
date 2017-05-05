
import java.util.*;

public class HeapSort {

	private static int n;

	public static void sort(int arr[]) {
		n = arr.length - 1;
		//heap-maxify the entire heap; 
		heapify(arr);//then repeat this process for each element of array by
		for (int i=n;i>0; i--) {// swapping the 0th element with nth element and decreasing the size
			swap(arr, 0, n);
			n--;
			heapmax(arr, 0);
		}
			String str=new String();
			
	}

	public static void heapify(int arr[]) {
	
		for (int i = n / 2; i >= 0; i--)
			heapmax(arr, i);

	}

	public static void heapmax(int[] arr, int i) {//indexing 0 to n-1, but left child=2i and rt child=2i+1
		int left = 2 * i;
		int right = 2 * i + 1;
		int max = i;

		if ((left <= n) && (arr[left] > arr[i]))
			max = left;

		if ((right <= n) && (arr[right] > arr[max]))
			max = right;

		if (max != i) {
			swap(arr, i, max);
			heapmax(arr, max);

		}
	}

	public static void swap(int arr[], int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("start entering the integers of the array");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		sort(arr);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
	}
}

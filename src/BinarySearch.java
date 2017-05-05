import java.util.Scanner;

public class BinarySearch {

	public static boolean bs_fun(int[] arr, int num, int low, int high) {

		int mid = (low + high) / 2;
		if (low > high) {// System.out.println(" not Found");
			return false;
		}
		if (arr[mid] == num)
			return true;

		else if (arr[mid] > num)
			return bs_fun(arr, num, low, mid - 1);

		else
			return bs_fun(arr, num, mid + 1, high);

	}

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		System.out.println("Enter the element to find");
		int data = scan.nextInt();
		if (bs_fun(arr, data, 0, arr.length - 1))
			System.out.println("ELEMENT PRESENT");
		else
			System.out.println("Not Present");

	}
}

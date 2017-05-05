import java.util.Scanner;

public class LinearSelection {

	public static int select(int[] arr, int k) {
		int n = arr.length;
		int i;
		int j;
		int p;
		//if size less than 5 return kth element
		if (arr.length <= 5) {
			insert_sort(arr, arr.length);
			return arr[k - 1];
		} 
		//else divide arr in n/5 groups each having 5 elements, then find median of each group and store all medians in a separate group
//now let say M is the median of medians
		//then divide arr in three partitions L1<,L2=,L3>.
		//say q=length(L1)
		//if(k<q+1)return select(L1,k)
		//if(k>q+1)return select(L3,k-q-1);
		//else return M;
		else {
			int coln = (int) Math.ceil(n / 5);
			
			int[][] d_arr = new int[coln][5];

			for (j = 0; j < coln; j++) {
				int t = 5 * j;
				for (i = 0; i < 5; i++) {
					if (t >= n)
						break;
					d_arr[j][i] = arr[t];
					t++;
				}
			}

			i = 0;
			int[] medarr = new int[coln];

			while (i < coln - 1) {
				medarr[i] = select(d_arr[i], 3);
				i++;
			}

			int last_row = n % 5;
			if (last_row == 0)
				last_row = 5;
			insert_sort(d_arr[i], last_row);
			medarr[i] = d_arr[i][(last_row - 1) / 2];

			int q = (medarr.length - 1) / 2;
			int M = select(medarr, q);

			int[] left = new int[50];
			int[] right = new int[50];
			j = 0;
			p = 0;
			for (i = 0; i < n; i++) {
				if (arr[i] < M)
					left[j++] = arr[i];
				else if (arr[i] > M)
					right[p++] = arr[i];

			}
			if (k <= j)
				return select(left, k);
			else if (k > (n - p)) {
				return select(right, k - n + p);

			} else
				return M;

		}
	}

	public static void insert_sort(int[] arr, int l) {
		int i = 1;
		int j;
		while (i < l) {
			j = 0;
			while (j < i) {
				if (arr[i] < arr[j]) {
					int k = i;
					int temp = arr[i];
					while (k > j) {
						arr[k] = arr[k - 1];
						k--;
					}
					arr[j] = temp;
					j = i;
				} else
					j++;

			}
			i++;
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		System.out.println("Enter the value of k to find");
		int k = scan.nextInt();

		System.out.println("the kth smallest number is:" + select(arr, k));

	}
}

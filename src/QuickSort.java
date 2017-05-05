public class QuickSort {

	public static void QSort(int[] arr, int start, int end) {
		if (start < end) {
			int p_index = part_fun(arr, start, end);
			QSort(arr, start, p_index - 1);
			QSort(arr, p_index + 1, end);
		}

	}

	public static int part_fun(int[] arr, int start, int end) {
		int pivot = arr[end];
		int p_i = start;
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				{
					int t = arr[p_i];
					arr[p_i] = arr[i];
					arr[i] = t;
				}
				p_i++;
			}

		}
		{
			 int t = arr[p_i];
			arr[p_i] = arr[end];
			arr[end] = t;
		}
		//System.out.println("ye4s.....");
		return p_i;
	}

	public static void main(String[] args) throws Exception {
		int[] arr = { 2, 1, 7, 4, 8, 6, 5, 3 };
		QSort(arr, 0, arr.length - 1);
		System.out.print("sorted array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

}

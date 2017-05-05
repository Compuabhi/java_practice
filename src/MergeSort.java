

//import java.util.*;
//import java.lang.*;
//import java.io.*;

class MergeSort {

	public static void mergesort(int[] arr) {

		int mid = arr.length / 2;
		int size = arr.length;
		if (size == 1)
			return;

		int[] left = new int[mid];
		int[] right = new int[size - mid];
		int i = 0;
		while (i < size) {
			if (i < mid) {
				left[i] = arr[i];
				i++;

			} else {
				right[i - mid] = arr[i];
				i++;
			}
		}

		mergesort(left);

		mergesort(right);
		merge(left, right, arr);

	}

	static void merge(int[] left, int[] right, int[] arr) {
		int i = 0;
		int k = 0;
		int j = 0;

		while (k < arr.length) {
			if ((i < left.length) && (j < right.length)) {
				if (left[i] <= right[j]) {
					arr[k] = left[i];
					i++;

				} else {
					arr[k] = right[j];
					j++;
				}
				k++;
			} else if (i < left.length) {
				arr[k] = left[i];
				i++;
				k++;
			} else {
				arr[k] = right[j];
				j++;
				k++;
			}

		}

	}

	public static void main(String[] args) throws java.lang.Exception {
		int[] arr1 = { 2, 3, 4, 6, 8, 7, 1, 5 };

		System.out.print("The unsorted array is: ");
		int j = 0;
		while (j < arr1.length) {
			System.out.print(arr1[j] + ",  ");
			j++;
		}
		System.out.println(" ");

		mergesort(arr1);

		System.out.print("The sorted array is: ");
		j = 0;
		while (j < arr1.length) {
			System.out.print(arr1[j] + ",  ");
			j++;
		}
		System.out.println(" ");

	}
}
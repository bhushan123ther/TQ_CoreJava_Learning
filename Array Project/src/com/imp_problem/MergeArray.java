package com.imp_problem;

public class MergeArray {
	public static void merge(int arr1[], int arr2[]) {
		int size1 = arr1.length;
		int size2 = arr2.length;

		int arr3[] = new int[size1 + size2];

		int k = 0;
		int i, j;

		for (i = 0, j = 0; i < size1 && j < size2; i++, j++) {
			arr3[k++] = arr1[i];
			arr3[k++] = arr2[j];
		}

		// System.out.println(Arrays.toString(arr3));

		while (i < size1) {
			arr3[k++] = arr1[i++];
		}
		while (j < size2) {
			arr3[k++] = arr2[j++];
		}

		for (int p : arr3) {
			System.out.print(p + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int arr1[] = { 10, 30, 50, };
		int arr2[] = { 20, 40, 60, 80, 100 };

		merge(arr1, arr2);
	}

}

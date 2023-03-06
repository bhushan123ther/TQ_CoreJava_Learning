package com.sorting;

public class FindSecondLLElement {
	public static void sort(int arr[]) {
		int temp;
		int size = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Smallest element is : " + arr[0]);
		System.out.println("Second smallest element is : " + arr[1]);
		System.out.println("Second Largest element is : " + arr[size - 2]);
		// System.out.println("Bubble Sort elements : ");

		// for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 3, 6, 5, 1 };

//		System.out.println("Before Sorting : ");
//
//		System.out.println(Arrays.toString(arr));
//
//		sort(arr);
//
//		System.out.println("After Sorting : ");
//
//		System.out.println(Arrays.toString(arr));

	}

}

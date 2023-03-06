package com.imp_problem;

import java.util.Scanner;

public class IndexPluseIndexNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter index number : ");
		int idxNum = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = idxNum + arr[idxNum];
		}

		System.out.println("Sum of number present at index and index is : " + sum);
	}

}

package com.practice.linearsearch;

public class MinimumNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 9, 4, 2, 8, -9 };
		System.out.println(mimNum(arr));
	}

	static int mimNum(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}
}

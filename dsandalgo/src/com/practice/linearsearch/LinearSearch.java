package com.practice.linearsearch;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 9, 4, 2, 8 };
		int target = 8;
		System.out.println(linearSearch(arr, target));
	}

	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0)
			return -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}

}

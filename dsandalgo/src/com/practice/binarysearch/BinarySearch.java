package com.practice.binarysearch;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 9, 11, 16, 36, 45 };
		int target = 9;
		System.out.println(binarySearch(arr, target));
	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
//			int mid = (start + end)/2;// If we take very large number, it may exceed int value range. So avoid it.
			int mid = start + (end - start) / 2; // this is the better approach.
			if (target == arr[mid])
				return mid;
			else if (target > arr[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}

}

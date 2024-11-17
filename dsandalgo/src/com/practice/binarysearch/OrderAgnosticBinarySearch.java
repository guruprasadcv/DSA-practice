package com.practice.binarysearch;

public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {
//		int[] arr = { 2, 4, 5, 9, 11, 16, 36, 45 };
		int[] arr = { 45, 36, 16, 11, 9, 5, 4, 2 };
		int target = 4;
		System.out.println(orderAgnosticBinary(arr, target));
	}

	static int orderAgnosticBinary(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid])
				return mid;
			boolean isAsc = (arr[start] < arr[end]);
			if (isAsc) {
				if (target > arr[mid])
					start = mid + 1;
				else
					end = mid - 1;
			} else {
				if (target < arr[mid])
					start = mid + 1;
				else
					end = mid - 1;
			}
		}
		return -1;
	}

}

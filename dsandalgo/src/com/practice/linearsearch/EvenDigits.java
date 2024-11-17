package com.practice.linearsearch;

public class EvenDigits {
	public static void main(String[] args) {
		int[] nums = { 4, 25, 8963, 4, 587213 };
		System.out.println(evenDigits(nums));
	}

	static int evenDigits(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (isEven(num)) {
				count++;
			}
		}
		return count;
	}

	static boolean isEven(int num) {
		int numOfDigits = countOfDigits(num);
		return (numOfDigits % 2 == 0);

	}

	static int countOfDigits(int num) {
		int count = 0;
		if (num < 0)
			num = num * -1;
		if (num == 0)
			return 1;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
}

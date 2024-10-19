package com.practice.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "java";
		System.out.println(reverseString(str));
	}

	static String reverseString(String str) {
		String newStr = "";
		for (int i = str.length() - 1; i > 0; i--) {
			newStr = newStr + str.charAt(i);
		}
		return newStr + str.charAt(0);
	}
}

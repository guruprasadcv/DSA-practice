package com.practice.string;

import java.util.Arrays;

public class Anagram1 {
	public static boolean isAnagram(String s1, String s2) {
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		String s1 = "eat";
		String s2 = "ate";
		boolean isAnagram = isAnagram(s1, s2);
		if (isAnagram)
			System.out.println("Given strings are Anagram");
		else
			System.out.println("Given strings are not Anagram");
	}

}

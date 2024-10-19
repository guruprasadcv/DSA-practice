package com.practice.string;
/*
Use an array of size 26 (since there are 26 lowercase English letters) to keep track of the
letter frequencies.

First, we iterate through the first string and counting how many times each character appears
and storing these counts in our frequency array.

Then, we iterate through the second string, but instead of counting, 
we decrement the frequency of each character.

After processing both strings, if the strings are anagrams, every position
in the frequency array should be zero (indicating that the counts balanced out).
 
If any position is not zero, it means the strings have different character counts,
and thus, are not anagrams.
*/

public class Anagram2 {
	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		int[] count = new int[26];
		for (char c : s1.toCharArray())
			count[c - 'a']++;
		for (char c : s2.toCharArray())
			count[c - 'a']--;

		for (int i = 0; i < 26; i++) {
			if (count[i] != 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		boolean result = isAnagram(s1, s2);
		if (result)
			System.out.println("Given strings are Anagram");
		else
			System.out.println("Given strings are not Anagram");
	}

}

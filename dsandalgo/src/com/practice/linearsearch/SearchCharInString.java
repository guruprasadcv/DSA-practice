package com.practice.linearsearch;

public class SearchCharInString {
	public static void main(String[] args) {
		String str = "Guru";
		char target = 'u';
		System.out.println(searchChar(str, target));
	}

	static boolean searchChar(String str, char target) {
		if (str.length() == 0)
			return false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target)
				return true;
		}
		return false;
	}

}

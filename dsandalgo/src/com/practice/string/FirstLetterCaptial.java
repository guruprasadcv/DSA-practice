package com.practice.string;

import java.util.Arrays;

public class FirstLetterCaptial {
	public static void main(String[] args) {
		String str = "hey Universe";
		System.out.println(firstLetterCaps(str));
	}

	static String firstLetterCaps(String str) {
		String[] split = str.split(" ");
		System.out.println(Arrays.toString(split));
		StringBuilder sb = new StringBuilder();
		for (String s : split) {
			if (Character.isLowerCase(s.charAt(0))) {
				sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
			} else if (Character.isUpperCase(s.charAt(0))) {
				sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
			}
		}
		return sb.toString().trim();
	}

}

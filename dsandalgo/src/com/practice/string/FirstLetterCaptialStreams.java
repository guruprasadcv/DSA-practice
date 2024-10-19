package com.practice.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstLetterCaptialStreams {
	public static void main(String[] args) {
		String str = "hey Universe";
		System.out.println(firstLetterCaps(str));
	}

	static String firstLetterCaps(String str) {
		return Arrays.stream(str.split(" "))
				.map(word -> Character.toTitleCase(word.charAt(0)) + word.substring(1))
				.collect(Collectors.joining(" "));
	}
}

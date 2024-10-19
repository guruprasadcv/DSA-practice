package com.practice.string;

import java.util.ArrayList;
import java.util.List;

public class WordCountGreaterThanK1 {
	public static void main(String[] args) {
		String s = "I am practicing Data structures and Algorithms";
		int count = 4;
		System.out.println(wordCount(s, count));
	}

	static List<String> wordCount(String str, int k) {
		List<String> list = new ArrayList<>();
		String[] split = str.split(" ");
		for (String s : split) {
			if (s.length() > k)
				list.add(s);
		}
		return list;
	}

}

package com.practice.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordInString {
	public static void main(String[] args) {
		String str = "I am a I am Java a Developer";
		duplicateWordInString(str);
	}

	static void duplicateWordInString(String str) {
		Map<String, Integer> map = new HashMap<>();
		String[] split = str.split(" ");
		for (String s : split) {
			if (map.get(s) != null)
				map.put(s, map.get(s) + 1);
			else
				map.put(s, 1);
		}
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " , count " + entry.getValue());
			}
		}
	}
}

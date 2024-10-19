package com.practice.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharInString {
	public static void main(String[] args) {
		String str= "hello Javaa";
		duplicateChar(str);
	}

	static void duplicateChar(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		System.out.println("EntrySet: "+entrySet);
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ", count = " + entry.getValue());
			}
		}
	}

}

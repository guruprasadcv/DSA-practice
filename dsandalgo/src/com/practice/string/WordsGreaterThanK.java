package com.practice.string;

public class WordsGreaterThanK {
	public static void main(String[] args) {
		String s = "I am practicing Data structures and Algorithms" + " "; // need to pass extra whitespace or else last
																			// word is ignored as there is no space
																			// after that. NOT AN IDEAL SOLUTION
		int wordCount = 5;
		wordsGreather(s, wordCount);
	}

	static void wordsGreather(String str, int k) {
		String output = " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				output = output + str.charAt(i);
			else {
				if (output.length() > k)
					System.out.print(output + " ");
				output = "";
			}

		}
	}

}

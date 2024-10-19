package com.practice.string;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "Data Structure and Algorithms";
		System.out.println(reverseWord(str));
	}

	static String reverseWord(String str) {
		String[] split = str.split(" ");
		String newStr = "";
		for (int i = 0; i < split.length; i++) { 
            if (i == split.length - 1) 
            	newStr = split[i] + newStr; 
            else
            	newStr = " " + split[i] + newStr; 
        } 
        return newStr; 
	}
}

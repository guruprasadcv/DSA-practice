package com.practice.string;

public class ConvertToOppositeCase {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Mother EArth");
		stringConvert(str);
		System.out.println(str);
	}

	static void stringConvert(StringBuffer str) {
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if(Character.isLowerCase(ch))
				str.replace(i, i+1, Character.toUpperCase(ch)+"");
			else
				str.replace(i, i+1, Character.toLowerCase(ch)+"");
		}
	}

}

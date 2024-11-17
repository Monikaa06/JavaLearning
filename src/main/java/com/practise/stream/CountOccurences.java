package com.practise.stream;

public class CountOccurences {
public static void main(String[] args) {
	/**
	 * Count occurrence of a given character in a string using Stream API in Java
	 */
	String str = "AmPractisingStream";
	char ch = 'a';
	long count = str.toLowerCase().chars().filter(element -> element == ch).count();
	System.out.println(count);
}
}

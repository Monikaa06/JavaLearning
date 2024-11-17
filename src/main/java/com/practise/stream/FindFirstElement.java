package com.practise.stream;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {
		/**
		 * Given a stream containing some elements, the task is to get the first element of the Stream in Java.

Example:


Input: Stream = {“Geek_First”, “Geek_2”, “Geek_3”, “Geek_4”, “Geek_Last”}

Output: Geek_First


Input: Stream = {1, 2, 3, 4, 5, 6, 7}

Output: 1
		 */
		List<String> input = Arrays.asList("Geek_First","Geek_2");
		String st=input.stream().findFirst().orElse("mv");
		System.out.println(st);

	}

}

package com.practise.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindFrequency {
public static void main(String[] args) {
	 List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
	 int freq = Collections.frequency(list, "apple");
	 System.out.println(freq);
}
}

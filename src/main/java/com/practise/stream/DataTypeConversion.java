package com.practise.stream;

import java.util.Arrays;
import java.util.List;

public class DataTypeConversion {
public static void main(String[] args) {
	/**
	 * List<String> to List<Integer> in Java 8 
	 */
	  List<String> listOfString = Arrays.asList("1", "2", "3", "4", "5"); 
	  List<Integer> listOfInt = listOfString.stream().map(Integer::parseInt).toList();
	  System.out.println(listOfInt);
}
}

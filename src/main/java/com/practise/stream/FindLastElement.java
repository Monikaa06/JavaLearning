package com.practise.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7); 
		Integer last = numbers.stream().sorted(Collections.reverseOrder()).findFirst().orElse(0);
		System.out.println(last);
	}

}

package com.practise.stream;

import java.util.*;
import java.util.function.Function;

public class SumOfList {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	 
    // add elements to the list
    list.add(1);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    int count = list.stream().mapToInt(Integer::intValue).sum();
    System.out.println(count);
    
}
}

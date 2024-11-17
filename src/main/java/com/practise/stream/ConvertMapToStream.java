package com.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ConvertMapToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> map = Map.of("a",1,"b",2);
List<Map.Entry<String,Integer>> list = map.entrySet().stream().toList();
System.out.println(list);
	}

}

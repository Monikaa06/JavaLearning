package com.practise.stream;

import java.util.List;
import java.util.Map;

public class ConvertMapValuesToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = Map.of("a",1,"b",2);
		List<Integer> list = map.values().stream().toList();
		System.out.println(list);
	}

}

package com.practise.stream;

import java.util.*;

public class ConvertMapKeyIntoStream {

	public static void main(String[] args) {
		// Converting only the Keyset of the Map<Key, Value> into Stream
		Map<Double,String> map = new HashMap();
		map.put(20.0,"leela");map.put(34.0,"leela");map.put(20.0,"Rosy");map.put(89.0,"shiny");
		List<Double> list = map.keySet().stream().toList();
		System.out.println(list);

	}

}

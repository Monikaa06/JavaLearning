package com.practise.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
public static void main(String[] args) {
/**
 * Input: Stream = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34}

Output: [59, 13]

Explanation:

The only duplicate elements in the given stream are 59 and 13.


Input: Stream = {5, 13, 4, 21, 27, 2, 59, 34}

Output: []

Explanation:

There are no duplicate elements in the given stream, hence the output is empty.
 */
	List<Integer> num = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
	Set<Integer> unique = new HashSet();
	List<Integer> uniqueLst=num.stream().filter(c-> !unique.add(c)).toList();
	System.out.println(uniqueLst);
	Set<Integer> uniqSet = num.stream().filter(n->Collections.frequency(num, n)>1).collect(Collectors.toSet());
	System.out.println(uniqSet);
}
}

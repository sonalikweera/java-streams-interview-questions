package com.demo.stream.level3;

import java.util.*;
import java.util.stream.Collectors;

//Find frequency of each number

public class FrequencyOfNo {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(1, 2, 3, 2, 4, 3, 5);
		
Map<Object, Long>	map=numbers.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
		
System.out.println(map);
	}
}

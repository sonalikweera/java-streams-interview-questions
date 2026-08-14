package com.demo.stream.level2;

import java.util.*;

//Sort numbers in descending order
public class SortNoDescending {

	public static void main(String[] args) {
		
		List<Integer> numbers =
			    Arrays.asList(5, 2, 8, 1, 3);
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
		
		
	}
}

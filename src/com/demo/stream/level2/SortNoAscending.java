package com.demo.stream.level2;

import java.util.*;

//Sort numbers in ascending order
public class SortNoAscending {
	
	public static void main(String[] args) {
		
	
	List<Integer> numbers =
		    Arrays.asList(5, 2, 8, 1, 3,3);
	
	numbers.stream().sorted().forEach(n->System.out.println(n));

	}
	
}

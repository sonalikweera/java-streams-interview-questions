package com.demo.stream.level2;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		//Remove duplicate numbers
		
		List<Integer> numbers =
			    Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5);
		
		numbers.stream().distinct().forEach(n->System.out.println(n));
		
	}
}

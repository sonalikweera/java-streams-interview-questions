package com.demo.stream.level3;

import java.util.*;

//Find the second-smallest number

public class SecondSmallest {
	
	public static void main(String[] args) {
		
		List<Integer> numbers =
			    Arrays.asList(10, 20, 5, 30, 5, 40);
		int small=numbers.stream().sorted().distinct().skip(1).findFirst().orElse(null);
		System.out.println(small);
	}

}

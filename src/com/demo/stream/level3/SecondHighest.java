package com.demo.stream.level3;

import java.util.*;

public class SecondHighest {

	public static void main(String[] args) {
		
		List<Integer> numbers =
			    Arrays.asList(10, 20, 30, 40, 40, 50);
		
	int secondmax=	numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(null);
		
	System.out.println(secondmax);
	}
}

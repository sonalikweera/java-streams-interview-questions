package com.demo.stream.level2;

import java.util.*;

//Find the maximum number



public class MaxNo {
	
	public static void main(String[] args) {
		
	

	List<Integer> numbers =
		    Arrays.asList(10, 50, 20, 90, 30);	
	
	Optional<Integer> no=numbers.stream().max(Comparator.comparingInt(n->n));
	
	System.out.println(no);
	
	//way 2 sorting
	
	int max=numbers.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(null);
	
	System.out.println("2nd way:"+max);
	
	}
}

package com.demo.stream.level2;

import java.util.*;
//Find the minimum number

public class MinNo {
public static void main(String[] args) {
	
	List<Integer> numbers =
		    Arrays.asList(10, 50, 20, 90, 30);
	
	int no=numbers.stream().min(Comparator.comparingInt(n->n)).orElse(null);
	System.out.println(no);
}
}

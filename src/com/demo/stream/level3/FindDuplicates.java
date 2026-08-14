package com.demo.stream.level3;

import java.util.*;

import java.util.stream.Collectors;

//Find duplicate elements
public class FindDuplicates {
	
	public static void main(String[] args) {
		
		List<Integer> numbers =
			    Arrays.asList(1, 2, 3, 2, 4, 3, 5);
		
	List<Integer> ls=	numbers.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()))
		.entrySet().stream().filter(n->n.getValue()>1).map(Map.Entry:: getKey).collect(Collectors.toList());
		
	System.out.println(ls);
	
	
	//way 2 using hashset easy
	
	HashSet< Integer> hash= new HashSet<Integer>();
	List<Integer> ls2= numbers.stream().filter(n->!hash.add(n)).collect(Collectors.toList());
	
	System.out.println("2nd way:"+ls2);
	
	}

}

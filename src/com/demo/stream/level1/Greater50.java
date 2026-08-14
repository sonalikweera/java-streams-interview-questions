package com.demo.stream.level1;

import java.util.*;
import java.util.stream.*;

//Find all numbers greater than 50

public class Greater50 {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(3,5,4,7,87,56,34,89,12,34);
		
	List<Integer> ls=	list.stream().filter(n->n>50).collect(Collectors.toList());
		
		System.out.println(ls);
		
	}

}

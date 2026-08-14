package com.demo.stream.level5;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfWords {

	public static void main(String[] args) {
		
		String s =
			    "java spring java sql spring java";
	
	Map<Object, Long> map=	Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(n->n,Collectors.counting()));
	
	System.out.println(map);
	}
}

package com.demo.stream.level5;

import java.util.*;
import java.util.stream.Collectors;

public class WordLengthGreaterThan5 {

	
	public static void main(String[] args) {
		
		String s =
			    "Java Spring Boot Microservices SQL";
		
	List<String> word=	Arrays.stream(s.split(" ")).filter(n->n.length()>5).collect(Collectors.toList());
		
	System.out.println(word);
	
	}
}

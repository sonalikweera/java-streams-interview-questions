package com.demo.stream.level5;

//Find duplicate words

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateWords {

	public static void main(String[] args) {
		
		String s =
			    "java spring java sql spring java";
		
		HashSet<String > hash = new HashSet<String>();
		
		List<String> Str= Arrays.stream(s.split(" ")).filter(n-> !hash.add(n)).distinct().collect(Collectors.toList());
		
		System.out.println(Str);
	}
	
}

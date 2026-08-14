package com.demo.stream.level5;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		
		String s="Java is good";
		
//		String n=Arrays.stream(s.split(" ")).reduce("",(a,b)->b+a);
//		
//		System.out.println(n);
//		
//		
		String result = Arrays.stream(s.split(" "))
		        .map(word -> new StringBuilder(word).reverse().toString())
		        .collect(Collectors.joining(" "));

		System.out.println(result);
		
	}

}

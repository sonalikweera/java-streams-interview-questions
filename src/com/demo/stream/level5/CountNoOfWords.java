package com.demo.stream.level5;

import java.util.*;


//Count the number of words

public class CountNoOfWords {

	public static void main(String[] args) {
	
		String s =
			    "Java is a programming language";
		
	
	
	Long word =Arrays.stream(s.split(" ")).count();
	
	System.out.println(word);
	}
	
}

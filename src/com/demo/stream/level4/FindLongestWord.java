package com.demo.stream.level4;

import java.util.*;

//find the longest word

public class FindLongestWord {

	public static void main(String[] args) {
		
		String s =
			    "Java is a powerful programming languageeeeee";
		
		String lonng =Arrays.stream(s.split(" ")).reduce("",(a,b)->b.length()>a.length()?b:a);
		
		System.out.println(lonng);
	}
}

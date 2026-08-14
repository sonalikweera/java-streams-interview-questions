package com.demo.stream.level4;

import java.util.*;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		
		String s = "swiss";
		
	Optional<String> s3=	Arrays.stream(s.split("")).filter(n->s.indexOf(n)!=s.lastIndexOf(n)).findFirst();
		
		System.out.println(s3);
		
	}
}

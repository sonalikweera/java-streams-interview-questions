package com.demo.stream.level4;

import java.util.*;

//Find first non-repeated character
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String s = "swwiss";
		
		String s2=Arrays.stream(s.split("")).filter(n->s.indexOf(n)==s.lastIndexOf(n)).findFirst().orElse(null);
		System.out.println(s2);
		
	}
}

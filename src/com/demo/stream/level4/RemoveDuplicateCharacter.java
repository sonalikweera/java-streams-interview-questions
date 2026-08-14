package com.demo.stream.level4;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		
		
		String s = "programming";
		
		List<String>ls=Arrays.stream(s.split("")).distinct().collect(Collectors.toList());
		
		System.out.println(ls);
	}
	
}

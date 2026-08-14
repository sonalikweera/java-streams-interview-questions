package com.demo.stream.level4;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		
		
		String s = "programming";
		
		HashSet<String> ls = new HashSet<String>();
		
		
		List<String> arr= Arrays.stream(s.split("")).filter(n->!ls.add(n)).collect(Collectors.toList());
		
		System.out.println(arr);
		
	}
}

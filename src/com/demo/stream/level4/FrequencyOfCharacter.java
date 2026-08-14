package com.demo.stream.level4;

import java.util.*;
import java.util.stream.Collectors;

//Find frequency of each character

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		
		String s = "sonali";
		
	Map<Object, Long> map=	Arrays.stream(s.split("")).collect(Collectors.groupingBy(n->n,Collectors.counting()));
		
	System.out.println(map);
	}
}

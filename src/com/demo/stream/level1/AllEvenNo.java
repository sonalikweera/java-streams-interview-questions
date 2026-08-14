package com.demo.stream.level1;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

//Find all even numbers
public class AllEvenNo {

	public static void main(String[] args) {
		
	List<Integer>ls = Arrays.asList(3,5,4,7,6,8,9,4,3);
	
	List<Integer>list=ls.stream().filter(n-> n%2==0).collect(Collectors.toList());
	System.out.println(list);
	
	
	
	
	
	
	
	
	
 }
	
}

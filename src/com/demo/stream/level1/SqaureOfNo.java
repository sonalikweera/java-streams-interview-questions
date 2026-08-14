package com.demo.stream.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SqaureOfNo {

	//Find the square of each number
		
	public static void main(String [] args) {
		
		
		List <Integer> ls = new ArrayList<Integer>();
		
		ls.add(3);
		ls.add(56);
		ls.add(67);
		ls.add(6);
		
		List<Integer> ls1=ls.stream().map(n->n*n).collect(Collectors.toList());
		
		System.out.println("sqaure of each element:"+ls1);
		
	}
		
	}
	


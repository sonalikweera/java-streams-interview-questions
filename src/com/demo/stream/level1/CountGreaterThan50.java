package com.demo.stream.level1;

import java.util.Arrays;
import java.util.List;

public class CountGreaterThan50 {
	
	public static void main(String[] args) {
		
		//Count numbers greater than 50
		
		List<Integer> numbers = Arrays.asList(10, 55, 20, 75, 30, 90);
		
		Long no= numbers.stream().filter(n->n>50).count();
		
		System.out.println(no);
		
	}

}

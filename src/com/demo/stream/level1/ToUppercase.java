package com.demo.stream.level1;

import java.util.Arrays;
import java.util.List;

//Convert all strings to uppercase
public class ToUppercase {

	public static void main(String[] args) {
		
		List<String> ls = Arrays.asList("Somali","Mukku","Sonali");
		
		ls.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
		
	//System.out.println(ls);	
		
		
		
	}
}


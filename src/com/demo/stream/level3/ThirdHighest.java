package com.demo.stream.level3;

import java.util.Arrays;
import java.util.Comparator;

//Find the third-highest distinct number
public class ThirdHighest {

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 4, 5, 62, 4, 3, 5}; //
		
	int max3=	Arrays.stream(arr).mapToObj(Integer::valueOf).distinct().sorted(Comparator.reverseOrder()).
		skip(2).findFirst().orElseThrow();
		
	System.out.println(max3);
	}
}

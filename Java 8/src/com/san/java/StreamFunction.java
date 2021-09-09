package com.san.java;

import java.util.Arrays;
import java.util.List;

public class StreamFunction {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,45,603,7,10);
		
		intList.stream()
		.filter(x->x%2==0)
		.forEach(System.out::println);
		
	}

}

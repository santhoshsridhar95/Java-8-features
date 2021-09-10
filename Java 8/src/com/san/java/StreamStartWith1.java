package com.san.java;

import java.util.Arrays;
import java.util.List;

public class StreamStartWith1 {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(12,34,1,45,120,10);
		
		myList.stream()
		
		.filter(x-> x.toString().startsWith("1"))
		.forEach(System.out::println);
				
				
	}

}

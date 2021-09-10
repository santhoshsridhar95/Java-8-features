package com.san.java;

import java.util.Arrays;
import java.util.List;

public class StreamFindFirst {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(8,1,3,4,8);
		
		myList.stream()
		.findFirst()
		.ifPresent(System.out::println);
		
	}
}

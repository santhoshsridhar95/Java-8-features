package com.san.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamFindingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(1,5,6,1,5,4,2,12,2);
		Set<Integer> mySet = new HashSet<>();
		
		myList.stream()
		.filter(n->mySet.add(n))
		.forEach(System.out::println);
		

	}

}

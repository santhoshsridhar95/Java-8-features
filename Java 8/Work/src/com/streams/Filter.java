package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,10,1,2,3,2,4,2,2,2,9);
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> set1 = new HashSet<>();
		
		List<Integer>  list2 = list.stream().filter(a-> !set.add( a))
				.filter(a->set1.add(a))
		.collect(Collectors.toList());
//		.forEach(System.out::println);
		
		System.out.println(list2.toString().replace("[", "").replace("]",""));
	 
//	 list.stream().filter(a-> !set.add( a)).limit(1)
//		.collect(Collectors.toSet())
//		.forEach(System.out::println);
	}
}

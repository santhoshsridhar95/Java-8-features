package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurence {

	public static void main(String[] args) {
		String str = "Welcome to Bengaluru. Bengaluru is awesome place to Visit Bengaluru";
		
		List<String> list= Arrays.asList(str.split(" "));
		
		Map<String, Long> map = list.stream()
		.collect(Collectors.groupingBy(s->s,Collectors.counting()));
		
		System.out.println(map);
		
		
	}
}

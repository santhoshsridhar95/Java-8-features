package com.san.java;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String str = " Java is a programming language";
		
		str.chars()
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry-> entry.getValue()==1L)
				.map(entry-> entry.getKey())
				.forEach(System.out::print);
//				.findFirst()
//				.get();
//		System.out.println(result);
	}

}

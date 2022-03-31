package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum {
public static void main(String[] args) {
	
	Integer [] a = {1,2,3,4};
	List<Integer> l1 = new ArrayList(Arrays.asList(a));
	l1.add(2);
	int sum = l1.stream().mapToInt(Integer::intValue).sum();
	
	System.out.println(sum);
	System.out.println("list is=> "+l1);
	
//	 List<Integer> startIndices = null;
//	int [] result = new int[startIndices.size()];
	List<Integer> sub = new ArrayList();
	sub = l1.subList(0, 2);
	System.out.println(l1.subList(0, 1));
	System.out.println(sub);
	
	
	
}
}

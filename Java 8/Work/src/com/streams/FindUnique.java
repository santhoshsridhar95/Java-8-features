package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUnique {

	public static void main(String[] args) {
		  HashSet<Integer> set = new HashSet();
	        
	        int[] nums = {1,2,2,3,4};
			List<Integer> l1=Arrays.stream(nums).boxed().collect(Collectors.toList());
			l1.add(5);
			l1.add(5);
			
			List<Integer> l2=l1.stream().filter(a-> !set.add( a)).collect(Collectors.toList());
			
			System.out.println(l2);
			
	}
}

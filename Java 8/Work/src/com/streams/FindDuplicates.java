package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
public static void main(String[] args) {
	 
	
	 int[] nums = {1,2,3,2,9};
    Set<Integer> s = new HashSet();
    List list =new ArrayList( Arrays.asList(nums));
    long count = list.stream().filter(a->!(s.add((Integer) a))).count();
   
    
    if(count>0){
        System.out.println("true");
    }
    else
    	System.out.println("false");
    
}
}

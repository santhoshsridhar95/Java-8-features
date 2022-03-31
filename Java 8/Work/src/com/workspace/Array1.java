package com.workspace;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Array1 {
	
	 public static void main(String args[] ) throws Exception {

		
			//Write code here
				   Scanner s = new Scanner(System.in);
				    System.out.println("Enter time");
				    long startTime = System.nanoTime();
				   int T = Integer.parseInt(s.nextLine());

		         for(int i=0;i<T;i++) {
				   int N = Integer.parseInt(s.nextLine());
		          String G = s.nextLine();
		          String amt = s.nextLine();

//		          System.out.println(" String is "+amt);
		          
		          String []amtArr = amt.split(" ");
		          int []res = Arrays.asList(amtArr).stream().mapToInt(Integer::parseInt).toArray();
		          Arrays.sort(res);
		          
		          
//		          System.out.println("After sort arr is ");
//		          for (int str : res) {
//					System.out.println(str);
//				}
		          
		          res = Arrays.copyOfRange(res,0,N);
		          
		        
//		          System.out.println(" sort arr end ");
		          int sum = IntStream.of(res).sum();

		            System.out.println(sum);
		         
		         }

		         long stopTime = System.nanoTime();
		         System.out.println("Exec Time is= "+((stopTime - startTime)/ 1_000_000_000));
		   }

}

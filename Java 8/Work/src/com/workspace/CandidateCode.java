package com.workspace;
/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
import java.util.stream.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
	   
	  
			//Write code here
				   Scanner s = new Scanner(System.in);
				    System.out.println("Enter time");
				    long startTime = System.nanoTime();
				   int T = Integer.parseInt(s.nextLine());
               int [] nArr =new int[T];
               String []gArr =new String[T];
               String []gAmt =new String[T];

		         for(int i=0;i<T;i++) {
				    nArr[i]=Integer.parseInt(s.nextLine());
		          gArr[i]= s.nextLine();
		          gAmt[i]= s.nextLine();
               }

 for(int i=0;i<T;i++) {
				   int N = nArr[i];
		          String G = gArr[i];
		          String amt = gAmt[i];
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

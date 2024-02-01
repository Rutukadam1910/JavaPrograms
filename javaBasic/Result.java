package com.javaBasic;
import java.util.Scanner;
public class Result {
	
		public static void main(String args[]) {
			    Scanner sc = new Scanner(System.in);
			    System.out.println("enter marks:");
		        int result = sc.nextInt();
		        
	            if(result >75) {
	            	System.out.println("distinction");
	            	}
	            else if(60<result && result<75) {
	            	System.out.println("first class");
	        	}
	            else if(50<result && result<60) {
	            	System.out.println("second class");
	        	}
	            else {
	            	System.out.println("fail");
	            }
	            
	          
	}
}



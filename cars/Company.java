package com.cars;
import java.util.Scanner;
public class Company {
			static {
		    	System.out.println("welcome to cars");
		    }
			public static void main(String args[]) {
		        
		        Scanner sc = new Scanner (System.in);
		        System.out.println("choose your favorite company :");
		        System.out.println("1.Tata");
		        System.out.println("2.Toyata");
		        System.out.println("3.Mahindra");
		        int choose = sc.nextInt();
		        		       
		        
		        switch(choose) {
				case 1:
					System.out.println("welcome to TATA");
					Operations.getTata();
					break;
				case 2:
					System.out.println("welcome to Toyata");
					Operations2.getToyata();
					break;
				case 3:
					System.out.println("welcome to Mahindra");
					Operations3.getMahindra();
					break;
				
				default:
					System.out.println("invalid choice");
				
				}
		        
		        
		}
}




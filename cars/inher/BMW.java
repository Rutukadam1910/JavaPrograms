package com.cars.inher;

import java.util.Scanner;

public class BMW extends Car{
	public static void getBmw() {
		System.out.println("BMW is one of leading company");
		
		System.out.println("press 1 to go back to menu" );
		System.out.println("press 2 to choose BMW company car" );
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if(num1 == 1) {
			Car c = new Car();
			c.getCar();
		}
		else if(num1 == 2) {
		System.out.println("choose your car:" );
		System.out.println("1.X5 \n2.X6 ");
		int num2 = sc.nextInt();
		X5 x5 = new X5();
		X6 x6 = new X6();
		switch(num1) {
		case 1: 			
			x5.getX5();	
			break;
		case 2: 			
			x6.getX6();	
			break;		
		default:
			System.out.println("Invalid choice");
		}	
	}
		
		
	}
}


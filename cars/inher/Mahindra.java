package com.cars.inher;

import java.util.Scanner;

public class Mahindra extends Car{
	public static void getMahindra() {
		System.out.println("Mahindra is one of leading company");	
		System.out.println("press 1 to go back to menu" );
		System.out.println("press 2 to choose Mahindra company car" );
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if(num1 == 1) {
			Car c = new Car();
			c.getCar();
		}
		else if(num1 == 2) {
			System.out.println("choose your car:" );
			System.out.println("1.Scorpio \n2.XUV700 ");		
			int num = sc.nextInt();
			Scorpio s = new Scorpio();
			XUV700 x = new XUV700();
			switch(num) {
			case 1: 			
				s.getScorpio();	
				break;
			case 2: 			
				x.getXUV700();	
				break;		
			default:
				System.out.println("Invalid choice");
			
		
		}
	}
			
	}
}

package com.cars.inher;

import java.util.Scanner;

public class Tata extends Car {
	public static void getTata() {
		System.out.println("Tata is one of leading company");
		System.out.println("press 1 to go back to menu" );
		System.out.println("press 2 to choose Tata company car" );
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if(num1 == 1) {
			Car c = new Car();
			c.getCar();
		}
		else if(num1 == 2) {
		System.out.println("choose your car:" );
		System.out.println("1.Altroz \n2.Safari ");
		int num2 = sc.nextInt();
		
		Altroz a = new Altroz();
		Safari s = new Safari();
		switch(num2) {
		case 1: 			
			a.getAltroz();	
			break;
		case 2: 			
			s.getSafari();	
			break;		
		default:
			System.out.println("Invalid choice");
		}	
	}
	}
}

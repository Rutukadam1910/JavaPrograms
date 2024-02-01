package com.cars.inher;
import java.util.Scanner;
public class Car {
	
	public static void getCar() {
		System.out.println("car helps us to reach destination fast");
		System.out.println("choose your car company:");
		System.out.println("1.Tata \n2.Bmw \n3.Mahindra");
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
		Tata td = new Tata();
		BMW b = new BMW();
		Mahindra m = new Mahindra();
		
		switch(num){
		case 1: 			
			td.getTata();	
			break;
		case 2: 			
			b.getBmw();	
			break;		
		case 3:			
			m.getMahindra();	
			break;
			
		}
		
	}
	
}

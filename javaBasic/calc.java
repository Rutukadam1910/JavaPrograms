package com.javaBasic;
import java.util.Scanner;
public class calc {
	public static void main(String args[]) {
        // here System is class with static variable in 	
        Scanner sc = new Scanner (System.in);
        System.out.println("choose number to perform operation :");
        System.out.println("1.addition");
        System.out.println("2.substraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        int choose = sc.nextInt();
        System.out.println("enter your first number");
        int num1 = sc.nextInt();
        System.out.println("enter your second number");
        int num2 = sc.nextInt();
        
        
        switch(choose) {
		case 1:
			System.out.println("addition of two numbers is : "+(num1+num2));
			break;
		case 2:
			System.out.println("substraction of two numbers is : "+(num1-num2));
			break;
		case 3:
			System.out.println("multiplication of two numbers is : "+(num1*num2));
			break;
		case 4:
			System.out.println("division of two numbers is : "+(num1/num2));
			break;
		default:
			System.out.println("invalid");
		
		}
}
	}

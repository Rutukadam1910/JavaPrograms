package com.cars;
import java.util.Scanner;


public class Operations2 {
			public static void getMahindra() {
				Scanner sc = new Scanner(System.in);
				System.out.println("choose your favorite car:" );
				System.out.println("1.Scorpio \n2.XUV700 ");		
				int num = sc.nextInt();
				Mahindra m = new Mahindra();
				switch(num) {
				case 1: 			
					m.getScorpio();	
					break;
				case 2: 			
					m.getXUV700();	
					break;		
				default:
					System.out.println("Invalid choice");
}
}
}
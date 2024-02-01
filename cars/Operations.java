package com.cars;
import java.util.Scanner;
public class Operations {
			public static void getTata() {
				Scanner sc = new Scanner(System.in);
				System.out.println("choose your favorite car:");
				System.out.println("1.altroz \n2.safari");
				int ch = sc.nextInt();
				Tata td = new Tata();
				switch(ch) {
				case 1:
					td.getAltrozInfo();
					break;
				case 2:
					td.getSafariInfo();
					break;
				default:
					System.out.println("invalid choice");
			}
}
}
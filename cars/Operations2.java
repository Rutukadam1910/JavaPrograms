package com.cars;
import java.util.Scanner;
public class Operations2 {
			public static void getToyata() {
				Scanner sc = new Scanner(System.in);
				System.out.println("choose your favorite car:");
				System.out.println("1.altroz \n2.safari");
				int ch = sc.nextInt();
				Toyata td1 = new Toyata();
				switch(ch) {
				case 1:
					td1.getAltrozInfo();
					break;
				case 2:
					td1.getSafariInfo();
					break;
				default:
					System.out.println("invalid choice");
			}
}
}
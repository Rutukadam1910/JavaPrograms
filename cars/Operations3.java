package com.cars;

import java.util.Scanner;

		public class Operations3 {
			public static void getMahindra() {
				Scanner sc = new Scanner(System.in);
				System.out.println("choose your favorite car:");
				System.out.println("1.altroz \n2.safari");
				int ch = sc.nextInt();
				Mahindra td2 = new Mahindra();
				switch(ch) {
				case 1:
					td2.getAltrozInfo();
					break;
				case 2:
					td2.getSafariInfo();
					break;
				default:
					System.out.println("invalid choice");
			}
}
}
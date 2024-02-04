package com.cars;

import java.util.Scanner;

		public class Operations3 {
			public static void getToyata() {
				Scanner sc = new Scanner(System.in);
				System.out.println("choose your favorite car:");
				System.out.println("1.Fortuner \n2.Harrier");
				int ch = sc.nextInt();
				Toyata td2 = new Toyata();
				switch(ch) {
				case 1:
					td2.getFortunerInfo();
					break;
				case 2:
					td2.getHarrierInfo();
					break;
				default:
					System.out.println("invalid choice");
			}
}
}
		
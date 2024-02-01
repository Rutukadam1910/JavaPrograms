package com.abstraction;

public class X6 extends Bmw{
	public static void main(String args[]) {
   	 X6 x2 = new X6();
 	     x2.getBmwDealers();
 	     x2.getBmw();
 	 	 x2.getMilage();
     	 x2.getColor();
     	 x2.getPrice();
     	 x2.getFeature();
     }
     
     
   public void getBmwDealers() {
			System.out.println("Bmw dealers");
		}

		
		public void getMilage() {
			System.out.println("8");
		}

	
		public void getColor() {
			System.out.println("black");
		}

	
		public void getPrice() {
			System.out.println("2 crore");
		}

		
		public void getFeature() {
			System.out.println("very fast speed");
		}
}

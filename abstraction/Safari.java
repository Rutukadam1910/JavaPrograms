package com.abstraction;

public class Safari extends Tata {
	public static void main(String args[]){
 	   Safari s1 = new Safari();
 	     s1.getTataDealers();
 	     s1.getTata();
 	 	 s1.getMilage();
     	 s1.getColor();
     	 s1.getPrice();
     	 s1.getFeature();
      }

		
		public void getTataDealers() {
			System.out.println("tata dealers");
		}

		
		public void getMilage() {
			System.out.println("20");
		}

	
		public void getColor() {
			System.out.println("White");
		}

	
		public void getPrice() {
			System.out.println("56 lakh");
		}

		
		public void getFeature() {
			System.out.println("Tough");
		}
}

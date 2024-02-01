package com.abstraction;

public class Swift extends Ms {
         public static void main(String args[]) {
        	 Swift s = new Swift();
        	 s.getMsDealers();
        	 s.getMs();
        	 s.getMilage();
        	 s.getColor();
        	 s.getPrice();
        	 s.getFeature();
         }

		
		public void getMsDealers() {
			System.out.println("Maruti Suzuki dealers");
		}

		
		public void getMilage() {
			System.out.println("10 ");
		}

	
		public void getColor() {
			System.out.println("White");
		}

	
		public void getPrice() {
			System.out.println("45 lakh");
		}

		
		public void getFeature() {
			System.out.println("Fast");
		}
}


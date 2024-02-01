package com.abstraction;

public class Baleno extends Ms {
	public static void main(String args[]) {
   	 Baleno b = new Baleno();
   	 b.getMsDealers();
   	 b.getMs();
   	 b.getMilage();
   	 b.getColor();
   	 b.getPrice();
   	 b.getFeature();
    }

	
	public void getMsDealers() {
		System.out.println("Maruti Suzuki dealers dealers");
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

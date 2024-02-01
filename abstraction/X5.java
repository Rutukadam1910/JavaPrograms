package com.abstraction;

public class X5 extends Bmw{
          public static void main(String args[]) {
        	 X5 x1 = new X5();
      	     x1.getBmwDealers();
      	     x1.getBmw();
      	 	 x1.getMilage();
          	 x1.getColor();
          	 x1.getPrice();
          	 x1.getFeature();
          }
          
          
        public void getBmwDealers() {
  			System.out.println("Bmw dealers");
  		}

  		
  		public void getMilage() {
  			System.out.println("9");
  		}

  	
  		public void getColor() {
  			System.out.println("black");
  		}

  	
  		public void getPrice() {
  			System.out.println("1 crore");
  		}

  		
  		public void getFeature() {
  			System.out.println("very fast speed");
  		}
}

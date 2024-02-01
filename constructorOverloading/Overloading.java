package com.constructorOverloading;

public class Overloading {
		
		  // constructor overloading : when we create object and call constructor then it will automatically call according to its type
		   Overloading (){
			   System.out.println("inside non parameterised constructor");
		   }
		   
		   Overloading(int a){
	    	   System.out.println("inside int parameterised constructor");
		   }

		   Overloading(String b){
	    	   System.out.println("inside string parameterised constructor");
	       }
			
		   
		   public static void main(String args[]) {
			Overloading p1 = new Overloading();
			Overloading p2 = new Overloading(10);
			Overloading p3 = new Overloading("RUTU");		
		   }		
	}



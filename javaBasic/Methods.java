package com.javaBasic;

public class Methods {
	     int a =10;
	     int b = 20;
	     
	    // not static : static keyword is not used
	    // we can not call non static method by using static method calling way we have to compulsory create object 
	    // we cannot call non static method by class name     
        // void return nothing 
		public void getAddition() {
			
			System.out.println("addition is:" +(a+b));
		}
		
		//for other than void we have to take return statement with datatype which we used	
		public void getSubstraction() {
			System.out.println("substraction is:" +(a-b));
		}
		
		public void getMultiplication() {
			System.out.println("multiplication is:" +(a*b));
		}
		
		public void getDivision() {
			System.out.println("division is:" +(a/b));
		}
		
		// static: static keyword is used
		// we can call static method by using non-static method calling way means by creating object we can call static method
        // when our method is static then we don't have to create object we can access method by classname.methodname 	 
		public static void getRemainder() {
             //we have to declare variables inside the method because in static we cannot access global variable	     
			 int a =10;
		     int b = 20;
			System.out.println("remainder is:" +(a%b));
		}
		
		
		public static void main (String args[]) {
			//Object Creation : classname objectname = new keyword constructor();
			// new keyword is used for memory allocation		
			Methods obj = new Methods();
			
			//accessing method by obejctname.methodname();		
			obj.getAddition();
			obj.getSubstraction();
			obj.getMultiplication();
			obj.getDivision();
			Methods.getRemainder();
		}
}

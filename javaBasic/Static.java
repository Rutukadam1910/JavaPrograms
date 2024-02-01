package com.javaBasic;

public class Static {
		//When there are main method and static block in one class 
		//Then first static block will execute and then main method will execute
         static {
        	 System.out.println("i am in static block");
         }
         public static void main(String args[]) {
        	 System.out.println("i am in main method");
         }
}

package com.javaBasic;
//If static and main method are in same class then first static will execute and then main method execute
//If static is called from another class then first main method will execute and then static will execute
public class R {
		public void method1() {
			// calling static block from another class by creating object of that class 
			// First this static block execute			
			S obj = new S();
		}
		
    		
		public static void main(String args[]) {
			R obj = new R();
			obj.method1();
			
			//after static block main method will execute 		
			System.out.println("Inside main method");
		}
}

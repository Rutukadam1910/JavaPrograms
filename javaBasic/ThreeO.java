package com.javaBasic;

public class ThreeO {
	public static void main(String args[]) {
		//calling static ,non static and constructor block by using object in another class with same package
		//execution : 1-> static   
					//2-> non static
					//3-> constructor
		
		//static block will only execute when we create first object after that it will not execute
		//non static and constructor will execute upto number of times we create object
		Three obj = new Three();
		Three obj2 = new Three();
		
		
	}
}

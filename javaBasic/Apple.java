package com.javaBasic;

public class Apple {
	//constructor : name should be same as class name
	//constructor can have access specifier but don't have retrun type 
	//If it has return type then it is called as method
	public Apple(){
		System.out.println("constructor");
	}
	
	public static void main(String args[]) {
		Apple obj = new Apple();
		
	}
}

package com.a;
import com.javaBasic.A;

public class abc {
	public static void main(String args) {
		//calling non static method form another package	
		A obj = new A();
		obj.method1();
		//calling static method form another package
		A.method2();
	}
}

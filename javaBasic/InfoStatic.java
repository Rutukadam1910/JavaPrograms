//we can give same class name to file which are present at different package but cannot give same classname for file which are present at same  package
// static variable ----- not static method  -----access
// non static variable ----- not static method  -----access
// non static variable -----  static method  -----error
// static variable -----  static method  -----access

package com.javaBasic;

public class InfoStatic {
    static int a = 10;
	
	public static void m1() {
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		InfoStatic obj = new InfoStatic();
		obj.m1();
	}
}

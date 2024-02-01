package com.polymor;
// overloading : also called as compile time polymorphism
//               here we have five function  with same name but different parameters 
//               compiler will automatically assign parameters based upon parameters type
public class First {
	
	 public void m1() {
		 System.out.println("no parameters");
	 }
	 
	 public void m1(int a, int b) {
		 System.out.println("int a and int b paramenters");
	 }
	 
	 public void m1(int a) {
		 System.out.println("int parameters");
	 }
	 
	 public void m1(float a) {
		 System.out.println("float parameters");
	 }
	 
	 public void m1(String a) {
		 System.out.println("string  parameters");
	 }
	 
     public static void main(String args[]) {
    	   First ft = new First();
    	   ft.m1();
    	   ft.m1(10,20);
    	   ft.m1(10);
    	   ft.m1(10.03f);
    	   ft.m1("Rutu");
     }
}

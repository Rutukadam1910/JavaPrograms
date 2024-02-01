package com.javaBasic;

public class B {
      public static void main(String args[]) {
    	  //calling non static method from same package but in different class
    	  A obj = new A();
    	  obj.method1();
    	  //calling static method from same package but in different class
    	  A.method2();
      }
}

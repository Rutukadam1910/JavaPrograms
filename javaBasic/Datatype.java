package com.javaBasic;

public class Datatype {
	public static void main(String args[]) {
	//Implicit type casting: we can convert small data type to large data type	
	byte a =10;
	int b = a;
	System.out.println(b);
	
	//explicit type casting: we can convert large data type to small data type	
    int d = 140;
    byte e = (byte)d;
    short f = 100;
    float g = 10.23f;
    double h= 9.21;
    boolean k = false;
    char i = 84;
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
    System.out.println(k);
    //charset value of t is 84 which is already defined
    System.out.println(i); 
	}
}


package com.javaBasic;

public class Operators {
	public static void main(String args[]) {
		//assignment operator 
		int a = 20;
		int b = 10;
		
        //arithmetic operator
		int c = a+b;
		int d = a-b;
		int e = a/b;
		int f = a*b;
		int g = a%b; //remainder
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
        //post increment		
		//assigning h to i first then i=10 then increment value of h then h=11	
		int h = 10;
		int i = h++;
		System.out.println(h);
		System.out.println(i);
		
        //post decrement	
		//assigning j to k first then k=10 then decrement value of j then j=9	
		int j = 10;
		int k = j--;
		System.out.println(j);
		System.out.println(k);
		
		
		int l = j--+k++;
		// j=8 and k =11
        // l= j+k = 19	
		System.out.println(l);
		
        //pre increment		
        //increment of m first then m=11 then assign value to n then n=11	
		int m = 10;
		int n = ++m;
		System.out.println(m);
		System.out.println(n);
		
		//String concatenation	
        //before declaration of string addition will be performed because it is considered as integer but after string it will consider 10 and 20 as string	
		System.out.println(10+20+30+"abc"+"wyx"+10+20);
		
		
        //Bit wise operator
		System.out.println(true&false);
		System.out.println(false|true);
		
		//short circuit operator
		//here we check first value and then give answer based upon that and second value is optional
		//but in bitwise we check both values and then take decision	
		System.out.println(true&&false);
		System.out.println(false||true);
		
	}
}

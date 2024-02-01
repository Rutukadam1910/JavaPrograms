package com.javaBasic;

public class Loop {
	public static void main(String args[]) {
	System.out.println("first program");
	int a=10;
	while(a<20) {
		System.out.println(a);
		a++;
	}
	
    // all conditions are true so infinite loop
//	int a=10;
//	while(true) {
//		System.out.println(a);
//		a++;
//	}
	
//	//false error	will occur for false
//	int a=10;
//	while(false) {
//		System.out.println(a);
//		a++;
//	}
	
	System.out.println("second program");
	boolean b = true;
	int i =10;
	while(i<20) {
		if(i==15) {
			
			b = false;
		}
		else {
			System.out.println(i);
			i++;
		}
		
	}
	
	
	

	
}
}

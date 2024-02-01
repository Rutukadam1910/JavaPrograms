package com.javaBasic;
// it will skip 15 because if condition will be false
public class Loopinfo {
	public static void main(String args[]) {
		System.out.println("third program");
		boolean c = true;
		int j =10;
		while(j<20) {
			if(j==15) {
				
				c = false;
			}
			else {
				System.out.println(j);
				
			}
			j++;
		}
    //while (d) execute till condition of i is true 	
		System.out.println("fourth program");
		boolean d = true;
		int i =10;
		while(d) {
			if(i==15) {
				
				d = false;
			}
			else {
				System.out.println(i);
				
			}
			i++;
		}
	    
	}
}
	
	
		
		
		
	


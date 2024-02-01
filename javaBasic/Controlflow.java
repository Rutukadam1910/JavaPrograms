package com.javaBasic;

public class Controlflow {
	public static void main(String args[]) {
		// if else statement		
		// output is inside if because if first condition is true then it will not check after that
		int a = 10;
		if(a==10) {
			System.out.println("inside if");
		}
		else if(a==10) {
			System.out.println("inside elseif");
		}
		else {
			System.out.println();
		}
		
		
		// output is inside if	
				int b = 10;
				if(b==10) 
					System.out.println("inside if");
				
				else if(b<20) 
					System.out.println("inside elseif");
				
				else 
					System.out.println("inside else");
				
				
		// output is inside if		
				int c = 10;
				if(c--==10)
					System.out.println("inside if");
						
				else if(c++==10) 
					System.out.println("inside elseif");
						
				else 
					System.out.println("inside else");
				
				
		//	switch statement
                // if we give break then after satisfying first condition second will not executed				
				int d = 1;
				switch(d) {
				case 1:
					System.out.println("inside case 1");
					break;
				case 2:
					System.out.println("inside case 2");
					break;
				default:
					System.out.println("inside default");
				
				}
				
				// if any of the condition non satisfies then default will execute				
				int e = 10;
				switch(e) {
				case 1:
					System.out.println("inside case 1");
					break;
				case 2:
					System.out.println("inside case 2");
					break;
				default:
					System.out.println("inside default");
					
				}
				
				
				//if we don't give break then other case will execute 			
				int f = 1;
				switch(f) {
				case 1:
					System.out.println("inside case 1");
				case 2:
					System.out.println("inside case 2");
					break;
				default:
					System.out.println("inside default");
				}
				
				
				// if condition is not true for any of the cases and also break is not there so default will execute			
				int g = 10;
				switch(10) {
				case 1:
					System.out.println("inside case 1");
				
				case 2:
					System.out.println("inside case 2");
					
				default:
					System.out.println("inside default");
				}
				
	}
}

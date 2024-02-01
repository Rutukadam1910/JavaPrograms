package com.javaBasic;

public class Ns {
	
		{
			System.out.println("indside non static block");
		}
		
		public void m1(){
			 Ns obj = new Ns();
			 System.out.println("m1");	
		}
		public static void main(String args){
			 Ns obj = new Ns();
			 obj.m1();
		}	
		
	}



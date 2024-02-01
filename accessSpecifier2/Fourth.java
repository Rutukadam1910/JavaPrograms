package com.accessSpecifier2;

import com.accessSpecifier1.First;

public class Fourth extends First{
	
	public static void main(String args[]) {
		Fourth ft = new Fourth();
		
		//System.out.println("private: " +ft.pvt);
		
		//System.out.println("default: " +ft.def);
		
		System.out.println("public: " +ft.pb);
		
        //here we can access protected by creating object of child class and extending it with parent class 		
		System.out.println("protected: " +ft.pt);
		
	}
}

package com.accessSpecifier2;

import com.accessSpecifier1.First;

public class Third {
	 
		public static void main(String args[]) {
			First ft = new First();
			
			//private is not accessible in another class of another package
			//System.out.println("private: " +ft.pvt);
			
			//default is not accessible in another class of another package
			//System.out.println("default: " +ft.def);
			
			System.out.println("public: " +ft.pb);
			
			//protected is not accessible in another class of another package
			//System.out.println("protected: " +ft.pt);
			
		}
}

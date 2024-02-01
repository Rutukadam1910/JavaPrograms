package com.accessSpecifier1;

public class Second {
	
		public static void main(String args[]) {
			First ft = new First();
			
			//private is not accessible in another class of same package
			//System.out.println("private: " +ft.pvt);
			
			System.out.println("default: " +ft.def);
			
			System.out.println("public: " +ft.pb);
			
			System.out.println("protected: " +ft.pt);
			
		}
}

// Access specifier :   private : accessible within only class
                      //default : accessible within classes of same package
                      //public : accessible within whole project
                      //protected : accessible within different packages also for that we have extend that class with another package class then create object of child class
package com.accessSpecifier1;

public class First {
	
	    private String pvt = "private";
	    String def = "default";
	    public String pb = "public";
	    protected String pt = "protected";
		public static void main(String args[]) {
			First ft = new First();
			System.out.println("private: " +ft.pvt);
			System.out.println("default: " +ft.def);
			System.out.println("public: " +ft.pb);
			System.out.println("protected: " +ft.pt);
			
		}
}

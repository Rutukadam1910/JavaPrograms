package com.abstraction;
// abstraction can be implemented in two ways 
// 1. abstract class (0 to 100% implementation)
// 2. interface (100% implementation)
// abstraction means showing user important info
// abstract keyword should be use before class name
// we cannot create object of abstract class because it has unimplemented methods
public abstract class Abstraction {
	// method is implemented
	public void classname() {
		System.out.println("btech");
	}
	
	// abstract keyword should be use before method name 
    // method should be unimplemented to use abstract
    //void compulsory
	public abstract void getDep();		
}

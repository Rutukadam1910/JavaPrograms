package com.polymor;
// Runtime polymorphism
// overriding : inheritance should be there compulsory 
// function name should be same ,parameters should same , also parents name should be same
// when child inherits properties of parent then and function name is same then child overrides parent 
// we cannot create same function in same class in same package 
// constructor cannot be override because parent constructor name is parent() and child constructor name is child() here name is different

public class Buisness {
	public static void main(String args[]) {
		Abhishek ab = new Abhishek();
		ab.getOranges();	
	}
}

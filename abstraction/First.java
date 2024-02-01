package com.abstraction;
// if we want to access abstract method then use abstract keyword before classname
public class First extends Abstraction {
		// override abstract method in class abstraction to implement     
         public void getDep(){
        	  System.out.println("CSE");
          }
         
         public static void main(String args[]){
     		First dep = new First();
     		dep.getDep();
     		dep.classname();
     		
     	}
}

package com.abstraction;
import java.util.Scanner;
public class Operations {
             public static void getAltroz() {
            	 Altroz a = new Altroz();
            	 a.getTataDealers();
        	     a.getTata();
        	 	 a.getMilage();
            	 a.getColor();
            	 a.getPrice();
            	 a.getFeature();
             }
             
             public static void getSafari() {
            	 Safari s1 = new Safari();
            	 s1.getTataDealers();
        	     s1.getTata();
        	 	 s1.getMilage();
            	 s1.getColor();
            	 s1.getPrice();
            	 s1.getFeature();
             }
             
             
             public static void getBaleno() {
            	 Baleno b = new Baleno();
            	 b.getMsDealers();
        	     b.getMs();
        	 	 b.getMilage();
            	 b.getColor();
            	 b.getPrice();
            	 b.getFeature();
             }
             
             
             public static void getSwift() {
            	 Swift s = new Swift();
            	 s.getMsDealers();
        	     s.getMs();
        	 	 s.getMilage();
            	 s.getColor();
            	 s.getPrice();
            	 s.getFeature();
             }
             
             
             public static void getX5(){
            	 X5 x1 = new X5();
            	 x1.getBmwDealers();
        	     x1.getBmw();
        	 	 x1.getMilage();
            	 x1.getColor();
            	 x1.getPrice();
            	 x1.getFeature();
             }
             
             
             
             public static void getX6() {
            	 X6 x2 = new X6();
            	 x2.getBmwDealers();
        	     x2.getBmw();
        	 	 x2.getMilage();
            	 x2.getColor();
            	 x2.getPrice();
            	 x2.getFeature();
          
             }	 
             
             
             
             
             
     		
            	 
            	 
          public static void main(String args[]) {
        	  int count = 0;
        	  while(count<3) {
        	  System.out.println( );
        	  System.out.println("welcome to car world");
        	  System.out.println("choose your favorite Company:");
        	  System.out.println("press 1 for Maruti Suzuki \npress 2 for Tata  \npress 3 for Bmw ");
        	  Scanner sc = new Scanner(System.in);
        	  int ch = sc.nextInt();
        	  switch(ch){
        	  case 1:
        		  System.out.println("press 1 for Swift \npress 2 for Baleno ");
        		  int n1 = sc.nextInt();
        		  if(n1==1) {
        			  getSwift();
        		  }
        		  else {
        			  getBaleno();
        		  }
        		  break;
        		  
        	  case 2:
        		  System.out.println("press 1 for Altroz \npress 2 for Safari ");
        		  int n2 = sc.nextInt();
        		  if(n2==1) {
        			  getAltroz();
        		  }
        		  else {
        			  getSafari();
        		  }
        		  break;
        	  case 3:
        		  System.out.println("press 1 for X5 \npress 2 for X6 ");
        		  int n3 = sc.nextInt();
        		  if(n3==1) {
        			  getX5();
        		  }
        		  else {
        			  getX6();
        		  }
        		  break;
        	  default:
        		  System.out.println("Invalid Choice");	  
        	  }
        	  count++;
        	  }
          }
             
          } 
                   


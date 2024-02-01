package com.inher;
// multilevel inheritance : Prashant -> Abhishek -> Yash
// prashant have oranges in basket
// then Prashant give it to Abhishek and Abhishek add Mangoes to it
// Prashant is parent of Abhishek and abhishek inherit all properties of prashant
// then Abhishek give it to Yash and yash add cherries to it
// Abhishek and Prashant is parent of Yash and Yash inherit all properties of Abhishek
// but Yash only know  Abhishek is parent not about Prashant

public class NeedyPerson {
	public static void main(String args[]) {
		Yash yd = new Yash();
		yd.setOranges();
		yd.setMangoes();
		yd.setCherries();
		
		Abhishek ab = new Abhishek();
		ab.setOranges();
		ab.setMangoes();
	  //ab.setCherries();
		
		Prashant pr = new Prashant();
		pr.setOranges();
       //pr.setMangoes();
	   //pr.setCherries();
	}
}

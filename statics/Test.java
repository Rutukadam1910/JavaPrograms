package com.statics;
// here with static method we cannot do overriding because here we call specifically each method 
public class Test {
		public static void main(String args[]) {
			Second sc = new Second();
			First.m1();
			Second.m1();
		}
}

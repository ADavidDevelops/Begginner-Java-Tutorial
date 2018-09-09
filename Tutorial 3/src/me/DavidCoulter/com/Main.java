package me.DavidCoulter.com;

public class Main {
	public static void main(String[] args) {
		//Common
		String myString = "Hello World"; //a String must have a set of double "" around it.
		int myInt = 685; //a int is a number with no decimal value you.
		double myDouble = 5.5; //a double is a number with a decimal value.
		char myChar = 'H'; //a char is a single character and must be contained in single ''.
		
		//Less Common
		long myLong = 586745634; //a long can contain a higher number then a int.
		short myShort = 5; //a short contains smaller numbers.
		float myFloat = 58.4642346f; //a float is a floating point number and has half the precision of a double, but uses less power/processor to access
		
		System.out.println(myString);
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);
		System.out.println(myLong);
		System.out.println(myShort);
		System.out.println(myFloat);
	}
}

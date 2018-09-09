package me.DavidCoulter.com;

public class Main {
	public static void main(String[] args){
		String myString = "Hello World"; //a String must have a set of double "" around it.
		int myInt = 685; //a int is a number with no decimal value you.
		double myDouble = 5.5; //a double is a number with a decimal value.
		/*
		 [--- Operator Start ---]
		[ +   Additive operator (also used for String concatenation) ]
		[ -   Subtraction operator ]
		[ *   Multiplication operator ]
		[ /   Division operator ]
		[ %   Remainder operator ]
		[ ==      Equal to ]
		[ !=      Not equal to ]
		[ >       Greater than ]
		[ >=      Greater than or equal to ]
		[ <       Less than ]
		[ <=      Less than or equal to ]
		[ &&      Conditional-AND ]
		[ ||      Conditional-OR ]
		 [--- Operator End ---]
		 Don't worry if you don't understand to much, you won't need to remember them all you'll learn as you go
		 */
		System.out.println(myString + " David"); //Anything within double "" count as a string, using a Int or point value (Like double) results in error
		System.out.println(myInt + 5); //Adds any whole number, using a String or point value (Like double) results in error
		System.out.println(myDouble + 0.52); //Adds any double value, using a String or whole number results in error (Adding a whole to a double example = 1.0)
		//You may also use another variable with any of these! Example below
		String myName = "Rick";
		int secondInt = 73;
		double secondDouble = 59.2;
		System.out.println(myString + myName);
		System.out.println(myInt + secondInt);
		System.out.println(myDouble + secondDouble);
	}
}

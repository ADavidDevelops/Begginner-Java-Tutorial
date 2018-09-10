package me.DavidCoulter.com;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		/*
		 * Creates an object with the type Scanner named scan (Same as we could do String myString = "Whatever", But this object doesn't store a string value)
		 * sets the object known as "scan" equal to a new Scanner (Hints the keyword new,)
		 * the parameter (Anything between the round brackets) it takes is a input stream,
		 * same as we can do System.out for the output stream, we also can get the input stream via system.in (As seem above)
		 */
		System.out.println("Whats your name?"); //Using System out to ask for users name
		String name = scan.nextLine();
		/*
		 * Declares a new variable (String) named message, and says its equal to scan's (Our Scanner) next line,
		 * so the next input scan gets will be set to the string, but when the method (A Command an object has) is called, anything in it runs,
		 * in this case when we run "scan.nextline();" it is telling java we want to accept a line of user input,
		 * this will allow the user to type into console a string (A String can be numbers but will be stored as a string and remove any mathematic properties
		 */
		System.out.println("Nice to meat you " + name); //Printing out users name to our console,
		scan.close(); //Closing the scanner, this avoid memory leaks that will eat up cpu and ram usage, while running
	}
}

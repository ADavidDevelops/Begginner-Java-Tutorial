package me.DavidCoulter.com;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		/*
		 * ArrayLists is a container that holds other objects, it could hold for example 20 differnt strings each accessable by a number (Starting from 0)
		 */
		ArrayList<String> array = new ArrayList<>(); //Here we are defining a ArrayList (Of course we use ArrayList<OBJECT TYPE> (arrayName) = new ArrayList<>();)
		/*
		 * First we define what we are creating (ArrayList in this case)
		 * Second we tell it what object type we want to store, This could be a String, int, double, any object
		 * third we tell it what name we want to give it in order to access it
		 * forth we are saying it is a new array we leave this ones object type blank as we defined it eariler (Of course you could fill it but its not needed)
		 * 
		 * Now adding to an array is very simple, we simply grab the array by its ditifier (the name we gave it) and use the add function we has
		 */
		
		array.add("Whatever String we want!"); //Here we can add whatever we want depending on data type we choose at the beggining (We picked a string so we can add a string to it)
		//Lets add a few more
		array.add("This is the second object we added to an array");
		String myString = "We can use strings in it like functions we learned about before!";
		array.add(myString);
		/*
		 * Now ArrayLists have many methods in them to help us, Like for example we can get a string by its id
		 * Java indexes starting from 0 (As most languages do) so for example, the first string we added to our array would be 0, the second would be 1 and so on
		 * This is how you would get something from an array
		 */
		System.out.println(array.get(2)); //the get method wants the index we want to get, so if we gave it index 2 what would it return? (Remember, the first one we added is 0)
		/*
		 * [---------------------------- ( Challenge ) ----------------------------]
		 * Try to get all the strings in our array and print them to the console! (No worry if you can't)
		 * Note: This will take a for loop
		 * [---------------------------- ( Challenge ) ----------------------------]
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * [---------------------------- ( Solution ) ----------------------------]
		 * 
		 * Please try the challenge yourself, Looking at my code won't help you learn
		 * if you can't do it yourself feel free to go below as this is a little hard
		 * 
		 * [---------------------------- ( Solution ) ----------------------------]
		 * 
		 */
		
		for(int i = 0; i < array.size(); i++) { //the size method returns the size of the array, every time we add an object it increases
			System.out.println(array.get(i)); //Now because i started at 0 we can easily use it to get the first object and then the second as it loops and increases
		}
	}
}

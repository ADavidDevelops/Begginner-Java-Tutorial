package me.DavidCoulter.com;

public class Main {
	public static void main(String[] args){
		/*
		 * Methods: A method is the behavior of the object. 
		 * This is where the logic is written and where states/data is manipulated.
		 * 
		 * A Method is very simple yet very useful, a method is something that would be called apon,
		 * lets say we wanted to add 5 to a number and print its total value
		 * doing that with our currect knowlage would look like this
		 */
		int num = 0;
		num = num + 5; //This may seem werid, but really we are just saying num is whatever value num is right now, plus 5,
		System.out.println("Current value > " + num);
		
		/*
		 * Now if we want to do this 2, 5, or even more times, we would have to rewrite it or copy and paste it?
		 * that would make this simple 2 line job take up 20+ lines? Thats not right, so we have methods,
		 * methods/functions are things we can create to run code, now we have never left our main method,
		 * as all code needs to be written in a method somewhere, so we are going to make a new one
		 */
		
		
		addFive(num); //This runs all the code in addFive function until we return
		sendMessage(num); //This runs all the code in sendmessage function until it reaches the end
		addFive(num);
		sendMessage(num);
		addFive(num);
		sendMessage(num);
		
		//Now this may seem like it takes the same amount but you can merge these functions or have them do way more, without functions your code will always end up messy
	}
	
	/*
	 * Creating a method is very simple
	 * first we can use the public keyword, as we want this to be accessed anywhere,
	 * second, void means it returns nothing, so when we call it. it runs the code inside and thats it,
	 * third is the function name, proper naming is camelCase, starting the first word with lower letter and every word after starts with a capital letter
	 * Now 4th we have parameters, they are what information we have to give the function to run, in this case, we want a integer, because we need to know what number to add too
	 * 
	 * *These are only static for testing, once i teach you OOP i can show you how to avoid static*
	 */
	public static void sendMessage(int number) {
		System.out.println("Your numbers value is " + number);
		//Now, Number is equal to whatever int value we gave it, if we give it 59 then it will say 59 if we give it 25 it will say as such and tell us 25, number is equal to the parameter we used when calling it (As seen above)
	}
	/*
	 * Now, we have that function that just prints the message with the number we gave it, but what about adding 5?
	 * an example of this we would need to return a int, so instead of "void" (witch means we what no return) we would use the type of value we want to return, like int for a number or string for a string of charaters
	 * 
	 */
	public static int addFive(int mynumber) {
		mynumber = mynumber + 5;
		return mynumber; //Here we can return the value, now any function that isn't void has to return, so if we call this function we will add 5 and then return the number we gave + 5, as seen above
	}
}

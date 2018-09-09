package me.DavidCoulter.com;

public class Main {
	public static void main(String[] args){
		/*
		 A for loop is almost self explanatory, same as the if statement's we can create a loop that will run for a controllable amount of times
		 Its easy to see and learn (Make sure to do it yourself) then explain, example below
		 */
		for(int loops = 0; loops < 10; loops++) {
			/*
			Okay so, the first part we define the int loops, what we use to count the amount of loops,
			the second part is like an if statement, its the conditional statement, to check if we should run the loop again,
			if it passes, we can run the code in the loop,
			the third part is us adding 1 to the loops, ++ is the same as doing +1 just easier and cleaner, do what you prefer but for any public code, ++ is common
			if we don't add more to the amount of loops, it will run forever and crash, repeatedly doing the code as it would never be over 10 to fail the conditional part of it
			*/
			System.out.println("We are at number " + loops); //Here we are not adding the number to the string (Because you can't add letters and numbers...) we are appending the number into the string, so we will have a string value of it,
		}
		System.out.println("This won't run right away!"); //Until the for loop finishes no code past it will run! only code inside it,
		//We can also use variables in the loop example
		int loopamount = 5;
		for(int loops = 0; loops < loopamount; loops++) { //Remember? Because loopamount is just storing the value 5!
			System.out.println("Loading...");
		}
		
		/*
		 * [---------------------------- ( Challenge ) ----------------------------]
		 *  If you wish not to take the challenge be sure you have a good understanding of if statements and for loops,
		 *  If you think you might not, go ahead and take this challenge to increase knowledge, and verify understanding,
		 *  
		 *  1) Create a int (Named what you wish) and give it a value between 1-1000
		 *  2) Create a if/else if statement, if the number is under 200 do  step 3.1, if its under 500 but over 200, do 3.2, if its anything else do 3
		 *  3) Tell the user the number is to high
		 *  3.1) For (Whatever number they choose) times tell them to get a life
		 *  3.2) For (Whatever number they choose / 3) times, tell them they win
		 *  Optional 4) If the users total loops is over (Or equal to) 201, send them a thank you message, if its less than that, give them a better luck next time message
		 *  
		 *  Extra points if you solve this with no help and under 20 lines!
		 *  [---------------------------- ( Challenge ) ----------------------------]
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * [---------------------------- ( Solution ) ----------------------------]
		 * 
		 * Please try the challenge yourself, Looking at my code won't help you learn
		 * if you can't do it yourself feel free to go below but honestly,
		 * you might want to go back to wherever your having trouble and rewatch it,
		 * if i failed to explain something just comment below
		 * 
		 * [---------------------------- ( Solution ) ----------------------------]
		 * 
		 */
		
		
		
		
		int number = 371; //Our Number we can pick
		int totalLoops = 0; //The total loops so far
		if(number <= 200) { //Here we verify if we are lower or higher than 200
			for(int i = 0; i < number; i++) { //Now if we are less then 200 (Or equal to) we will run the code below as long as i (The amount of loops) is less than the number
			System.out.println("Get a life!"); //Motivation
			totalLoops = i; //Setting totalloops to i, because we need to get total loops at the end, we need to store its value somewhere else
			}
		} else if (number <= 500) { //Once again we check if its lower than or equal to 500, of course if it isn't we have a fall-back below
			for(int i = 0; i < number / 3; i++) { //See, You can do math IN a for loop (or if statement!) here we are saying we want to tell them they won, while i (Number of loops) is under whatever number they picked divided by 3
				System.out.println("You won!");
				totalLoops = i; //Same as before we will need to be able to access this either way
			}
		} else { //If all else fails, we blame them and say the numbers out of range
			System.out.println("To High number!");
		}
		
		if(totalLoops >= 201) { //Here we do the bonus challenge just checking if total loop is over 201, pretty easy by now right?
			System.out.println("YOU'RE THE TOP WINNER");
		} else {
			System.out.println("Better luck next time");
		}
	}
}

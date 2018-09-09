package me.DavidCoulter.com;

public class Main {
	public static void main(String[] args){
		String myString = "Yes"; //Simple string storing value "Yes"
		boolean myBool = true; //Simple Boolean with true value
		int myInt = 5; //Simple integer value
		//an if statement lets us use our Conditional operators, like ==, !=, >=, etc
		if(myBool == true){ //== is equal too,
		//Pretty simple right? if mybool is true we do any code within the brackets (PS: {} are brackets)
			System.out.println("It was true!");
		}
		//Now we can also compare strings or an int like this
		if(myInt <= 5) { //<= is less than or equal too,
			System.out.println("myInt is less or equal to 5!");
		}
		//Now you may thing something like myString == "Yes" would be right, and that works but what about with yes with no capital y? there is a cool feature all strings have, look below for usage
		if(myString.equalsIgnoreCase("yes")) {
			System.out.println("myString is equal to yes!");
		}
		//You can also check if is the opposite of something by using !=,
		if(myInt != 79) {
			System.out.println("It Doesn't equal the number above!");
		}
		//We can do the same with strings with the !, just do it before the equal check example below
		if(!myString.equalsIgnoreCase("yes")) {
			System.out.println("We won't see this message");
		} else {
			/*
			An else statement comes anywhere after a if (or else if) statement, its a fall-back, an else statement
			will run any time the if statement (Or else if's) don't pass,
			*/
			System.out.println("Our if didn't  pass so we see this!");
		}
		//We also have if else statements, a if else lets you check a different condition, example
		if(myInt == 5) {
			System.out.println("Its 5!");
		} else if(myInt == 6) { //Simple as that, All we do is attach a else if at the ending bracket, we can have them go on forever
			System.out.println("Its 6!");
		} else if(myInt < 5) { //Now we check if its less than 5,
			System.out.println("So, Its less than 5?");
		} else { //If none of the above meet our requirements, else will run, only if non pass, also if 1 of them pass all the others don't run
			System.out.println("I give up!");
		}
		/*
		Now you may ask, why would i use else if, when i can just do a lot of ifs right? well first,
		you wouldn't be able to give a general fall-back without rewriting (Or copy pasting) the else statement,
		that would become a big mess and a lot of work to change 1 line,
		second, if one of the if statements (Out of the lets say 4 you made instead of 4 if else's) passes, all the others will still run
		This will use unneeded processor, while it would only use a little, its also bad practice and very ugly, here is a example of clean vs messy (Messy code is sometimes known as spaghetti code)
		*/
		int myAge = 2;
		if(myAge <= 18) {
			System.out.println("Get to high school!");
		} else {
			System.out.println("To work you go!");
		}
		if(myAge <= 3) {
			System.out.println("Pre-school time!");
		} else {
			System.out.println("To work you go!");
		}
		if(myAge <= 14) {
			System.out.println("Good luck at school!");
		} else {
			System.out.println("To work you go!");
		}
		/*
		See, now all of these will run, we don't want that do we? we want it to find the right age and send THAT message
		Now, we could do something like if(myAge >= 14 && myAge <= 17) Remember && means AND || means OR, but we still have a lot of extra code (The else statements)
		What if each else statement was 4 lines long? thats an extra 12 lines, That seems small but, that small thing 10 times is a lot of extra code/processor,
		here is the clean code of it
		*/
		if(myAge <= 3) { //We check if its 3 or under, if it isn't, now we know its over 3, and won't need the pre-school message,
			System.out.println("Pre-school time!");
		} else if(myAge <= 14) { //Now we do the same thing with 14, we know its over 3, so if its equal to or under 14, we are sending them good luck at school
			System.out.println("Good luck at school!");
		} else if(myAge <= 18) { //Now once more, if its equal to 18 or under, we give them the high school message
			System.out.println("Get to high school!");
		} else { //Now if NONE of them work, we can send them a work message, because we know they have to be over 18 now,
			System.out.println("To work you go!");
		}
		
		//The messy code (Spaghetti code) is 16 lines while our cleaned one, runs on only 8, also its much easier to read, faster, and we don't have to add more && (And) checks to make it work,
	}
}

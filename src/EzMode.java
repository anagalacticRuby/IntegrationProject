import java.util.Scanner;

public class EzMode {
	
	public static void Eazy(Scanner peazy) {
		//Eazy is the header, with peazy as the parameter.
		System.out.println("We'll go eazy on you since you're new to the program.");
		System.out.println("The following questions will help you with character creation."); // These lines tell the user what is going on
		System.out.println("1.Please enter your Character's name:"); //First Question
	
		
		String charName = peazy.nextLine();
		if (charName.equalsIgnoreCase("Bean")) {
			//No semicolons for if statements
	//The .equalsIgnoreCase method tells the code to accept what is inside of the ()'s
			//But it will accept the string regardless of the letters' case.
	//So this means this statement will accept Bean or bean and then proceed with the if statement.
			System.out.println("You must really think you're clever, huh.");
			System.out.println("Try rolling a 100-sided dice.");
		//An easter egg message that directs users to the dice rolling method.
		}
		
		System.out.println("2." + charName +"'s Gender? Accepted values: (M/F/O)");
		char charGender = peazy.findInLine(".").charAt(0); 
		//This is a char because it doesn't need to be anything more
		peazy.nextLine();
		System.out.println("3. What is " + charName + "'s Race?");
		String charRace = peazy.nextLine();
		//For some reason it skips this input area?
		
		System.out.println("4. How tall is " + charName + "? (Assume units are in feet)");
		double charHeight = peazy.nextDouble(); //This is a double because you can have decimal places of feet/meters
		//The above statement returns an error if the user inputs anything but a number
		peazy.nextLine();
		System.out.println("5. Where does " + charName + " prefer to be in the heat of battle?");
		String charPosition = peazy.nextLine(); 
		while (charPosition.isEmpty() ) {
			//The .isEmpty() method returns 'true' if the string attached is empty.
	//In other words, this while loop prevents the user from proceeding until they input something.
			//Later I will add while loops to all of the input spots to ensure the user inputs something.
			charPosition = peazy.nextLine();
		}
			
		System.out.println("6. Does " + charName + " practice magic?");
		String charMagic = peazy.nextLine();
		if (charMagic.equalsIgnoreCase("yes")) {
			System.out.println("6b. What kind(s) of magic?");
			String charMagicKind = peazy.nextLine();
		}
		
		System.out.println(charName + "_" + charGender); //Replace this with a table that prints all of the user's inputs
		//peazy.close();
	}
}

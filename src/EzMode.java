import java.util.Scanner;

public class EzMode {
	public static void Eazy() {
		System.out.println("We'll go eazy on you since you're new to the program.");
		System.out.println("The following questions will help you with character creation."); // These lines tell the user what is going on
		System.out.println("1.Please enter your Character's name:"); //First Question
		Scanner peazy = new Scanner(System.in);
		
		String charName = peazy.nextLine();
		if (charName.equals("Bean") || (charName.equals("bean")) ) ; {
			System.out.println("You must really think you're clever, huh.");
			System.out.println("Try rolling a 100-sided dice.");
		}
		
		
		System.out.println("2." + charName +"'s Gender? Accepted values: (M/F/O)");
		char charGender = peazy.findInLine(".").charAt(0); //This is a char because it doesn't need to be anything more
		
		
		System.out.println("3. What is " + charName + "'s Race?");
		String charRace = peazy.nextLine();
		//For some reason it skips this input area?
		
		
		System.out.println("4. How tall is" + charName + "? (Assume units are in feet)");
		double charHeight = peazy.nextDouble(); //This is a double because you can have decimal places of feet/meters
		//The above statement returns an error if the user inputs anything but a number
		System.out.println("5. Where does " + charName + "prefer to be in the heat of battle?");
		String charPosition = peazy.nextLine(); 
		
		System.out.println("5. Does " + charName + " practice magic?");
		String charMagic = peazy.nextLine();
		if (charMagic.equals("yes") || (charMagic.equals("Yes") ) );{
			System.out.println("5b. What kind(s) of magic?");
			String charMagicKind = peazy.nextLine();
		}
		
		System.out.println();
		System.out.println("");
		
		
		System.out.println(charName + "_" + charGender); //Replace this with a table that prints all of the user's inputs
		peazy.close();
	}
}

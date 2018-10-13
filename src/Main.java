//Nicholas Hansen
//This program will be made to help people with DnD character sheets, dice rolls, and encounter simulations

//import java.util.Random;
 import java.util.Random;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* List of Java Data Types (Primitive):
		 * byte: An 8-bit signed two's complement integer. It has a range of -128 to 127 (inclusive).
		 * It is useful for saving memory in large arrays where the memory savings actually matters.
		 * They can also be used in place of int where the limited range of possible values helps keep the code more tame. 
		 * A variable's limited range may also be utilized as a means of documentation.
		 * A byte has a default value of 0 for fields.
		 * 
		 * short: A 16-bit signed two's complement integer, which is larger than a byte. It has a range of -2^31 to (2^31)-1.
		 * As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.
		 * A short has a default value of 0 for fields.
		 * 
 * int: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -2^31 and a maximum value of 2^(31)-1.
 *In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1.  An int has a default value of 0 for fields.
 *Use the Integer class to use int data type as an unsigned integer.
		 * 
		 * long: The long data type is a 64-bit two's complement integer.
		 * The signed long has a minimum value of -2^(63) and a maximum value of 2^(63) 
		 * Use this data type when you need a range of values larger than those provided by int.
 *The long class also contains methods like compareUnsigned to support operations for unsigned long. 
		 * A long has a default value of 0L for fields.
		 * 
		 * float:The float data type is a single-precision 32-bit IEEE 754 floating point.
 * As with the recommendations for byte and short, use a float (instead of double) if you need to save memory in large arrays of floating point numbers. 
		 * A float has a default value of 0.0f for fields.
		 * 
		 * double: The double data type is a double-precision 64-bit IEEE 754 floating point.
		 * Capable of holding fractionals 
		 * A double has a default value of 0.0d for fields.
		 * 
		 * boolean: The boolean data type has only two possible values: true and false.
		 * This data type would be used to track true/false conditions. Helpful for if-then statements and while-loops.
		 * A boolean has a default value of false for fields.
		 * 
		 * char: The char data type is a single 16-bit Unicode character. (Meaning it only can hold a single character). 
		 * It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive)
		 * A char has a default value of '\u0000' for fields.
		 * Use this data type when storing only a single character (such as an initial) is necessary.
		 * 
		 * (Also supported, but not one of primitive):
		 * String: Strings are a sequence of characters.
		 * In the Java programming language, strings are objects.
		 * A String (or any object for that matter) has a default value of null for fields.
		 */
		System.out.println("Greetings, and welcome to RollForBeans!");
		System.out.println("Please select one of the following options using numbers:");
		System.out.println("(1) Character Creator, (2) Dice Roller, (3) Boolean Test, (4) Player1");
		//The above statement lets the user know of the switch statement
		Scanner scan = new Scanner(System.in);
		int beanSwitch = scan.nextInt();
		switch(beanSwitch)  {
		case 1:
		//If the user types '1' at the first prompt,the following lines of code proceed as usual.
		System.out.println("Are you familiar with this program? (Enter Yes or No)"); 
		//A prompt that helps determine if the user should be given "easy" mode
		
		//Scanner scan = new Scanner(System.in);
		scan.nextLine();
		//This scan.nextLine(); is necessary because otherwise the user cannot input string for the next input.
		//Things in the code get tricky when you go from numbers to Strings.
		
		String welcome = scan.nextLine();
		if (welcome.contentEquals("Yes") || (welcome.contentEquals("yes") ) ) { 
		//The .contentEquals method will return true if and only if the string matches what is inside of the ()'s.
			// The conditional operator || tells the program to check for either Yes or yes instead of just Yes before proceeding.
			System.out.println("Ok");
		}
		else if (welcome.contentEquals("No") || (welcome.contentEquals("no") ) ) { 
			//By adding the conditional operator ||, the program will accept No or no as a valid response to check for.
			System.out.println("Oku");
			EzMode.Eazy(scan); //This is a call to the Eazy method, with scan as an argument.
			//Executes the 'eazy' mode method, which is recommended for beginners
			//This route will have more generic and simple questions for users who just want a basic idea about their character.
		}
		break;
		//This break; tells the code not to fall through and keep going with case 1.
		//It basically acts as a STOP sign to the code.
		case 2:
			//Case 2 happens if the user inputs 2, and will take them to the dice rolling method.
		NumberRoller.roll(scan); //Executes the number generation method using scan as the scanner
		break;
		//Same as before for the first break;
		
		case 3: 
			//Case 3, the user inputs 3 at first prompt.
			boolean javaBean = true;
		//A boolean variable can only be true or false.
		//I picked javaBean because it sounded funny to me.
		while (javaBean == true) {
		System.out.println("Solve the quik mafs:");	
		System.out.println("2 + 2 = ?");	
		int solution = scan.nextInt();
		if (solution == 4) {
		javaBean = false;	
		}
		else if (solution != 4) {
			//The ! in the above else if statement means not.
			//So this means the code checks if solution is NOT 4, and does the following:
		System.out.println("Try again!?!");	
		}
		//The above while loop is a fun little test to make sure users can get out of the loop.
		//In the future this might be expanded upon with more puzzles.
		}
	
		int a = 78;
		int b = 6;
		int minVal = (a < b) ? a : b;
		System.out.println("The smaller value is: " + minVal);
		
		//The ? is called a ternary operator.
		//It can act as an alternative to the Java if/then/else syntax.
		//It is also special because it can be used on the right hand side of Java statements.
		//So in this ? then statement, it should print b, since 78 < 6.
		
		double peanut = 2.7;
		int peaPod = (int)peanut;
		//The above statement is 'casting' the variable down into type int.
		//To 'cast' means to go from one data type to another.
		//In this case, a variable of type int cannot have a decimal point, and so it will be rounded down to a full number.
		//Even though 2.7 is CLOSER to 3, the int type simply reads the 2 and does not hold the decimal value.
	//It is also possible to cast variables up to a bigger value, sometimes called 'promotion.'
		System.out.println("peaPod's value is: " + peaPod);
		
		String peppyPizza = "Pepperoni";
		String bestPizza = "Cheese";
		System.out.println(peppyPizza.compareTo(bestPizza) );
		//The compareTo() method compares the given string with current string lexicographically.
		//It returns a positive number, a negative number, or 0.
		//Since grossPizza is lexicographically greater than bestPizza, it returns a positive number.
		//This positive number is the difference of the character values.
		//If it was written as bestPizza.compareTo(grossPizza) the value would be negative, but still the same value.
		//If the two strings are equal, then 0 is returned.
		if (bestPizza == peppyPizza) {
			//Using == in this case checks to see if the two operands are the same object.
			//If you wanted to compare strings (to see if they contain the same characters),
			//You need to compare the strings using .equals
			System.out.println(peppyPizza + "is the more popular choice.");
		}
		break;
		
		case 4: 
			//Case 4, the user inputs 4 at the first prompt.
			Player player1 = new Player();
		player1.setName("Guy"); //This is a call to the Player method, with "Guy" as an argument.
		System.out.println(player1.getName()); //This prints the return value of player1
		
		int numOne = 8;
		int numTwo = 4;
		int numThree = 2;
		int numFour = 3;
		
		int summer = numOne + numTwo;
		System.out.println("The sum is: " + summer); //Prints the sum of numOne and numTwo
		int minusLinus = numOne - numFour;
		System.out.println("The difference is: " + minusLinus);
		//Prints the difference of numOne and numFour.
		int timeRuns = numOne * numThree;
		System.out.println("The product is: " + timeRuns);
		//Prints the product of numOne times numThree
		int atomSplitter = (numTwo / numThree);
		System.out.println("The quotient is: " + atomSplitter);
		//Prints the quotient of numTwo divided by numThree.
		int meanRemains = (numOne % 5);
		System.out.println("The remainder is: " + meanRemains);
		//Prints the remainder of numOne divided by 5.
		numFour++;
		//Adds 1 to numFour after this line
		System.out.println("numFour is now: " + numFour);
		//++numFour;
		//Adds 1 to numFour, but it is before the line finishes.
		int levelDown = numFour--;
		//Subtracts 1 from numFour, but only after the line finishes.
		System.out.println("numFour lost to " + levelDown + ", and is now: " + numFour);
		int coolDude = 88;
		coolDude += levelDown;
		System.out.println("coolDude looks like this:" + coolDude);
		//Using += in this case is equivalent to saying coolDude = coolDude + levelDown.
		//If coolDude and levelDown were different types, then the behavior of the two statements differs due to the rules of language.
		//A neat little treat is that you can do a similar thing to +=, with operations such as -=, *=, /=, or even |=.
		
		System.out.println("A comment about operator prescedence will be below this line");
/* Precedence means being considered more important than something else; priority in importance.
 * So in this case it means the priority that the code places on an operator in an expression. 
 * Operators with higher precedence are evaluated before operators with relatively lower precedence.
 * When operators with the same precedence appear in the same expression, a rule must govern which is evaluated first.
 * All binary operators except for the assignment operators are evaluated from left to right.
 * Assignment operators are evaluated right to left.
 */
		
		final int BEANDESTINY;
	//A variable with the final keyword cannot have its value modified. It becomes a constant.
//This also means you must initialize a final variable.
//It is good practice to represent final variables in all uppercase, using underscore to separate words. (According to geeksforgeeks.org)
		//A final variable can only be initialized once, either via an initializer or an assignment statement.
		Random yourScore = new Random();
		BEANDESTINY = yourScore.nextInt(9421);
		System.out.println("Your score is: " + BEANDESTINY + ". Try for a high score!");
		//Gives the user a random score upon reaching the end of the program.
		//Later, this will be assigned a real variable with real weight.
		
		System.out.println("[\t" + Math.PI + "\t]"); //Prints Math.PI, which shall be considered a test variable for this program.
		// The '\t' is an escape sequence for strings, and in this case it creates a tab space when output
		System.out.println("If (PI) is printed above this line, things are going swell!"); //This is a test statement! That should always appear at the end to confirm that everything is running right.
		
		scan.close();
		}
	}
}
		/*
		int num1 = 5;
		int num2 = 10;
		int sum = num1 + num2;
		int num3 = 8;
		
		//sum = sum + num3;
		sum += num3;
		
		sum++;
		System.out.println(sum);
		System.out.println(sum++);
		System.out.println(sum);
		System.out.println(++sum);
		System.out.println(sum);
		
		double quotient = (double)num2 / num3;
		
		System.out.println(quotient);
		
		This section was used to test the +, ++, and / operators
		*/
		
		
		/*
		Player player1 = new Player();
		player1.setName("Guy");
		System.out.println(player1.getName());
		*/


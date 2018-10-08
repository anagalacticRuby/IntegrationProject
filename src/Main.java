//Nicholas Hansen
//This program will be made to help people with DnD character sheets, dice rolls, and encounter simulations

//import java.util.Random;
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
		 * A short has a default value of 0 for fields.
		 * 
		 * int:
		 * An int has a default value of 0 for fields.
		 * 
		 * long:
		 * A long has a default value of 0L for fields.
		 * 
		 * float:
		 * A float has a default value of 0.0f for fields.
		 * 
		 * double: Capable of holding fractionals 
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
		 * String: 
		 * A String (or any object for that matter) has a default value of null for fields.
		 * 
		 * 
		 * 
		 */
		System.out.println("Greetings, and welcome to RollForBeans!");

		System.out.println("Are you familiar with this program? (Enter Yes or No)"); //A prompt that helps determine if the user should be given "easy" mode

		
		Scanner scan = new Scanner(System.in);
		String welcome = scan.nextLine();
		if (welcome.equals("Yes") || (welcome.equals("yes") ) ) { // The conditional operator || tells the program to check for either Yes or yes instead of just Yes before proceeding.
			System.out.println("Ok");
			
		}
		else if (welcome.equals("No") || (welcome.equals("no") ) ) { //By adding the conditional operator ||, the program will accept No and no as a valid response to check for
			System.out.println("Oku");
			//EzMode.Eazy(); /*Executes the 'eazy' mode method, which is recommended for beginners
			//This route will have more generic and simple questions for users who just want a basic idea about their character.			
			
			//
		}
		//System.out.println(welcome);
		
		//NumberRoller.roll(); //Executes the number generation method
		
		System.out.println("[\t" + Math.PI + "\t]"); //Prints Math.PI, which shall be considered a test variable for this program.
		System.out.println("If (PI) is printed above this line, things are going swell!"); //This is a test statement! That should always appear at the end to confirm that everything is running right.
		
		scan.close();
		
		
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
	
		
		/*
		System.out.println("Please enter the number of sides on your dice");
		Scanner fairGame = new Scanner(System.in);
		int beanRoll = fairGame.nextInt();
		Random rndNum = new Random(); //Creates a random object, assigned to rndNum variable
		int randomNum = rndNum.nextInt(beanRoll) + 1;
		System.out.println("The result is:" + randomNum); //Prints result
		fairGame.close();
		
		*/

		
		/* Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a description");
		String description1 = scan.nextLine();
		
		System.out.println("The description is " + description1);
		scan.close(); */
		 
	}
	
}

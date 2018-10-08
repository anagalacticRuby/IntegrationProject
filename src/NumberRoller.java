import java.util.Random;
import java.util.Scanner;

public class NumberRoller {
	
	public static void roll() {	
	
		printRollWelcome(); //Welcome prompt for the number roller
		beanRolls();
		
	}
	
	public static void printRollWelcome() {
	System.out.println("Please enter the number of sides on your dice");
	System.out.println("The following number of sides are available to pick from: 4, 6, 8, 10, 12, and 20"); //Tells user what side amounts are accepted, doesn't tell them about the hidden one
	} //closes RollWelcome
	public static void beanRolls() {
		
		Scanner fairGame = new Scanner(System.in); //allows user to input
		int beanRoll = fairGame.nextInt();
		if(beanRoll == 4) { //Rolls a 4-sided dice
			Random deeFour = new Random();
			int fourSides = deeFour.nextInt(4) + 1;
			System.out.println("The result is:" + fourSides);
		}
		else if (beanRoll == 6) { //Rolls a 6-sided dice
			Random deeSix = new Random();
			int sixSides = deeSix.nextInt(6) + 1;
			System.out.println("The result is:" + sixSides);
		}
		else if (beanRoll == 8) { //Rolls an 8-sided dice
			Random deeEight = new Random();
			int eightSides = deeEight.nextInt(8) + 1;
			System.out.println("The result is:" + eightSides);
		}
		else if(beanRoll == 10) { //Rolls a 10-sided dice
			Random deeTen = new Random();
			int tenSides = deeTen.nextInt(10) + 1;
			System.out.println("The result is:" + tenSides);
		}
		else if (beanRoll == 12) { //Rolls a 12-sided dice
			Random deeTwelve = new Random();
			int twelveSides = deeTwelve.nextInt(12) + 1;
			System.out.println("The result is:" + twelveSides);
		}
		else if (beanRoll == 20) { //Rolls a 20-sided dice
			Random deeTwenty = new Random();
			int twentySides = deeTwenty.nextInt(20) +1;
			System.out.println("The result is:" + twentySides);
		}
		else { //If the user doesn't enter any of the specified numbers for sides of dice this "easter egg" happens
			Random diceTry = new Random();
			int snakeEyes = diceTry.nextInt(100) + 1;
			if (snakeEyes > 50) {
				System.out.println("Congratulation, High-Roller!");
			}
			else {
				System.out.println("Nice low roll.");
			}
			
			System.out.println("Your result is:" + snakeEyes);
			System.out.println("There are other secrets to be found!");
		}

		fairGame.close(); //closes the number rolling scanner
	}

}


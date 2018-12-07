
import java.util.Random;
import java.util.Scanner;

/**
 * This class houses all things related to dice rolling.
 * 
 * @author Nicholas Hansen
 *
 */
public class NumberRoller {

  /**
   * This method calls the welcome prompt and the dice rolling method.
   * 
   * @param scan The Scanner from main method, so users can input numbers
   */
  public static void roll(Scanner scan) {

    printRollWelcome(); // Welcome prompt for the number roller
    diceRoll(scan);

  }

  /**
   * Just a basic method that prints a welcome prompt for the user. Also tells the user how to
   * access the number generators.
   */
  public static void printRollWelcome() {
    System.out.println("Please enter the number of sides on your dice");
    System.out.println(
        "The following number of sides are available to pick from: 4, 6, 8, 10, 12, and 20");
    // Tells user what side amounts are accepted,
    // doesn't tell them about the hidden one
  } // closes RollWelcome

  /**
   * A method that actually does the dice rolling for the user after they give input.
   * 
   * @param fairGame A reskin of the scanner from the main method, to allow input.
   */
  public static void diceRoll(Scanner fairGame) {
    // The Scanner parameter with fairGame tells the code to use the scan
    // Scanner but treats the name as fairGame.
    // The reason this is relevant, is because it saves me from rewriting all
    // the lines of code.
    int beanRoll = 0;
    boolean weightedDice = true;
    while (weightedDice == true) {
      try {
        beanRoll = fairGame.nextInt();
        weightedDice = false;
      } catch (Exception thatSix) {
        System.out.println("Try again, and input a number this time.");
        System.out.println("Input your number twice to confirm it.");
        fairGame.nextLine();
        beanRoll = fairGame.nextInt();
      }
    }
    // The above loop makes sure the user inputs a number so no scary errors occur.
    // int beanRoll = fairGame.nextInt();
    if (beanRoll == 4) { // Rolls a 4-sided dice
      Random deeFour = new Random();
      int fourSides = deeFour.nextInt(4) + 1;
      System.out.println("The result is: " + fourSides);
    } else if (beanRoll == 6) { // Rolls a 6-sided dice
      Random deeSix = new Random();
      int sixSides = deeSix.nextInt(6) + 1;
      System.out.println("The result is: " + sixSides);
    } else if (beanRoll == 8) { // Rolls an 8-sided dice
      Random deeEight = new Random();
      int eightSides = deeEight.nextInt(8) + 1;
      System.out.println("The result is: " + eightSides);
    } else if (beanRoll == 10) { // Rolls a 10-sided dice
      Random deeTen = new Random();
      int tenSides = deeTen.nextInt(10) + 1;
      System.out.println("The result is: " + tenSides);
    } else if (beanRoll == 12) { // Rolls a 12-sided dice
      Random deeTwelve = new Random();
      int twelveSides = deeTwelve.nextInt(12) + 1;
      System.out.println("The result is: " + twelveSides);
    } else if (beanRoll == 20) { // Rolls a 20-sided dice
      Random deeTwenty = new Random();
      int twentySides = deeTwenty.nextInt(20) + 1;
      System.out.println("The result is: " + twentySides);
    } else { // If the user doesn't enter any of the specified numbers for
      // the sides of dice, this "easter egg" happens
      Random diceTry = new Random();
      int snakeEyes = diceTry.nextInt(100) + 1;
      if (snakeEyes > 50) {
        // Because snakeEyes is of type int, .equals is not used.
        System.out.println("Congratulation, High-Roller!");
      } else {
        System.out.println("Nice low roll.");
      }

      System.out.println("Your result is: " + snakeEyes);
      System.out.println("There are other secrets to be found!");

    }


    /*
     * System.out.println("Enter the number of sides on your dice"); int rollBeans =
     * fairGame.nextInt(); Random rndNum = new Random(); //Creates a random object, assigned to
     * rndNum variable int randomNum = rndNum.nextInt(rollBeans) + 1; System.out.println(randomNum);
     * These lines above were meant to test if it was possible to use user-input as variables for a
     * random class. And it turns out that it does work. But for now, I don't want to basically undo
     * most of my previous work.
     */

  }

}


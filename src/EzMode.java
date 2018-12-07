
import java.util.Scanner;

/**
 * A class that inherits from the Questionnaire class. The difference here is that the questions are
 * more broad within this class.
 * 
 * @author Nicholas Hansen
 *
 */
public class EzMode {

  /**
   * This is the more brief and easier to fill out questionnaire method for character creation. The
   * input from the user is printed in a formatted manner at the very end.
   * 
   * @param peazy This is the scanner from the main method. Not much else to say other than it has a
   *        different name here.
   * @author Nicholas Hansen
   */
  public static void eazy(Scanner peazy) {
    // Eazy is the header, with peazy as the parameter.
    System.out.println("We'll go eazy on you since you're new to the program.");
    System.out.println("The following questions will help you with character creation.");
    // These lines tell the user what is going on
    System.out.println("1. Please enter your Character's name:");
    // First Question
    String[] tableQuestions = new String[10];
    tableQuestions[0] = "Name: ";
    // Used in the print statement at the end.
    String[] characterAnswers = new String[10];
    // Creates an array to store all of the user's inputs to be printed at the end
    String charName = peazy.nextLine();
    while (charName.isEmpty()) {
      charName = peazy.nextLine();
    }

    if (charName.equalsIgnoreCase("Bean")) {
      // No semicolons for if statements
      // The .equalsIgnoreCase method tells the code to accept what is inside of the ()'s
      // But it will accept the string regardless of the letters' case.
      // So this means this statement will accept Bean or bean and then proceed
      // with the if statement.
      System.out.println("You must really think you're clever, huh.");
      System.out.println("Try rolling a 100-sided dice.");
      // An easter egg message that directs users to the dice rolling method.
    }
    characterAnswers[0] = charName;
    // Puts the name the user input into the array of answers.

    System.out.println("2. " + charName + "'s Gender? Accepted values: (M/F/O)");
    String stringGender = peazy.nextLine();
    final char charGender = stringGender.charAt(0);
    // This is a char because it doesn't need to be anything more
    String tableGender = String.valueOf(charGender);
    // We need to convert the char BACK to a String in order to put it into the array.
    characterAnswers[1] = tableGender;
    // Assigning the fresh string into the array of answers.
    tableQuestions[1] = "Gender: ";
    // Used in the print statement at the end.
    peazy.nextLine();
    System.out.println("3. What is " + charName + "'s Race?");
    String charRace = peazy.nextLine();
    while (charRace.isEmpty()) {
      charRace = peazy.nextLine();
    }
    characterAnswers[2] = charRace;
    // Puts the character's race into the array of answers
    tableQuestions[2] = "Race: ";
    // Used in the print statement at the end
    System.out.println("4. How tall is " + charName + "? (Assume units are" + " in feet. Type "
        + "numbers please.)");
    double charHeight = 0d;
    boolean notADouble = true;
    while (notADouble == true) {
      try {
        charHeight = peazy.nextDouble();
        notADouble = false;
      } catch (Exception lemons) {
        System.out.println("Letters aren't accepted.");
        peazy.nextLine();
        // This try-catch block makes sure the user inputs numbers only
        // Because doubles do not accept letters.
      }
    }
    // This is a double because you can have decimal places of feet/meters
    String sheetHeight = String.valueOf(charHeight);
    // Converts the height double into a string for the array of answers
    characterAnswers[3] = sheetHeight;
    // Puts the new string into the array of answers
    // Note this is done outside the try-catch so that no loops occur
    tableQuestions[3] = "Height: ";
    peazy.nextLine();
    System.out.println("5. Where does " + charName + " prefer to be in the heat of battle?");
    String charPosition = peazy.nextLine();
    while (charPosition.isEmpty()) {
      // The .isEmpty() method returns 'true' if the string attached is empty.
      // In other words, this while loop prevents the user from proceeding until
      // they input something.
      // Later I will add while loops to all of the input spots to ensure the user inputs something.
      charPosition = peazy.nextLine();
    }
    characterAnswers[4] = charPosition;
    // Puts the answer into the array of answers
    tableQuestions[4] = "Battle Position: ";
    System.out.println("6. Does " + charName + " practice magic?");
    String charMagic = peazy.nextLine();
    characterAnswers[5] = charMagic;
    if (charMagic.equalsIgnoreCase("yes")) {
      System.out.println("6b. What kind(s) of magic?");
      String charMagicKind = peazy.nextLine();
      characterAnswers[6] = charMagicKind;
    } else if (charMagic.equalsIgnoreCase("No")) {
      characterAnswers[6] = "N/A";
    } else {
      characterAnswers[6] = "N/A";
    }
    tableQuestions[5] = "Magic?: ";
    tableQuestions[6] = "Type of Magic? ";
    // The above two statements are used for the magic question.
    // We also need to take in consideration if the user says no to question 6.
    System.out
        .println("7. What kinds of weapons does " + charName + " prefer? Ranged, Magic, or melee?");
    String charWeapon = peazy.nextLine();
    characterAnswers[7] = charWeapon;
    tableQuestions[7] = "Weapon preference: ";
    System.out.println(
        "8. What is " + charName + "'s wealth status? Are they poor or rich? Middle class?");
    String charWealth = peazy.nextLine();
    characterAnswers[8] = charWealth;
    tableQuestions[8] = "Wealth status: ";
    System.out.println("9. What does " + charName + " despise the most in their life?");
    String charAbhor = peazy.nextLine();
    characterAnswers[9] = charAbhor;
    tableQuestions[9] = "Abhors: ";
    System.out.println("Alright, that's everything. Your answers will be printed nicely below.");
    // A fancy print statement to denote the end of the questions.
    System.out.println("======={ Your Character, " + charName + "! }=====");
    int t = 0;
    while (t < 10) {
      int q = 0;
      while (q < 10) {
        System.out.printf("%-30s %1s\n", tableQuestions[q], characterAnswers[t]);
        // The print statement is formatted so everything is aligned to look neat and clean.
        q++;
        t++;
      }
    }
    // While loops are a bit better here, since we don't want everything to print multiple times.
    System.out.println("===={ Impressed? }=====");
  }
}

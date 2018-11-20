// Nicholas Hansen
// This program will be made to help people with DnD character sheets, dice 
//rolls, and encounter
// simulations

// import java.util.Random;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /*
     * List of Java Data Types (Primitive): byte: An 8-bit signed two's 
     * complement integer. It has a range of -128 to 127 (inclusive). 
     * It is useful for saving memory in large arrays where the
     * memory savings actually matters. 
     * They can also be used in place of int where the limited
     * range of possible values helps keep the code more tame. 
     * A variable's limited range may also be utilized as a means of 
     * documentation. A byte has a default value of 0 for fields.
     * short: 
     * A 16-bit signed two's complement integer, which is larger than a byte. 
     * It has a range of -2^31 to (2^31)-1. 
     * As with byte, the same guidelines apply: you can use a short to save
     * memory in large arrays, in situations where the memory savings actually 
     * matters. A short has a default value of 0 for fields.
     * 
     * int: 
     * By default, the int data type is a 32-bit signed two's complement integer
     * , which has a
     * minimum value of -2^31 and a maximum value of 2^(31)-1. 
     * In Java SE 8 and later, you can use the int data type to represent an 
     * unsigned 32-bit integer, which has a minimum value of 0 and
     * a maximum value of 232-1. An int has a default value of 0 for fields. 
     * Use the Integer class
     * to use int data type as an unsigned integer.
     * 
     * long: 
     * The long data type is a 64-bit two's complement integer. 
     * The signed long has a minimum value of -2^(63) and a maximum value of 
     * 2^(63) Use this data type when you need a range of
     * values larger than those provided by int. 
     * The long class also contains methods like compareUnsigned to support 
     * operations for unsigned long. A long has a default value of 0L for
     * fields.
     * 
     * float:The float data type is a single-precision 32-bit IEEE 754 floating 
     * point. As with the recommendations for byte and short, use a float 
     * (instead of double) if you need to save memory in large arrays of 
     * floating point numbers. A float has a default value of 0.0f for fields.
     * 
     * double: 
     * The double data type is a double-precision 64-bit IEEE 754 floating point
     * .Capable of holding fractionals A double has a default value of 0.0d for 
     * fields.
     * 
     * boolean: 
     * The boolean data type has only two possible values: true and false. 
     * This data type would be used to track true/false conditions. 
     * Helpful for if-then statements and while-loops.
     * A boolean has a default value of false for fields.
     * 
     * char: 
     * The char data type is a single 16-bit Unicode character. 
     * (Meaning it only can hold a single character). 
     * It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff'
     * (or 65,535 inclusive) A char has a default value of '\u0000' for fields.
     * Use this data typewhen storing only a single character 
     * (such as an initial) is necessary.
     * 
     * (Also supported, but not one of primitive): 
     * String: Strings are a sequence of characters. In
     * the Java programming language, strings are objects. 
     * A String (or any object for that matter)
     * has a default value of null for fields.
     */
    System.out.println("Greetings, and welcome to RollForBeans!");
    System.out.println("Please select one of the following options "
        + "using numbers:");
    System.out.println("(1) Character Creator, (2) Dice Roller, "
        + "(3) Boolean Test, (4) Player1");
    System.out.println("(5) Array Showcase, (6) Polymorphism Example, "
        + "(7) 2D Arrays and ArrayList.");
    // The above statement lets the user know of the switch statement
    Scanner scan = new Scanner(System.in);
    int beanSwitch = 0;
    boolean notAnInteger = true;
    while (notAnInteger == true) {
      try {
        beanSwitch = scan.nextInt();
        notAnInteger = false;
      } catch (InputMismatchException ex) {
        System.out.println("Please input a number.");
        scan.nextLine(); 
        // This line clears the scanner so no more errors happen

      }

    }
    switch (beanSwitch) {
      case 1:
        // If the user types '1' at the first prompt,the following 
        //lines of code proceed as usual.
        System.out.println("Are you familiar with this program? "
            + "(Enter Yes or No)");
        // A prompt that helps determine if the user should be given "easy" mode


        scan.nextLine();
        // This scan.nextLine(); is necessary because otherwise the user cannot
        //input string for the next input.
        // Things in the code get tricky when you go from numbers to Strings.

        String welcome = scan.nextLine();

        if (welcome.contentEquals("Yes") || (welcome.contentEquals("yes"))
            || welcome.contentEquals("1")) {
          // The .contentEquals method will return true if and only if the 
          //string matches what is
          // inside of the ()'s.
          // The conditional operator || tells the program to check for either 
          //Yes or yes instead of just Yes before proceeding.
          System.out.println("Ok");
        } else if (welcome.contentEquals("No") || (welcome.contentEquals("no"))
            || welcome.contentEquals("0")) {
          // Added additional input to accept in case the user types 0.
          // By adding the conditional operator ||, the program will accept 
          //No or no as a valid
          // response to check for.
          System.out.println("Oku");
          EzMode.Eazy(scan); 
          // This is a call to the Eazy method, with scan as an argument.
          // Executes the 'eazy' mode method, which is recommended for beginners
          // This route will have more generic and simple questions for users 
          //who just want a basic idea about their character.
        } else {
          EzMode.Eazy(scan);
          // This line of code tells the program to default to the "no" response
          //.
          // Should the user type anything but no or yes.
          // This prevents the user from "halting" the program when they input 
          //a number at welcome.
        }
        break;
  // This break; tells the code not to fall through and keep going with case 1.
      // It basically acts as a STOP sign to the code.
      case 2:
        // Case 2 happens if the user inputs 2, 
        //and will take them to the dice rolling method.
        NumberRoller.roll(scan); 
        // Executes the number generation method using scan as the scanner
        break;
      // Same as before for the first break;

      case 3:
        // Case 3, the user inputs 3 at first prompt.
        boolean javaBean = true;
        // A boolean variable can only be true or false.
        // I picked javaBean because it sounded funny to me.
        while (javaBean == true) {
          System.out.println("Solve the quik mafs:");
          System.out.println("2 + 2 = ?");
          boolean maffs = true;
          int solution = 0;
          do {
            try {
              solution = scan.nextInt();
              maffs = false;
            } catch (Exception NOTANUMBER) {
              System.out.println("Please input a number. Letters aren't "
                  + "accepted.");
              scan.nextLine();

            }
          } while ((maffs == true));
          // This do-while loop acts as a kiddie fence
          // To make sure the user inputs a number to proceed.
          if (solution == 4) {
            javaBean = false;
          } else if (solution != 4) {
            // The ! in the above else if statement means not.
            // So this means the code checks if solution is NOT 4, 
            //and does the following:
            System.out.println("Try again!?!");
          }
          // The above while loop is a fun little test to make sure users can 
          //get out of the loop.
          // In the future this might be expanded upon with more puzzles.
        }

        int a = 78;
        int b = 6;
        int minVal = (a < b) ? a : b;
        System.out.println("The smaller value is: " + minVal);

        // The ? is called a ternary operator.
        // It can act as an alternative to the Java if/then/else syntax.
        // It is also special because it can be used on the right hand side of 
        //Java statements.
        // So in this ? then statement, it should print b, since 78 < 6.

        double peanut = 2.7;
        int peaPod = (int) peanut;
        // The above statement is 'casting' the variable down into type int.
        // To 'cast' means to go from one data type to another.
        // In this case, a variable of type int cannot have a decimal point, 
        //and so it will be rounded down to a full number.
        // Even though 2.7 is CLOSER to 3, the int type simply reads the 2 and 
        //does not hold the decimal value.
        // It is also possible to cast variables up to a bigger value, 
        //sometimes called 'promotion.'
        System.out.println("peaPod's value is: " + peaPod);

        String peppyPizza = "Pepperoni";
        String bestPizza = "Cheese";
        System.out.println(peppyPizza.compareTo(bestPizza));
        // The compareTo() method compares the given string with current
        // string lexicographically.
        // It returns a positive number, a negative number, or 0.
        // Since grossPizza is lexicographically greater than bestPizza,
        // it returns a positive number.
        // This positive number is the difference of the character values.
        // If it was written as bestPizza.compareTo(grossPizza)
        // the value would be negative, but still the same value.
        // If the two strings are equal, then 0 is returned.
        if (bestPizza == peppyPizza) {
          // Using == in this case checks to see if the two operands are the
          // same object.
          // If you wanted to compare strings
          // (to see if they contain the same characters),
          // You need to compare the strings using .equals
          System.out.println(peppyPizza + "is the more popular choice.");
        }
        break;

      case 4:
        // Case 4, the user inputs 4 at the first prompt.
        Player player1 = new Player();
        player1.setName("Guy");
        // This is a call to the Player method, with "Guy" as an argument.
        System.out.println(player1.getName());
        // This prints the return value of player1

        int numOne = 8;
        int numTwo = 4;
        int numThree = 2;
        int numFour = 3;

        int summer = numOne + numTwo;
        System.out.println("The sum is: " + summer);
        // Prints the sum of numOne and numTwo
        int minusLinus = numOne - numFour;
        System.out.println("The difference is: " + minusLinus);
        // Prints the difference of numOne and numFour.
        int timeRuns = numOne * numThree;
        System.out.println("The product is: " + timeRuns);
        // Prints the product of numOne times numThree
        int atomSplitter = (numTwo / numThree);
        System.out.println("The quotient is: " + atomSplitter);
        // Prints the quotient of numTwo divided by numThree.
        int meanRemains = (numOne % 5);
        System.out.println("The remainder is: " + meanRemains);
        // Prints the remainder of numOne divided by 5.
        numFour++;
        // Adds 1 to numFour after this line
        System.out.println("numFour is now: " + numFour);
        // ++numFour;
        // Adds 1 to numFour, but it is before the line finishes.
        int levelDown = numFour--;
        // Subtracts 1 from numFour, but only after the line finishes.
        System.out.println("numFour lost to " + levelDown + ", and is now: " + 
        numFour);
        int coolDude = 88;
        coolDude += levelDown;
        System.out.println("coolDude looks like this:" + coolDude);
        /*
         * Using += in this case is equivalent to saying 
         * coolDude = coolDude + levelDown. 
         * If coolDude and levelDown were different types, 
         * then the behavior of the two statements
         * differs due to the rules of language. 
         * A neat little treat is that you can do a similar thing to +=, 
         * with  operations such as -=,*=, /=, or even |=.
         */

        System.out.println("A comment about operator prescedence will be below "
        + "this line");
        /*
         * Precedence means being considered more important than something else;
         * priority in importance. 
         * So in this case it means the priority that the code places on an 
         * operator in an expression. 
         * Operators with higher precedence are evaluated before operators with
         * relatively lower precedence. 
         * When operators with the same precedence appear in the same
         * expression, a rule must govern which is evaluated first. 
         * All binary operators except for
         * the assignment operators are evaluated from left to right. 
         * Assignment operators are evaluated right to left.
         */
        break;
      case 5:
        Character playerOne = new Character();
        playerOne.print();

        CollegeClass cop2006201808 = new CollegeClass();
        String[] phyRoster = {"Zack"};
        CollegeClass phy2048c201808 = new CollegeClass("Physics I", 4, 
            phyRoster);
        cop2006201808.printInfo();

        SLClass myClass = new SLClass();
        myClass.printInfo();

        int[] arrayTests = new int[7];
        arrayTests[0] = 30; // Arrays start at 0, not at 1.
        arrayTests[1] = 45;
        arrayTests[2] = 23;
        arrayTests[3] = 67;
        arrayTests[4] = 200;
        arrayTests[5] = 34;
        arrayTests[6] = 77;
        // if you do not declare a value for an array element, it will have
        // A default value of 0 in Java.
        int arrayMin = arrayTests[0];
        int arrayIndex = 0;
        int arraySum = 0;
        for (int i = 0; i < arrayTests.length; i++) {
          if (arrayTests[i] < arrayTests[0]) {
            arrayMin = arrayTests[i];
            arrayIndex = i;
            // This if statement searches for the lowest value in the array
            // And then assigns it to arrayMin
            // It does this by checking if any values are lower than the value
            // at index 0.
            // After it finds the lowest value, this if statement also sets up
            // The index variable that will be used shortly after.
            // So that way we can tell which index the lowest value was found at
          }
          arraySum += arrayTests[i];
          System.out.println("The minimum value of the array is: " + arrayMin);
          // This line prints the lowest value of the array
          System.out.println("The index of the array is: " + arrayIndex);
          // This for loop prints each of the values inside the array.
          // Starting from index 0 to index 6.

        }
        System.out.println("The sum of all the numbers in this array is: " +
        arraySum);
        System.out.println("A new array starts below, to avoid confusion.");
        int[] intervals = {11, 22, 30, 423, 24};
        for (int printValue : intervals) {
          if (printValue < 20) {
            System.out.println("Any values less than twenty are skipped.");
            continue;
            // continue causes the loop to immediately jump to the
            // next iteration of the loop.
            // So when the for-loop finds an array index with a value less than
            //20,
            // It will "skip" printing that number and go right to the next one.
          }
          System.out.println(printValue);
        }
        System.out.println("A new array starts below:");
        int linedFries[] = {23, 56, 33, 68, 90, 45,};
        for (int j = 0; j < linedFries.length; j++) {
          System.out.println(linedFries[j]);
          if (linedFries[j] == 68) {
            System.out.println("Sorry but we ran out of fries.");
            break;
            // This break will cause the loop to immediately stop once the
            // for-loop comes across a value of 68.
          }
        }
        break;
      case 7:
        System.out.println("Here's where two dimensional arrays start.");
        int[][] scrimzorg = new int[3][5];
        // 2D integer array with 3 rows and 5 columns
        int[][] gottaSleep = new int[2][4];
        gottaSleep[1][0] = 34; // assigned at row 2 column 1
        gottaSleep[1][1] = 23;
        gottaSleep[1][2] = 67;
        gottaSleep[1][3] = 334;
        gottaSleep[0][0] = 64;
        gottaSleep[0][1] = 504;
        // 2D arrays ALSO start at 0 for both columns AND rows
        gottaSleep[0][2] = 303;
        gottaSleep[0][3] = 3466;
        int sleepIndex = gottaSleep[0][0];
        int sleepRow = 0;
        int sleepColumn = 0;
        for (int z = 0; z < gottaSleep.length; z++) {
          for (int party = 0; party < gottaSleep[z].length; party++) {
            if (gottaSleep[z][party] < gottaSleep[0][0]) {
              sleepIndex = gottaSleep[z][party];
              sleepRow = z;
              sleepColumn = party;
              // This if statement searches for the lowest value of the 2D array
              // And records the row and column of it.
            }
            // gottaSleep[z][party] = z + 1;
          }
        }
        System.out.println("The lowest value is in index: " + sleepIndex);
        System.out.println("In Row: " + sleepRow + " And column: " + 
        sleepColumn);
        // -----------------------------MORE STUFF
        System.out.println("Below here is the ArrayList Stuff.");
        ArrayList<String> myLisp = new ArrayList<String>();
        myLisp.add("Add whatever.");
        for (int iterate = 0; iterate < myLisp.size(); iterate++) {
          System.out.println("Index:");
        }

        break;
      case 6:
        Fries yourSide = new Fries();
        Burger yourMeal = new Burger();
        PolyMorphismExample[] happyMeal = {yourSide, yourMeal};
        for (PolyMorphismExample yourDinner : happyMeal) {
          yourDinner.showFood();
          yourDinner.imagineFood();
          // This example also uses the super method!!!!
          // SUPER COOL!!!!!!!
          // @SuperCoolGuy
        }
        // The above lines are a simple example of polymorphism.
        // Feel free to check out the associated classes.



        final int BEANDESTINY;
        // A variable with the final keyword cannot have its value modified.
        // It becomes a constant.
        // This also means you must initialize a final variable.
        // It is good practice to represent final variables in all uppercase,
        // using underscore to
        // separate words. (According to geeksforgeeks.org)
        // A final variable can only be initialized once, either via an
        // initializer or an assignment
        // statement.
        Random yourScore = new Random();
        BEANDESTINY = yourScore.nextInt(9421);
        System.out.println("Your score is: " + BEANDESTINY + ". Try for a high "
            + "score!");
        // Gives the user a random score upon reaching the end of the program.
        // Later, this will be assigned a real variable with real weight.

        System.out.println("[\t" + Math.PI + "\t]");
        // Prints Math.PI, which shall be considered a
        // test variable for this program.
        // The '\t' is an escape sequence for strings, and in this case it
        // creates a tab space when output
        System.out.println("If (PI) is printed above this line, " + "things are"
        + " going swell!");
        // This is a test statement! That should always appear at the end to
        // confirm that everything is running right.

        scan.close();
    }
  }
}


//Nicholas Hansen
//This program will be made to help people with DnD character sheets, dice rolls, and encounter simulations

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Greetings, and welcome to RollForBeans!");
		 
		System.out.println("Are you familiar with this program? (Enter Yes or No)"); //prompt
		//String wel = "test";
		//String input = JOptionPane.showInputDialog(wel); // Makes a popup appear with "Type Something" in its text
		
		Scanner scan = new Scanner(System.in);
		String welcome = scan.nextLine();
		if (welcome.equals("Yes") || (welcome.equals("yes") ) ) {
			System.out.println("Ok");
			
		}
		else if (welcome.equals("No") || (welcome.equals("no") ) ) {
			System.out.println("Oku");
		}
		System.out.println(welcome);
		scan.close();
		
		
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
		
		Player player1 = new Player();
		player1.setName("Guy");
		System.out.println(player1.getName());
		
		Random rndNum = new Random();
		int randomNum = rndNum.nextInt(6) + 1;
		System.out.println("Random Number:" + randomNum);
		
		/* Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a description");
		String description1 = scan.nextLine();
		
		System.out.println("The description is " + description1);
		scan.close(); */
		 
	}
	
}

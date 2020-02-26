/**
 * 
 * @author Mahfujur Rahman
 * Created 2.24.2020
 * Description: Pick a number and ask the user to enter a number, if the user enters THE RIGHT NUMBER say Victory 3 times, if user loses say Game Over 3 times
 */
import java.util.Scanner
import.java.util.Random;
public class NumberGuesserCode {
	public static void main(String[]args)
		Scanner scnr = new Scanner(System.in);
	
		System.out.println("In this game you are to guess the correct number.")
		System.out.println("Enter the number you wish to guess between 1 and 20:");
		int userInput = scnr.nextInt();
		int rightNum = 20;
		
		if(userInput == rightNum) {
			system.out.println("Victory! Victory! Victory!");
			
		}
	
		else {
			System.out.println("Game Over! Game Over! Game Over!");
		}
	
				  
	
		
	}
	

}
